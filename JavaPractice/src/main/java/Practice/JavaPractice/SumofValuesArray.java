package Practice.JavaPractice;

public class SumofValuesArray {

	public static void main(String[] args) {
      
		int[] a = {1,2,3,4,5};
		int count = 0;
		for (int i=0; i<a.length; i++) {
		count = a[i]+count ;
		}
        System.out.println(count);
	}

}
