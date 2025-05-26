import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyGUI {
    private JFrame frame;
    private JPanel mainPanel;
    private JLabel bossLabel;
    private JLabel questionLabel;
    private JButton[] answerButtons;
    private Boss boss;
    private Player player;
    private ArrayList<Question> questions;
    private Question currentQuestion;
    private Random random = new Random();

    public MyGUI(ArrayList<Question> questions, Player player, Boss boss) {
        this.questions = questions;
        this.player = player;
        this.boss = boss;

        frame = new JFrame("APUSH Study Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.WHITE);

        // Title label
        JLabel titleLabel = new JLabel("APUSH Study Game", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Main panel for dynamic content
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel, BorderLayout.CENTER);

        // Start/Exit buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        JButton startButton = new JButton("Start Game");
        JButton exitButton = new JButton("Exit Game");
        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(e -> showBattleScreen());
        exitButton.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    private void showBattleScreen() {
        mainPanel.removeAll();
        mainPanel.setLayout(new BorderLayout());

        // Boss health label
        bossLabel = new JLabel(boss.toString(), SwingConstants.CENTER);
        bossLabel.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(bossLabel, BorderLayout.NORTH);

        // Question panel
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        questionPanel.setBackground(Color.WHITE);

        questionLabel = new JLabel();
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        questionPanel.add(questionLabel);

        // Answer buttons
        answerButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            JButton btn = new JButton();
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            int idx = i;
            btn.addActionListener(e -> handleAnswer(idx));
            answerButtons[i] = btn;
            questionPanel.add(Box.createVerticalStrut(10));
            questionPanel.add(btn);
        }

        mainPanel.add(questionPanel, BorderLayout.CENTER);

        nextQuestion();

        frame.revalidate();
        frame.repaint();
    }

    private void nextQuestion() {
        if (questions.isEmpty() || !bossIsAlive()) {
            endGame();
            return;
        }
        int idx = random.nextInt(questions.size());
        currentQuestion = questions.remove(idx);

        // Show stimulus/source if present, then the question
        String displayText = "<html>";
        if (currentQuestion.getStimulus() != null && !currentQuestion.getStimulus().isEmpty()) {
            displayText += "<b>Source:</b><br>" + currentQuestion.getStimulus().replace("\n", "<br>") + "<br><br>";
        }
        displayText += currentQuestion.getQuestion() + "</html>";

        questionLabel.setText(displayText);

        String[] choices = currentQuestion.getAnswerChoices();
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(choices[i]);
            answerButtons[i].setEnabled(true);
        }
        bossLabel.setText(boss.toString());
    }

    private void handleAnswer(int idx) {
        String userInput = answerButtons[idx].getText().substring(0, 1); // "A", "B", etc.
        boolean correct = currentQuestion.isCorrect(userInput);
        if (correct) {
            player.attackBoss(boss, true);
            JOptionPane.showMessageDialog(frame, "Correct! You hit the boss!");
        } else {
            JOptionPane.showMessageDialog(frame, "Incorrect! Try the next one.");
        }
        bossLabel.setText(boss.toString());
        nextQuestion();
    }

    private boolean bossIsAlive() {
        return boss.getHealth() > 0;
    }

    private void endGame() {
        mainPanel.removeAll();
        JLabel endLabel = new JLabel(
            bossIsAlive() ? "You lost! Boss survived." : "Congratulations! You defeated the boss!",
            SwingConstants.CENTER
        );
        endLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(endLabel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }
}
