import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class MyGUI {
    private JFrame frame;
    private JPanel mainPanel;
    private ArrayList<Battle> battles;
    private Battle currentBattle;
    private JLabel bossLabel;
    private JTextArea questionLabel;
    private JButton[] answerButtons;
    private Boss boss;
    private Player player;
    private ArrayList<Question> questions;
    private Question currentQuestion;
    private Random random = new Random();

    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String imagePath) {
            try {
                backgroundImage = ImageIO.read(new File(imagePath));
            } catch (IOException e) {
                backgroundImage = null;
            }
            setLayout(new BorderLayout());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    private JPanel buttonPanel;
    private JButton exitButtonTop;

    public MyGUI(ArrayList<Battle> battles) {
        this.battles = battles;

        frame = new JFrame("APUSH Study Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(true);

        BackgroundPanel bgPanel = new BackgroundPanel("src/paperpic.jpg");
        frame.setContentPane(bgPanel);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setOpaque(false);

        JLabel titleLabel = new JLabel("APUSH Study Game", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setOpaque(false);
        topPanel.add(titleLabel, BorderLayout.CENTER);

        frame.add(topPanel, BorderLayout.NORTH);

        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false);
        frame.add(mainPanel, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton startButton = new JButton("Start Game");
        JButton exitButton = new JButton("Exit Game");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(startButton);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(exitButton);
        buttonPanel.add(Box.createVerticalGlue());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;

        mainPanel.add(buttonPanel, gbc);

        startButton.addActionListener(e -> showBattleSelectMenu());
        exitButton.addActionListener(e -> System.exit(0));

        exitButtonTop = new JButton("Exit");
        exitButtonTop.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    private void showBattleSelectMenu() {
        mainPanel.removeAll();
        mainPanel.setLayout(new GridBagLayout());

        JPanel selectPanel = new JPanel();
        selectPanel.setOpaque(false);
        selectPanel.setLayout(new BoxLayout(selectPanel, BoxLayout.Y_AXIS));

        selectPanel.add(new JLabel("Select a Battle:", SwingConstants.CENTER));
        for (Battle battle : battles) {
            JButton btn = new JButton(battle.getName());
            btn.addActionListener(e -> startBattle(battle));
            selectPanel.add(btn);
            selectPanel.add(Box.createVerticalStrut(10));
        }

        mainPanel.add(selectPanel);
        frame.revalidate();
        frame.repaint();
    }

    private void startBattle(Battle battle) {
        this.currentBattle = battle;
        this.questions = new ArrayList<>(battle.getQuestions());
        this.boss = battle.getBoss();
        // Reset boss/player if needed
        showBattleScreen();
    }

    private void showBattleScreen() {
        mainPanel.removeAll();
        mainPanel.setLayout(new BorderLayout());

        JPanel topPanel = (JPanel) frame.getContentPane().getComponent(0);
        topPanel.add(exitButtonTop, BorderLayout.EAST);

        bossLabel = new JLabel(boss.toString(), SwingConstants.CENTER);
        bossLabel.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(bossLabel, BorderLayout.NORTH);

        // Create wrapper panel to hold question panel at the top
        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.setOpaque(false);

        // Question panel with vertical layout
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        questionPanel.setOpaque(false);
        questionPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // top, left, bottom, right
        questionPanel.setMaximumSize(new Dimension(500, Integer.MAX_VALUE)); // prevent horizontal overflow

        wrapperPanel.add(questionPanel, BorderLayout.NORTH); // pin to top

        // Question area
        JTextArea questionArea = new JTextArea();
        questionArea.setFont(new Font("Arial", Font.PLAIN, 16));
        questionArea.setLineWrap(true);
        questionArea.setWrapStyleWord(true);
        questionArea.setEditable(false);
        questionArea.setOpaque(false);
        questionArea.setFocusable(false);
        questionArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        questionArea.setBorder(null);
        questionArea.setRows(3);

        this.questionLabel = questionArea;
        questionPanel.add(questionArea);

        // Answer buttons
        answerButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            JButton btn = new JButton();
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(500, 40)); // Limit width to 500px
            btn.setPreferredSize(new Dimension(500, 40)); // Preferred width
            int idx = i;
            btn.addActionListener(e -> handleAnswer(idx));
            answerButtons[i] = btn;
            questionPanel.add(Box.createVerticalStrut(10));
            questionPanel.add(btn);
        }

        JScrollPane scrollPane = new JScrollPane(wrapperPanel);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

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

        String displayText = "";
        if (currentQuestion.getStimulus() != null && !currentQuestion.getStimulus().isEmpty()) {
            displayText += "Source:\n" + currentQuestion.getStimulus() + "\n\n";
        }
        displayText += currentQuestion.getQuestion();

        questionLabel.setText(displayText);

        String[] choices = currentQuestion.getAnswerChoices();
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(choices[i]);
            answerButtons[i].setEnabled(true);
        }
        bossLabel.setText(boss.toString());
    }

    private void handleAnswer(int idx) {
        String userInput = answerButtons[idx].getText().substring(0, 1);
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
