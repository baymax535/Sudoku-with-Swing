import javax.swing.*;

public class Main {
	
	private int [][] board;
	private final int gg, gh, gi, gj;
	private boolean[] isFinal;
		
	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> {
            new Play().setVisible(true);
        });
	}
	
	//default constructor
	public Main(){
		gg = (int) (Math.random() * 4) + 1;
		gh = (int) (Math.random() * 4) + 1;
		gi = (int) (Math.random() * 4) + 1;
		gj = (int) (Math.random() * 4) + 1;
		this.isFinal = new boolean[17];
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
//		if(!isFinal[n]) {
		    int row = (n - 1) / 4;  // Calculate row index from n
		    int col = (n - 1) % 4;  // Calculate column index from n
		    board[row][col] = value;
//		}
	}
	
	public void Start() {
		for (int i = 1; i < 17; i++) {
			int val = (int) (Math.random() * 4) + 1;
	        setCell(i,val);
		}
		
		//Find four cells to be fixed every game
		int cell2, cell1, cell3, cell4;
		cell1 = (int) (Math.random() * 16) + 1;
		setCell(cell1, gg);
		isFinal[cell1]=true;
		cell2 = (int) (Math.random() * 16) + 1;
		while(cell1==cell2) {
			cell2 = (int) (Math.random() * 16) + 1;
		}
		setCell(cell2, gh);
		isFinal[cell2]=true;
		cell3 = (int) (Math.random() * 16) + 1;
		while(cell1==cell3||cell2==cell3) {
			cell3 = (int) (Math.random() * 16) + 1;
		}
		setCell(cell3, gi);
		isFinal[cell3]=true;
		cell4 = (int) (Math.random() * 16) + 1;
		while(cell1==cell4||cell2==cell4||cell3==cell4) {
			cell4 = (int) (Math.random() * 16) + 1;
		}
		setCell(cell4, gj);
		isFinal[cell4]=true;
		
	}
}

