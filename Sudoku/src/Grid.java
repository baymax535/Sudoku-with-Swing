import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Grid extends JFrame{
    private JTextField[][] grid;
    
	public Grid(int board[][]) {
        setTitle("Sudoku Game");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        grid = new JTextField[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = new JTextField(String.valueOf(board[i][j]));
                grid[i][j].setHorizontalAlignment(JTextField.CENTER);
                add(grid[i][j]);
            }
        setVisible(true);
        }
	}
	
}
