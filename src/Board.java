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
    static int edge1 = 300;
    static int e0 = 50;
    static int e1 = 650;
    static int e2 = 350;
    static int mid0 = (edge1/2)+60;
    static int mid1 = 450+(edge1/2);
    static int mid2 = mid1+(edge1/3)+60;

    public static void setup(){

        for(int i = 0; i < col; i++){
            for(int j = 0; j < rows; j++){
                arr[j][i] = 0;
            }
        }
        for(int i = 0; i < col-(edge1*2); i++){
            arr[e0][i] = 1;
            arr[e1][i] = 1;
        }
        for(int i = (edge1*2); i < col; i++){
            arr[e0][i] = 1;
            arr[e1][i] = 1;
        }
        for(int i = 0; i < (edge1/2.0); i++){
            arr[e2][i] = 1;
        }
        for(int i = mid0; i < mid0+(edge1/3.0); i++){
            arr[e2][i] = 1;
        }
        for(int i = mid1; i < mid1+(edge1/3.0); i++){
            arr[e2][i] = 1;
        }
        for(int i = mid2; i < mid2+(edge1/3.0); i++){
            arr[e2][i] = 1;
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

        for(int i = 0; i < col; i++){
            for(int j = 0; j < rows; j++){
                if(arr[j][i] == 1){
                    g.setColor(Color.BLUE);
                    g.fillRect(j, i, 1, 1);
                }
                else if(arr[j][i] == 0){
                    g.setColor(Color.BLACK);
                    g.fillRect(j, i, 1, 1);
                }
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
