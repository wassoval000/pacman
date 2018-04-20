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
    static int e3 = 700/4;
    static int e4 = (700/4)-60;
    static int e5 = (700/4)*3;
    static int e6 = ((700/4)*3)+60;
    static int e7 = (700/2)-90;
    static int e8 = (700/2)+90;
    static int mid0 = (edge1/2)+60;
    static int mid1 = 450+(edge1/2);
    static int mid2 = mid1+(edge1/3)+60;
    static int left0 = (900/4)+30;
    static int left1 = (900/2)+30;
    static int hor0 = ((700/4)*3)+60;

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
        for(int i = left0; i < (col/2)-60; i++){
            arr[e3][i] = 1;
            arr[e5][i] = 1;
            if(i > edge1) {
                arr[e4][i] = 1;
                arr[e6][i] = 1;
            }
        }
        for(int i = left1; i < 2*edge1; i++){
            arr[e3][i] = 1;
            arr[e5][i] = 1;
            if(i > edge1){
                arr[e4][i] = 1;
                arr[e6][i] = 1;
            }
        }
        for(int i = 900-(edge1/2); i < 900-60; i++){
            arr[e3][i] = 1;
            arr[e5][i] = 1;
        }
        for(int i = (900-edge1)+60; i < 900-(edge1/2); i++){
            arr[e4][i] = 1;
            arr[e6][i] = 1;
        }
        for(int i = (900/2)-50; i < (900/2)+50; i++){
            arr[e7][i] = 1;
            arr[e8][i] = 1;
        }
        for(int i = e4; i >= 0; i--){
            arr[i][(900/2)-60] = 1;
            arr[i][(900/2)+30] = 1;
        }
        for(int i = e4; i >= e0; i--){
            arr[i][edge1] = 1;
            arr[i][900-edge1] = 1;
        }
        for(int i = hor0; i <= 700-e0; i++){
            arr[i][edge1] = 1;
            arr[i][900-edge1] = 1;
        }
        for(int i = hor0-(edge1/2); i <= 700; i++){
            arr[i][(900/2)-60] = 1;
            arr[i][e0] = 1;
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
