
public class Game {
	
	Main main;
    public Game(Main main) {
        this.main = main;
    }
	public boolean gameRules() {
		//Values are between one and four
		if(!validValues()) return false;
		//Horizontally Different Values
		if(!validRow()) return false;
		//Vertically Different Values
		if(!validColumn()) return false;
		//Square Different Values
		if(!validBox()) return false;
		return true;
	}
	public String checkGameRules() {
		if(!gameRules())
			return "Failed, Try Again!";
		
			return "You Won";
	}
	public boolean validRow(int row) {
		int i =0,j=0,k=0,l=0;
		if(row == 1) {
			i = 1; j = 2; k = 3; l =4;
		}
		if(row == 2) {
			i = 5; j = 6; k = 7; l =8;
		}
		if(row == 3) {
			i = 9; j = 10; k = 11; l =12;
		}
		if(row == 4) {
			i = 13; j = 14; k = 15; l =16;
		}
		if(main.getCell(i)==main.getCell(j)) return false;
		if(main.getCell(i)==main.getCell(k)) return false;
		if(main.getCell(i)==main.getCell(l)) return false;
		if(main.getCell(j)==main.getCell(k)) return false;
		if(main.getCell(j)==main.getCell(l)) return false;
		if(main.getCell(k)==main.getCell(l)) return false;
		return true;
	}
	public boolean validRow() {
		//Row 1: 
		if(!validRow(1)) return false;
		//Row 2:
		if(!validRow(2)) return false;
		//Row 3:
		if(!validRow(3)) return false;
		//Row 4: 
		if(!validRow(4)) return false;
		return true;
	}
	public boolean validColumn() {
		//Column 1: 
		if(main.getCell(1)==main.getCell(5)) return false;
		if(main.getCell(1)==main.getCell(9)) return false;
		if(main.getCell(1)==main.getCell(13)) return false;
		if(main.getCell(5)==main.getCell(9)) return false;
		if(main.getCell(5)==main.getCell(13)) return false;
		if(main.getCell(9)==main.getCell(13)) return false;
		//Column 2:
		if(main.getCell(2)==main.getCell(6)) return false;
		if(main.getCell(2)==main.getCell(10)) return false;
		if(main.getCell(2)==main.getCell(14)) return false;
		if(main.getCell(6)==main.getCell(10)) return false;
		if(main.getCell(6)==main.getCell(14)) return false;
		if(main.getCell(10)==main.getCell(14)) return false;
		//Column 3:
		if(main.getCell(3)==main.getCell(7)) return false;
		if(main.getCell(3)==main.getCell(11)) return false;
		if(main.getCell(3)==main.getCell(15)) return false;
		if(main.getCell(7)==main.getCell(11)) return false;
		if(main.getCell(7)==main.getCell(15)) return false;
		if(main.getCell(11)==main.getCell(15)) return false;
		//Column 4: 
		if(main.getCell(4)==main.getCell(8)) return false;
		if(main.getCell(4)==main.getCell(12)) return false;
		if(main.getCell(4)==main.getCell(16)) return false;
		if(main.getCell(8)==main.getCell(12)) return false;
		if(main.getCell(8)==main.getCell(16)) return false;
		if(main.getCell(12)==main.getCell(16)) return false;

		return true;
	}
	
	public boolean validBox() {
		//Box 1: 
		if(main.getCell(1)==main.getCell(2)) return false;
		if(main.getCell(1)==main.getCell(5)) return false;
		if(main.getCell(1)==main.getCell(6)) return false;
		if(main.getCell(2)==main.getCell(5)) return false;
		if(main.getCell(2)==main.getCell(6)) return false;
		if(main.getCell(5)==main.getCell(6)) return false;
		//Box 2:
		if(main.getCell(3)==main.getCell(4)) return false;
		if(main.getCell(3)==main.getCell(7)) return false;
		if(main.getCell(3)==main.getCell(8)) return false;
		if(main.getCell(4)==main.getCell(7)) return false;
		if(main.getCell(4)==main.getCell(8)) return false;
		if(main.getCell(7)==main.getCell(8)) return false;
		//Box 3:
		if(main.getCell(9)==main.getCell(10)) return false;
		if(main.getCell(9)==main.getCell(13)) return false;
		if(main.getCell(9)==main.getCell(14)) return false;
		if(main.getCell(10)==main.getCell(13)) return false;
		if(main.getCell(10)==main.getCell(14)) return false;
		if(main.getCell(13)==main.getCell(14)) return false;
		//Box 4: 
		if(main.getCell(11)==main.getCell(12)) return false;
		if(main.getCell(11)==main.getCell(15)) return false;
		if(main.getCell(11)==main.getCell(16)) return false;
		if(main.getCell(12)==main.getCell(15)) return false;
		if(main.getCell(12)==main.getCell(16)) return false;
		if(main.getCell(15)==main.getCell(16)) return false;
		return true;
	}
	
	public boolean validValues() {
		for(int i = 1; i<17; i++) {
			if (main.getCell(i) < 1 || main.getCell(i) > 4) return false;
		}
		return true;
	}
	
//	public int fixedCell() {
//		 return result;
//	}
		
}
