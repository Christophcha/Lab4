import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number;

		System.out.print("Please enter the amount of numbers you want to store: "); //prompts user for the amount numbers or slots

		number = scan.nextInt(); //stores next int into a variable

		int[] numberList = new int[number]; //establishes an array using previous input

		System.out.print("Enter the numbers that you want stored: "); //prompts user for a list of numbers

		for (int i = 0; i < numberList.length; i++) { 
			numberList[i] = scan.nextInt();
		}
		nextLargest(numberList); //imports method 
		scan.close();
	}

	public static void nextLargest(int[] numberList) {

		int max;

		for (int i = 0; i < numberList.length; i++) { 
			max = Integer.MAX_VALUE;
			for (int j = 0; j < numberList.length; j++) {

				if (numberList[j] > numberList[i] && numberList[j] < max) { 
					max = numberList[j];
				}
			}
			System.out.println(numberList[i] + ": " + max); //prints list of numbers and the next largest number
		}
	}
}