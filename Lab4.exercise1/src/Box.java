
public class Box {
	
	int size = 0;

	public static void main(String[] args) {
		
		Box box = new Box(); //declare an object 
		box.size = 5;  
		box.printBox();
		
		System.out.println();
		box.printBox('c');
	}
	
	public void printBox() {
	
		//uses nested for loops to print a row of 5 stars, 5 times.
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println(); //adds a new line every time 5 stars are printed.
		}
	}
	public void printBox(char c) {
		//uses nested for loops to print a row of 5 stars, 5 times.
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print("c");
			}					
			System.out.println(); //adds a new line every time 5 stars are printed.
		}
	}
}
