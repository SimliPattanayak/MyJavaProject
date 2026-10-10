package Practice.JavaPractice;

public class DuplicatesInString {
	
	public static void main(String[] args) {
	
		String str = "PATTANAYAK";
		int flag = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
			
			if (str.charAt(i)==str.charAt(j)){
				
				System.out.println(str.charAt(i) + " is a duplicate");
				flag =flag+1;
				
				
			}
			
			
		}
			
			}
		System.out.println(flag);
		
		if(flag==0) {
		System.out.println("no duplicates");
		}
		
		
	}


		
		

	}


