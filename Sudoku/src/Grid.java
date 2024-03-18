import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;


public class Grid extends JFrame{
	private JTextField[][] grid;
    private JButton doneButton, startButton;
    private Main main;
    private Game myGame;
    
	public Grid(int board[][]) {
		main = new Main(); // Create instance of Main class
        myGame = new Game(main); // Create instance of Game class with Main instance
        
        setTitle("Sudoku Game");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4));

        grid = new JTextField[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = new JTextField(String.valueOf(board[i][j]));
                grid[i][j].setHorizontalAlignment(JTextField.CENTER);
                add(grid[i][j]);
            }
        }
     // Create Start button
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.Start();
                updateGrid();
            }
        });
        add(startButton);
        //DONE button
        doneButton = new JButton("DONE");
        doneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(myGame.checkGameRules());
                boolean gameResult = myGame.gameRules();
                if (!gameResult) {
                    JOptionPane.showMessageDialog(Grid.this, "Failed, Try Again!");
                } else {
                    JOptionPane.showMessageDialog(Grid.this, "You Won!");
                }
            }
        });
        add(doneButton);
        
        setVisible(true);
	}
	
	private void updateGrid() {
        int[][] newBoard = main.getBoard();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j].setText(String.valueOf(newBoard[i][j]));
            }
        }
    }
}
