
public class Main {

	public static void main (String[] args) {
		int aa=0,ab=0,ac=0,
			ba=0,bb=0,bc=0,
			ca=0,cb=0,cc=0;
		
		int [][] board = {
						  {aa},{ab},{ac},
						  {ba},{bb},{bc},
						  {ca},{cb},{cc}
						 };
		for (int i = 0; i<board.length; i++) {
			System.out.println(board[i][0]);

		}
	}
	
}
