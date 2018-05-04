import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel implements ActionListener{

    static Timer timer;
    static List<Sprite> sprites = new ArrayList<>();
    static int x;
    static int y;

    public static void setup(){

        DrawMap.draw();

        for(int i = 0; i < DrawMap.col; i++){
            for(int j = 0; j < DrawMap.rows; j++){
                if(DrawMap.pacArr[j][i] == 1){
                    x = DrawMap.pac0;
                    y = DrawMap.pacArr[j][i];
                    sprites.add(new Pac(Color.PINK,x,y,25));
                }
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

        for(int i = 0; i < DrawMap.col; i++){
            for(int j = 0; j < DrawMap.rows; j++){
                if(DrawMap.arr[j][i] == 1){
                    g.setColor(Color.BLUE);
                    g.fillRect(j, i, 1, 1);
                }
                else if(DrawMap.arr[j][i] == 0){
                    g.setColor(Color.BLACK);
                    g.fillRect(j, i, 1, 1);
                }
            }
        }

        for(int i = 0; i < sprites.size(); i++){
            sprites.get(i).paint(g);
        }

        System.out.println(sprites.size());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
