package Practice.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayReverse {

	public static void main(String[] args) {
	
		String[] a1={"a", "b", "c", "d"};
		
		ArrayList<String> ls = new ArrayList<>();
		ls.addAll(Arrays.asList(a1));
		Collections.reverse(ls);
		System.out.println(ls);
		
		//for(int i = a1.length-1;i>=0;i--) {			
			//System.out.println(a1[i]);
		//}

	}

}
