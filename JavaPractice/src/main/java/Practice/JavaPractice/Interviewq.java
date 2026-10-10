package Practice.JavaPractice;

public class Interviewq {

	public static void main(String[] args) {
	   String str = "AAKKKMM";
	   int count = 1;
	   
	   StringBuilder result = new StringBuilder();
	   for (int j=0;j<str.length()-1;j++) {
		   if(str.charAt(j)==str.charAt(j+1)) {
			   
			   count++;
			   
		   }
		   else {
			   result.append(str.charAt(j)).append(count); //Append the character and it's count to the result
			   count =  1; //Reset the count for the new character
		   }
			   
		   }
	   result.append(str.charAt(str.length()-1)).append(count);
	   System.out.println(result.toString());
	   
	   }

	}


