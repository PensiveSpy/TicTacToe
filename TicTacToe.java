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

    boolean gameOver = false;

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

                tile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        if (gameOver){
                            return;
                        }
                        JButton tile = (JButton) e.getSource();
                        if (tile.getText() == ""){
                            tile.setText(currentPlayer);
                            checkWinner();
                            if (!gameOver){
                                currentPlayer = currentPlayer == playerX ? playerO : (currentPlayer == playerO ? playerY : playerX);
                                textLabel.setText(currentPlayer + " 's turn.");
                            }
                        }

                    }
                });
            }
        }
    }
    void checkWinner(){
        //Checking Horizontally
        for (int r = 0; r < 4; r++){
            if (board[r][0].getText() == "") continue;

            if (board[r][0].getText() == board[r][1].getText() && board[r][1].getText() == board[r][2].getText()){
                for (int i = 0; i < 4; i++){
                    setWinner(board[r][i]);
                }

                gameOver = true;
                return;
            }
        }


    }
    void setWinner(JButton tile){
        tile.setForeground(Color.GREEN);
        tile.setBackground(Color.GRAY);

        textLabel.setText(currentPlayer + " is the winner!");
    }
}