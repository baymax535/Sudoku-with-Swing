import javax.swing.*;

public class Main {
	
	private int [][] board;
	private int aa=1,ab=2,ac=3,ad=4,
				ba=4,bb=3,bc=2,bd=1,
				ca=3,cb=4,cc=1,cd=2,
				da=2,db=1,dc=4,dd=3;	
	public static void main (String[] args) {
		Main main = new Main();
		SwingUtilities.invokeLater(() -> {
            new Grid(main.getBoard());
        });
	}
	
	public Main(){
		
		this.board = new int[][] {
				  {aa, ab, ac, ad},
				  {ba, bb, bc, bd},
				  {ca, cb, cc, cd},
				  {da, db, dc, dd}
		};
	}
	
	public int[][] getBoard() {
		return this.board;
	}
}

