package Practice.JavaPractice;

public class PrintNumbers {

	public static void main(String[] args) {
	   //int n =100;
	   
	   for(int i =1; i<=100 ; i++) {
		   if(i%5==0) {
			   System.out.println("lane:"+i);
		   }
		   else if(i%7==0) {
			   System.out.println("Rocks:"+i);
		   }
		   else if(i%5==0 && i%7==0) {
			   System.out.println("RocketLane:"+i);
			   
		   }
		   
		   else if(i==10 || i==7 ||i==77 || i==17 || i==33 || i==47) {
			   System.out.println(i);
		   }
		   else {
			   System.out.println(i);
		   }
	   }

	}

}
