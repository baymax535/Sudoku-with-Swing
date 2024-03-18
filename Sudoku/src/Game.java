
public class Game {
	
	Main main = new Main();
	int [][] board = main.getBoard();
	
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
	
	public boolean validRow() {
		//Row 1: 
		if(main.getCell(1)==main.getCell(2)) return false;
		if(main.getCell(1)==main.getCell(3)) return false;
		if(main.getCell(1)==main.getCell(4)) return false;
		if(main.getCell(2)==main.getCell(3)) return false;
		if(main.getCell(2)==main.getCell(4)) return false;
		if(main.getCell(3)==main.getCell(4)) return false;
		//Row 2:
		if(main.getCell(5)==main.getCell(6)) return false;
		if(main.getCell(5)==main.getCell(7)) return false;
		if(main.getCell(5)==main.getCell(8)) return false;
		if(main.getCell(6)==main.getCell(7)) return false;
		if(main.getCell(6)==main.getCell(8)) return false;
		if(main.getCell(7)==main.getCell(8)) return false;
		//Row 3:
		if(main.getCell(9)==main.getCell(10)) return false;
		if(main.getCell(9)==main.getCell(11)) return false;
		if(main.getCell(9)==main.getCell(12)) return false;
		if(main.getCell(10)==main.getCell(11)) return false;
		if(main.getCell(10)==main.getCell(12)) return false;
		if(main.getCell(11)==main.getCell(12)) return false;
		//Row 4: 
		if(main.getCell(13)==main.getCell(14)) return false;
		if(main.getCell(13)==main.getCell(15)) return false;
		if(main.getCell(13)==main.getCell(16)) return false;
		if(main.getCell(14)==main.getCell(15)) return false;
		if(main.getCell(14)==main.getCell(16)) return false;
		if(main.getCell(15)==main.getCell(16)) return false;
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
		if (main.getCell(1) < 1 || main.getCell(1) > 4) return false;
		if (main.getCell(2) < 1 || main.getCell(2) > 4) return false;
		if (main.getCell(3) < 1 || main.getCell(3) > 4) return false;
		if (main.getCell(4) < 1 || main.getCell(4) > 4) return false;
		if (main.getCell(5) < 1 || main.getCell(5) > 4) return false;
		if (main.getCell(6) < 1 || main.getCell(6) > 4) return false;
		if (main.getCell(7) < 1 || main.getCell(7) > 4) return false;
		if (main.getCell(8) < 1 || main.getCell(8) > 4) return false;
		if (main.getCell(9) < 1 || main.getCell(9) > 4) return false;
		if (main.getCell(10) < 1 || main.getCell(10) > 4) return false;
		if (main.getCell(11) < 1 || main.getCell(11) > 4) return false;
		if (main.getCell(12) < 1 || main.getCell(12) > 4) return false;
		if (main.getCell(13) < 1 || main.getCell(13) > 4) return false;
		if (main.getCell(14) < 1 || main.getCell(14) > 4) return false;
		if (main.getCell(15) < 1 || main.getCell(15) > 4) return false;
		if (main.getCell(16) < 1 || main.getCell(16) > 4) return false;
		return true;
	}
	
	
		
}
