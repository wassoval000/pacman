import javax.swing.*;

public class Graphics2dDrawImage {
    public static void main(String[] a){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new ImageDraw());
        window.setVisible(true);
    }
}
