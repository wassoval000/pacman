import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {

    Board board;

    public Game() {

        setVisible(true);
        setResizable(false);
        setTitle("PACMAN");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board();
        add(board);
        pack();
        setLocationRelativeTo(null);

    }


    public static void main(String[] args) {
        Game game = new Game();
    }
}
