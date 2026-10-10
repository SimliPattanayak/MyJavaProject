package Practice.JavaPractice;

public class Fibonacci {
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
       int first = 0;
       int last = 1;
       int count;
       
       public void fib(int n) {
    	   System.out.println(first);
    	   System.out.println(last);
    	   
    	   for(int i=1; i<=n; i++) {
    		   count = first+last;
    		   first = last;
    		   last = count;
    		   System.out.println(count);	   
    	     }
    	 }
       
   	public static void main(String[] args) {
   		Fibonacci f = new Fibonacci();
   		f.fib(5);
	}

}
