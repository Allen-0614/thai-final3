import javax.swing.*;
import java.awt.*;

public class MyGUI {
    public MyGUI() {
        // Create frame
        JFrame frame = new JFrame("APUSH Study Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set layout
        frame.setLayout(new BorderLayout());

        // Set background color
        frame.getContentPane().setBackground(Color.WHITE);

        // Title label at the top
        JLabel titleLabel = new JLabel("APUSH Study Game", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        JButton startButton = new JButton("Start Game");
        JButton exitButton = new JButton("Exit Game");

        // Add button actions
        startButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Game Started!");
        });
        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);
    }
}
