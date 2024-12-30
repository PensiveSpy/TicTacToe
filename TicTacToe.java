import java.awt.*;
import javax.swing.*;

public class TicTacToe {
    int boardWidth = 1000;
    int boardHeight = 800;

    JFrame frame = new JFrame();
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

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


    }
}
