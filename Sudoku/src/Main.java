import javax.swing.*;

public class Main {
	
	private int [][] board;
	private int aa=1,ab=2,ac=3,ad=4,
				ba=4,bb=3,bc=2,bd=1,
				ca=3,cb=4,cc=1,cd=2,
				da=2,db=1,dc=5,dd=3;	
	public static void main (String[] args) {
		Main main = new Main();
		Game myGame = new Game();
		SwingUtilities.invokeLater(() -> {
            new Grid(main.getBoard());
        });
		
		if(!myGame.gameRules()) {
			System.out.println("Failed, Try Again!");
		}
		else System.out.println("You Won!");
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
	public int getBox(int n) {
		if(n==1) return aa;if(n==2) return ab;if(n==3) return ac;if(n==4) return ad;
		if(n==5) return ba;if(n==6) return bb;if(n==7) return bc;if(n==8) return bd;
		if(n==9) return ca;if(n==10) return cb;if(n==11) return cc;if(n==12) return cd;
		if(n==13) return da;if(n==14) return db;if(n==15) return dc;if(n==16) return dd;
		return 0;
	}
}

