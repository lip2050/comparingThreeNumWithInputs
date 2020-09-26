package numberComparismWithInput;

import java.util.Scanner;

public class ComparingThreeNumbers {
	
	public static void main (String [] args) {
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Comparing three numbers");
		
		System.out.println("Please enter the first number");
		Scanner scan = new Scanner (System.in);
		number1 = scan.nextInt();
		
		System.out.println("Please enter the second number");
		Scanner sc = new Scanner (System.in);
		number2 = sc.nextInt();
		
		System.out.println("Please enter the third number");
		Scanner s = new Scanner (System.in);
		number3 = s.nextInt();
		
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1 + " is the largest number amongs the three numbers.");
		}
		
		else 
			if (number2 > number1 && number2 > number3) {
			System.out.println(number2 + " is the largest number amongs the three numbers."); 
			}
		
		else 
			if (number3 > number2 && number3 > number1) {
			System.out.println(number3 + " is the largest number amongs the three numbers."); 
			}
		
			else {
				System.out.println("Two or Three of the numbers are the same.");
			}
	}

}
