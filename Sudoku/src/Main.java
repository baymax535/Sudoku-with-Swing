import javax.swing.*;

public class Main {

	public static void main (String[] args) {
		int aa=1,ab=2,ac=3,ad=4,
			ba=5,bb=6,bc=7,bd=8,
			ca=9,cb=10,cc=11,cd=12,
			da=13,db=14,dc=15,dd=16;
		
		int [][] board = {
						  {aa},{ab},{ac},{ad},
						  {ba},{bb},{bc},{bd},
						  {ca},{cb},{cc},{cd},
						  {da},{db},{dc},{dd}
						 };
		for (int i = 0; i<board.length; i++) {
			System.out.println(board[i][0]);

		}
		SwingUtilities.invokeLater(() -> {
            new Grid();
        });
	}
	
}
