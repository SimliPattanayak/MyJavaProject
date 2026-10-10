package Practice.JavaPractice;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		 System.out.println(isPalindrome(str));
		 }
		 static boolean isPalindrome(String str) {
		 int start = 0;
		 int end = str.length() - 1;
		 while (start < end) {
		 if (str.charAt(start) != str.charAt(end)) {
		 return false;
		 }
		 start++;
		 end--;
		 }
		 return true;
	}
}




/*class Main {
	  public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 String s = sc.nextLine();
	 if (Input(s)){
	     System.out.println("Is a Palindrome");
	 }else{
	     System.out.println("Not a Palindrome");
	 }
	 
	  }
	 
	 static boolean Input(String st){
	     int start = 0;
	     int end = st.length()-1;
	    
	    while(start<end) {
	     if(st.charAt(start)!= st.charAt(end)){
	         return false;
	     }
	 start++;
	 end--;
	 } 
	 return true;
	}  
	} */

/*import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "madam";
        // Check if the string is a palindrome
        //boolean res = isPalindrome(s);
        Main m = new Main();
       boolean res = m.Palindrome(s);
        
        // Print the result with enhanced output
        if (res) {
            System.out.println('"' + s + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + s + '"' + " is not a palindrome.");
        }
    }
        
    public static boolean Palindrome(String s) {
      
        // Convert string to lowercase for 
        // case-insensitive comparison
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare the original string with 
        // the reversed string
        return s.equals(rev);
    }
} */




/*class Main {
    public static void main(String[] args) {
         String s = "madame";
         if (palindrome(s)){
             System.out.println("is is palindrome");
         }else {
             System.out.println("not a palindrome");
         }
    }
         
         static boolean palindrome(String s){
    
for(int i=0; i<s.length(); i++){
        if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
            
        }
         
    } return true; 

       }
             
       }*/
