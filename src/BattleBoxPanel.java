import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BattleBoxPanel extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private Rectangle rectangle;
    private ArrayList<Rectangle> bullets;
    private Player player;
    private int playerSpeed = 5;
    private int bulletSpeed = 4;

    public BattleBoxPanel(Player player) {
        this.player = player;
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLUE);
        setFocusable(true);
        addKeyListener(this);

        rectangle = new Rectangle(90, 90, 10, 10); // red heart/player
        bullets = new ArrayList<>();

        timer = new Timer(30, this);
        timer.start();
    }

    public void stopBattle() {
        timer.stop();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw player
        g.setColor(Color.RED);
        g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);

        // Draw bullets
        g.setColor(Color.WHITE);
        for (Rectangle bullet : bullets) {
            g.fillRect(bullet.x, bullet.y, bullet.width, bullet.height);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isShowing()) return;  // Don't run logic if panel is hidden or removed

        // Move bullets
        ArrayList<Rectangle> bulletsToRemove = new ArrayList<>();
        for (Rectangle bullet : bullets) {
            bullet.y += bulletSpeed;
        }

        // Bullet cleanup if off screen
        bullets.removeIf(bullet -> bullet.y > getHeight());

        // Generate bullet safely
        if (Math.random() < 0.1) {
            int bulletX = (int)(Math.random() * (getWidth() - 10));
            Rectangle newBullet = new Rectangle(bulletX, 0, 10, 10);
            if (!rectangle.intersects(newBullet)) {
                bullets.add(newBullet);
            }
        }

        // Collision detection
        for (Rectangle bullet : bullets) {
            if (rectangle.intersects(bullet)) {
                player.setHealth(player.getHealth() - 1);
                bulletsToRemove.add(bullet);
            }
        }

        bullets.removeAll(bulletsToRemove);

        repaint();
    }

    // Movement keys
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) && rectangle.x > 0) rectangle.x -= playerSpeed;
        if ((key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) && rectangle.x < getWidth() - rectangle.width) rectangle.x += playerSpeed;
        if ((key == KeyEvent.VK_UP || key == KeyEvent.VK_W) && rectangle.y > 0) rectangle.y -= playerSpeed;
        if ((key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) && rectangle.y < getHeight() - rectangle.height) rectangle.y += playerSpeed;
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
}
