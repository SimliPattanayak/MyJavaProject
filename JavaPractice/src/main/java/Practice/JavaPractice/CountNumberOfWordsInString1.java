package Practice.JavaPractice;

import java.util.Scanner;

public class CountNumberOfWordsInString1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter: ");
		 String s = sc.nextLine();
		 
		 int count = 1;
		 for (char c : s.toCharArray()) {
		 if ((c == ' ') && (c + 1) != ' '){
		 count++;
		 }
		}
		 System.out.println("Number of words in a string: " +count);

	}

}
