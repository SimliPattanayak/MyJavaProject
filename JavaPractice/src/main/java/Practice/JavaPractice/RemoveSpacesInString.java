package Practice.JavaPractice;

import java.util.Scanner;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string with spaces: ");
		 String input = scanner.nextLine();
		 String stringWithoutSpaces = removeSpaces(input);
		 System.out.println("String without spaces: " + 
		stringWithoutSpaces);
		 }
		 public static String removeSpaces(String str) {
		 StringBuilder result = new StringBuilder();
		 for (int i = 0; i < str.length(); i++) {
		 if (str.charAt(i) != ' ') {
		 result.append(str.charAt(i));
		 }
		 }
		 return result.toString();

	}

}

//Code only within the Main method
/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        for(int i=0;i< s.length();i++){
            if(s.charAt(i)!= ' '){
               result.append(s.charAt(i));
            }
            
        }
       
       System.out.println(result); 
    }
}*/
