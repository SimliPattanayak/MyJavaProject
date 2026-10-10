package Practice.JavaPractice;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter first string: ");
		 String s1 = scanner.nextLine();
		 System.out.print("Enter second string: ");
		 String s2 = scanner.nextLine();
		 System.out.println("Before swapping: str1 = " + s1 + ", str2 = " + s2);
		 // Swapping without using a third variable
		 s1 = s1 + s2; // Concatenate str1 and str2 and store in str1
		 s2 = s1.substring(0, s1.length() - s2.length()); 
		// Extract the initial part (original str1) from the concatenated string
		 s1 = s1.substring(s2.length()); // Extract the remaining part (original str2) from the concatenated string
		 System.out.println("After swapping: str1 = " + s1 + ", str2 = " + s2);


	}

}
