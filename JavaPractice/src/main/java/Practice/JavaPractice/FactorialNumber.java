package Practice.JavaPractice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int factorial =1;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter any number: ");
		 int num = s.nextInt();
		 //int number = 5;
		 for (int i = 1; i <= num; i++){
		 factorial = factorial * i;
		 }
		 System.out.println("Factorial number is :" +factorial);

	}

}
