package Practice.JavaPractice;

public class StringReverse2 {

	public static void main(String[] args) {
		String s1="Was it a car or a cat I saw?";
		String next="";
		
		for (int i=0; i<s1.length(); i++) {
			next = s1.charAt(i)+next;
				
		}
		
		System.out.println(next);

	}

}
