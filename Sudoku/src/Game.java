
public class Game {
	
	Main main;
    public Game(Main main) {
        this.main = main;
    }
	public boolean gameRules() {
		//Values are between one and four
		if(!isValidValues()) return false;
		//Horizontally Different Values
		if(!isValidRow()) return false;
		//Vertically Different Values
		if(!isValidColumn()) return false;
		//Square Different Values
		if(!isValidBox()) return false;
		return true;
	}
	public String checkGameRules() {
		if(!gameRules())
			return "Failed, Try Again!";
		
			return "You Won";
	}
	public boolean isValid(int x) {
		int i =0,j=0,k=0,l=0;
		if(x == 1) {
			i = 1; j = 2; k = 3; l =4;
		}
		if(x == 2) {
			i = 5; j = 6; k = 7; l =8;
		}
		if(x == 3) {
			i = 9; j = 10; k = 11; l =12;
		}
		if(x == 4) {
			i = 13; j = 14; k = 15; l =16;
		}
		if(x == 5) {
			i = 1; j = 5; k = 9; l =13;
		}
		if(x == 6) {
			i = 2; j = 6; k = 10; l =14;
		}
		if(x == 7) {
			i = 3; j = 7; k = 11; l =15;
		}
		if(x == 8) {
			i = 4; j = 8; k = 12; l =16;
		}
		if(x == 9) {
			i = 1; j = 2; k = 5; l =6;
		}
		if(x == 10) {
			i = 3; j = 4; k = 7; l =8;
		}
		if(x == 11) {
			i = 9; j = 10; k = 13; l =14;
		}
		if(x == 12) {
			i = 11; j = 12; k = 15; l =16;
		}
		if(main.getCell(i)==main.getCell(j)) return false;
		if(main.getCell(i)==main.getCell(k)) return false;
		if(main.getCell(i)==main.getCell(l)) return false;
		if(main.getCell(j)==main.getCell(k)) return false;
		if(main.getCell(j)==main.getCell(l)) return false;
		if(main.getCell(k)==main.getCell(l)) return false;
		return true;
	}
	
	public boolean isValid(int c1, int c2) {
		int i =0,j=0,k=0,l=0;
		for(int x = 1; x<13;x++) {
			
			if(x == 1) {
				i = 1; j = 2; k = 3; l =4;
			}
			if(x == 2) {
				i = 5; j = 6; k = 7; l =8;
			}
			if(x == 3) {
				i = 9; j = 10; k = 11; l =12;
			}
			if(x == 4) {
				i = 13; j = 14; k = 15; l =16;
			}
			if(x == 5) {
				i = 1; j = 5; k = 9; l =13;
			}
			if(x == 6) {
				i = 2; j = 6; k = 10; l =14;
			}
			if(x == 7) {
				i = 3; j = 7; k = 11; l =15;
			}
			if(x == 8) {
				i = 4; j = 8; k = 12; l =16;
			}
			if(x == 9) {
				i = 1; j = 2; k = 5; l =6;
			}
			if(x == 10) {
				i = 3; j = 4; k = 7; l =8;
			}
			if(x == 11) {
				i = 9; j = 10; k = 13; l =14;
			}
			if(x == 12) {
				i = 11; j = 12; k = 15; l =16;
			}
			if(c1!=c2&&
					(c1==i||c1==j||c1==k||c1==l)&&
					(c2==i||c2==j||c2==k||c2==l)) {
				if(main.getCell(c1)==main.getCell(c2)) return false;
			}
		}
		
		return true;
	}
	public boolean isValidRow() {
		//Row 1: 
		if(!isValid(1)) return false;
		//Row 2:
		if(!isValid(2)) return false;
		//Row 3:
		if(!isValid(3)) return false;
		//Row 4: 
		if(!isValid(4)) return false;
		return true;
	}
	public boolean isValidColumn() {
		//Column 1: 
		if(!isValid(5)) return false;

		//Column 2:
		if(!isValid(6)) return false;

		//Column 3:
		if(!isValid(7)) return false;

		//Column 4: 
		if(!isValid(8)) return false;

		return true;
	}
	
	public boolean isValidBox() {
		//Box 1: 
		if(!isValid(9)) return false;

		//Box 2:
		if(!isValid(10)) return false;

		//Box 3:
		if(!isValid(11)) return false;

		//Box 4: 
		if(!isValid(12)) return false;

		return true;
	}
	
	public boolean isValidValues() {
		for(int i = 1; i<17; i++) {
			if (main.getCell(i) < 1 || main.getCell(i) > 4) return false;
		}
		return true;
	}
	
//	public int fixedCell() {
//		 return result;
//	}
		
}
