package Practice.JavaPractice;

import java.util.Scanner;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number=");
		int num = s.nextInt();
	
	        boolean b = true;
		for(int i=2 ; i <= num/2 ; i++) {
			if (num%i==0) {
				b = false;
				break;
			}
		}
			if(b == true) {
			System.out.println(num+ " is a prime number");
			}  else {
			System.out.println(num+ " is not a prime number");
		}
		
	}
}


/*import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int count =0;
       
       for(int i=1; i<=s;i++){
           if(s%i==0){
               count++;
           }
       }
       if(count==0){
               System.out.println("It is not a prime number.");
           } else {
               System.out.println("It is a prime number.");
           }
           
       }
    }*/


