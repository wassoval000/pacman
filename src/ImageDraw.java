import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class ImageDraw extends JComponent{
    public void paint(Graphics g){

    }

    public static BufferedImage GetPic(String file){
        try{
            return ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
