package Practice.JavaPractice;

import java.util.Arrays;

/**
 * Hello world!
 */
public class Anagram {
	static void checkAnagram() {
       
    String s1="racecar";
    String s2="carrace";
    char[] c1=s1.toCharArray();
    char[] c2=s2.toCharArray();
    
    Arrays.sort(c1);
    Arrays.sort(c2);
	if(Arrays.equals(c1, c2)) {
		System.out.println("String is anagram");
		
	}
	
	else {
		System.out.println("String is not a anagram");
	}
	
	
	}
	
	public static void main(String[] args) {
		checkAnagram();
	}
 	
    }
