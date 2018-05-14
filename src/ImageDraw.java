import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class ImageDraw extends JComponent{
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        Image pac0 = Toolkit.getDefaultToolkit().getImage("pac0.jpg");
        g2.drawImage(pac0, 12, 12, this);
        g2.finalize();
    }
}
