import java.awt.*;

public class Pac extends Sprite{

    static int[][] pacArr = new int[700][900];
    static int col = 900;
    static int rows = 700;
    static int pac0 = (700/4)-30;
    static int pac1 = (900/3)-35;
    static int pac2 = 900-10;

    public Pac(Color color, int x, int y, int diameter) {

        super(color, x, y, diameter, diameter);

    }

    public void Paint(Graphics g){

        g.setColor(color);
        g.fillOval(x, y, width, height);

    }

    public void Move(int boardHeight, int boardWidth){



    }

    public static void tilePac(){

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
             pacArr[i][j] = 0;
            }
        }
        for(int i = pac1; i <= pac2; i++){

            pacArr[pac0][i] = 1;

        }

    }

}
