package Practice.JavaPractice;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number = ");
		 int number = s.nextInt();
		 //int number = 12345;
		 int sumOfDigits = calculateSumOfDigits(number);
		 System.out.println("Sum of digits of " + number + " is: " + 
		sumOfDigits);
		 }
		 public static int calculateSumOfDigits(int number) {
		 int sum = 0;
		 while (number > 0) {
		 int digit = number % 10; // Extract the last digit
		 sum = sum + digit; // Add the digit to sum
		 number = number / 10; // Remove the last digit from number
		 }
		 return sum;

	}

}
