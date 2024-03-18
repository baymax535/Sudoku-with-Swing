
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
		if(main.getBox(1)==main.getBox(2)) return false;
		if(main.getBox(1)==main.getBox(3)) return false;
		if(main.getBox(1)==main.getBox(4)) return false;
		if(main.getBox(2)==main.getBox(3)) return false;
		if(main.getBox(2)==main.getBox(4)) return false;
		if(main.getBox(3)==main.getBox(4)) return false;
		//Row 2:
		if(main.getBox(5)==main.getBox(6)) return false;
		if(main.getBox(5)==main.getBox(7)) return false;
		if(main.getBox(5)==main.getBox(8)) return false;
		if(main.getBox(6)==main.getBox(7)) return false;
		if(main.getBox(6)==main.getBox(8)) return false;
		if(main.getBox(7)==main.getBox(8)) return false;
		//Row 3:
		if(main.getBox(9)==main.getBox(10)) return false;
		if(main.getBox(9)==main.getBox(11)) return false;
		if(main.getBox(9)==main.getBox(12)) return false;
		if(main.getBox(10)==main.getBox(11)) return false;
		if(main.getBox(10)==main.getBox(12)) return false;
		if(main.getBox(11)==main.getBox(12)) return false;
		//Row 4: 
		if(main.getBox(13)==main.getBox(14)) return false;
		if(main.getBox(13)==main.getBox(15)) return false;
		if(main.getBox(13)==main.getBox(16)) return false;
		if(main.getBox(14)==main.getBox(15)) return false;
		if(main.getBox(14)==main.getBox(16)) return false;
		if(main.getBox(15)==main.getBox(16)) return false;
		return true;
	}
	public boolean validColumn() {
		//Column 1: 
		if(main.getBox(1)==main.getBox(5)) return false;
		if(main.getBox(1)==main.getBox(9)) return false;
		if(main.getBox(1)==main.getBox(13)) return false;
		if(main.getBox(5)==main.getBox(9)) return false;
		if(main.getBox(5)==main.getBox(13)) return false;
		if(main.getBox(9)==main.getBox(13)) return false;
		//Column 2:
		if(main.getBox(2)==main.getBox(6)) return false;
		if(main.getBox(2)==main.getBox(10)) return false;
		if(main.getBox(2)==main.getBox(14)) return false;
		if(main.getBox(6)==main.getBox(10)) return false;
		if(main.getBox(6)==main.getBox(14)) return false;
		if(main.getBox(10)==main.getBox(14)) return false;
		//Column 3:
		if(main.getBox(3)==main.getBox(7)) return false;
		if(main.getBox(3)==main.getBox(11)) return false;
		if(main.getBox(3)==main.getBox(15)) return false;
		if(main.getBox(7)==main.getBox(11)) return false;
		if(main.getBox(7)==main.getBox(15)) return false;
		if(main.getBox(11)==main.getBox(15)) return false;
		//Column 4: 
		if(main.getBox(4)==main.getBox(8)) return false;
		if(main.getBox(4)==main.getBox(12)) return false;
		if(main.getBox(4)==main.getBox(16)) return false;
		if(main.getBox(8)==main.getBox(12)) return false;
		if(main.getBox(8)==main.getBox(16)) return false;
		if(main.getBox(12)==main.getBox(16)) return false;

		return true;
	}
	
	public boolean validBox() {
		//Box 1: 
		if(main.getBox(1)==main.getBox(2)) return false;
		if(main.getBox(1)==main.getBox(5)) return false;
		if(main.getBox(1)==main.getBox(6)) return false;
		if(main.getBox(2)==main.getBox(5)) return false;
		if(main.getBox(2)==main.getBox(6)) return false;
		if(main.getBox(5)==main.getBox(6)) return false;
		//Box 2:
		if(main.getBox(3)==main.getBox(4)) return false;
		if(main.getBox(3)==main.getBox(7)) return false;
		if(main.getBox(3)==main.getBox(8)) return false;
		if(main.getBox(4)==main.getBox(7)) return false;
		if(main.getBox(4)==main.getBox(8)) return false;
		if(main.getBox(7)==main.getBox(8)) return false;
		//Box 3:
		if(main.getBox(9)==main.getBox(10)) return false;
		if(main.getBox(9)==main.getBox(13)) return false;
		if(main.getBox(9)==main.getBox(14)) return false;
		if(main.getBox(10)==main.getBox(13)) return false;
		if(main.getBox(10)==main.getBox(14)) return false;
		if(main.getBox(13)==main.getBox(14)) return false;
		//Box 4: 
		if(main.getBox(11)==main.getBox(12)) return false;
		if(main.getBox(11)==main.getBox(15)) return false;
		if(main.getBox(11)==main.getBox(16)) return false;
		if(main.getBox(12)==main.getBox(15)) return false;
		if(main.getBox(12)==main.getBox(16)) return false;
		if(main.getBox(15)==main.getBox(16)) return false;
		return true;
	}
	
	public boolean validValues() {
		if (main.getBox(1) < 1 || main.getBox(1) > 4) return false;
		if (main.getBox(2) < 1 || main.getBox(2) > 4) return false;
		if (main.getBox(3) < 1 || main.getBox(3) > 4) return false;
		if (main.getBox(4) < 1 || main.getBox(4) > 4) return false;
		if (main.getBox(5) < 1 || main.getBox(5) > 4) return false;
		if (main.getBox(6) < 1 || main.getBox(6) > 4) return false;
		if (main.getBox(7) < 1 || main.getBox(7) > 4) return false;
		if (main.getBox(8) < 1 || main.getBox(8) > 4) return false;
		if (main.getBox(9) < 1 || main.getBox(9) > 4) return false;
		if (main.getBox(10) < 1 || main.getBox(10) > 4) return false;
		if (main.getBox(11) < 1 || main.getBox(11) > 4) return false;
		if (main.getBox(12) < 1 || main.getBox(12) > 4) return false;
		if (main.getBox(13) < 1 || main.getBox(13) > 4) return false;
		if (main.getBox(14) < 1 || main.getBox(14) > 4) return false;
		if (main.getBox(15) < 1 || main.getBox(15) > 4) return false;
		if (main.getBox(16) < 1 || main.getBox(16) > 4) return false;
		return true;
	}
		
}
