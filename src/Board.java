import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel implements ActionListener{

    static Timer timer;
    static int[][] arr = new int[700][900];
    static int rows = 700;
    static int col = 900;

    public static void setup(){

        for(int i = 0; i < col; i ++){
            for(int j = 0; j < rows; j++){
                arr[j][i] = 0;
            }
        }

    }

    public Board(){

        setPreferredSize(new Dimension(700, 900));
        setBackground(Color.BLACK);
        timer = new Timer(1000/60, this);
        timer.start();

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        setBackground(Color.BLACK);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
