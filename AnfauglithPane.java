import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class AnfauglithPane extends JPanel {
    public AnfauglithPane() {
        setBounds(521, 48, 210, 145);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Anfauglith.png").getImage(), 0, 0, null);
        repaint();
    }
}
