import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
    int boardWidth = 1000;
    int boardHeight = 800;

    JFrame frame = new JFrame("Tic-Tac-Toe Four Game");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    JButton [][] board = new JButton[4][4];
    String playerX = "X";
    String playerO = "0";
    String playerY = "Y";

    String currentPlayer = playerX;

    TicTacToe(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(new Color(137, 171, 227));
        textLabel.setForeground(new Color(252, 246, 245));
        textLabel.setFont(new Font("Times New Roman", Font.BOLD, 60 ));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Tic-Tac-Toe Game");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(4, 4));
        boardPanel.setBackground(new Color(150, 200, 100));
        frame.add(boardPanel);

        for (int r = 0; r < 4; r++){
            for (int c = 0; c < 4; c++){
                JButton tile = new JButton();
                board[r][c] = tile;
                boardPanel.add(tile);

                tile.setBackground(Color.darkGray);
                tile.setForeground(Color.white);
                tile.setFont(new Font("Times New Romans", Font.BOLD, 120));
                tile.setFocusable(false);

            }
        }
    }
}