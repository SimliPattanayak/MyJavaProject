package Practice.JavaPractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int number = scanner.nextInt();
		 if (isPalindrome(number)) {
		 System.out.println(number + " is a palindrome.");
		 } else {
		 System.out.println(number + " is not a palindrome.");
		 }
		 }
		 public static boolean isPalindrome(int num) {
		 int originalNumber = num;
		 int reversedNumber = 0;
		 while (num != 0) {
		 int digit = num % 10;
		 reversedNumber = reversedNumber * 10 + digit;
		 num = num/10;
		 }
		 return originalNumber == reversedNumber;
	}

}



/*import java.util.*;
class Main {
    public static void main(String[] args) {
       //int n = 123464321;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int reverseN = reversNumber(n);
        
       // System.out.println("Reverse of n = " + reverseN);

        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }


 
  static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed_n = reversed_n * 10 + digit;
            n = n / 10;
        }
        return reversed_n;
 }
}*/
 