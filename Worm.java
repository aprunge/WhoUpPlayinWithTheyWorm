import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.Toolkit;

public class Worm {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenHeight = screenSize.height;
            int screenWidth = screenSize.width;
            Random r = new Random();
            JFrame frame = new JFrame("Who up playin with they worm?");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel fileNameLabel = new JLabel(new ImageIcon("src/worm.jpg"));
            frame.getContentPane().add(fileNameLabel, BorderLayout.CENTER);
            frame.setLocation(r.nextInt(screenWidth), r.nextInt(screenHeight));
            frame.pack();
            frame.setVisible(true);
            Thread.sleep(250);
        }
    }
}