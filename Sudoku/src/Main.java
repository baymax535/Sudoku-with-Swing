import javax.swing.*;

public class Main {
	
	private int [][] board;
		
	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> {
            new Play().setVisible(true);
        });
	}
	
	//default constructor
	public Main(){
		this.board = new int[][] {
             {0, 0, 0, 0},
             {0, 0, 0, 0},
             {0, 0, 0, 0},
             {0, 0, 0, 0}
		};
	}
	
	//Getter for Board
	public int[][] getBoard() {
		return this.board;
	}
	public int[][] getMediumBoard() {
		this.board = new int[][] {
	         {5, 3, 0, 0, 7, 0, 0, 0, 0},
	         {6, 0, 0, 1, 9, 5, 0, 0, 0},
	         {0, 9, 8, 0, 0, 0, 0, 6, 0},
	         {8, 0, 0, 0, 6, 0, 0, 0, 3},
	         {4, 0, 0, 8, 0, 3, 0, 0, 1},
	         {7, 0, 0, 0, 2, 0, 0, 0, 6},
	         {0, 6, 0, 0, 0, 0, 2, 8, 0},
	         {0, 0, 0, 4, 1, 9, 0, 0, 5},
	         {0, 0, 0, 0, 8, 0, 0, 7, 9}
	    };
		return this.board;
	}
	//Setter for Board
	public void setBoard() {
		this.board = new int[][] {
            {2, 1, 3, 4},
            {4, 3, 2, 1},
            {1, 2, 4, 3},
            {3, 4, 1, 2}
		};
	}
	//Getter for each cell
	public int getCell(int n) {
	    int row = (n - 1) / 4;  // Calculate row index from n
	    int col = (n - 1) % 4;  // Calculate column index from n
	    return board[row][col];
	}
	//Setter for each cell
	public void setCell(int n, int value) {
		    int row = (n - 1) / 4;  // Calculate row index from n
		    int col = (n - 1) % 4;  // Calculate column index from n
		    board[row][col] = value;
	}
	
	public void Start() {
		for (int i = 1; i < 17; i++) {
			int val = (int) (Math.random() * 4) + 1;
	        setCell(i,val);
		}
	}
}

