package Practice.JavaPractice;

public class StringReverse1 {

	public static void main(String[] args) {
		String s1="Was it a car or a cat I saw?";
		String next="";
		char[] Stringchar = s1.toCharArray();   
		// charAt() is used inside the loop and toCharArray() is used before the loop begins.
		
		for (int i=Stringchar.length-1;i>=0;i--) {
			
			next = next+Stringchar[i];
		
		}
		
		System.out.println(next);

	}

}


/*import java.util.*;
class Main {
    public static void main(String[] args) {
       String s = "Was it a car or a cat I saw?";
       char[] str = s.toCharArray();
       String result = "";
       
       
       for(int i=s.length()-1; i>=0;i--){
           result=result+str[i];
       }
       System.out.println(result);
    }
}*/
