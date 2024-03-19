import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;


public class Grid extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8885100601854879830L;
	
	private JTextField[][] grid;
    private JButton doneButton, startButton, cheatButton, quitButton;
    private Main main;
    private Game myGame;

	public Grid(int board[][]) {
		main = new Main(); // Create instance of Main class
        myGame = new Game(main); // Create instance of Game class with Main instance
        setTitle("Sudoku Game");
        setSize(400, 500);
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
        grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
    	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
    	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
    	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
    	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);

        
     // Create Start button
        startButton = new JButton("Random");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.Start();
                resetBoard();
            	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
            	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
            	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
            	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);
            	grid[(int) ((Math.random() * 4))][(int) ((Math.random() * 4))].setEditable(false);

                updateGrid();
            }
        });
        add(startButton);
        
     // Done button
        doneButton = new JButton("Done");
        doneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                applyChanges(); // Update the main board with user inputs
                System.out.println(myGame.checkGameRules());
                for(int i = 1;i<17; i++) {
                	System.out.println(main.getCell(i));
                }
                boolean gameResult = myGame.gameRules();
                if (!gameResult) {
                    JOptionPane.showMessageDialog(Grid.this, "Failed, Try Again!");
                } else {
                    JOptionPane.showMessageDialog(Grid.this, "Solved!");
                }
            }
        });
        add(doneButton);
        
     // Create Cheat button
        cheatButton = new JButton("Cheat");
        cheatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.setBoard(); //Cheat button to check work is working
                updateGrid();
            }
        });
        add(cheatButton);
        
     // Create Quit button
        quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the window
            }
        });
        add(quitButton);
        
        setVisible(true);
	}
	/**
	 * Reset Board
	 */
	private void resetBoard() {
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
            	grid[i][j].setEditable(true);
            }
        }
	}
	/**
	 * Update Grid after making changes in the Board.
	 */
	private void updateGrid() {
        int[][] newBoard = main.getBoard();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j].setText(String.valueOf(newBoard[i][j]));
            }
        }
    }
	/**
	 * Update Board after making changes in the Grid.
	 */
	private void applyChanges() {
		 for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 4; j++) {
				 String input = grid[i][j].getText();
				 if (!input.isEmpty()) {
					 try {
				 		int newValue = Integer.parseInt(input);
	                    main.setCell(i*4+j+1, newValue);
	                 } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(Grid.this, "Invalid input! Please enter a number.");
	                 }
	             }
			 }
		 }
	}
}
