package Practice.JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class FindWordsCount {

	public static void main(String[] args) {
		
		String str="i am who i am, no matter what i am.";
		
		// \\s → Matches any whitespace character (space, tab, newline).
		// , → Matches a comma.
		// . → Inside a character class ([]), the dot is treated as a literal period (.),not the "any character" wildcard.
		// [] → Character class, meaning "match any one of these characters."
		// + → Match one or more consecutive occurrences.
		
		/*  the string is split wherever it finds: a space (\s)    a comma (,)    a period (.)    
		        data[0] = "i"
				data[1] = "am"
				data[2] = "who"
				data[3] = "am"
				data[4] = "i"
				data[5] = "am"
				data[6] = "no"
				data[7] = "matter"
				data[8] = "what"
				data[9] = "i"
				data[10] = "am"  */
		
		String[] data = str.split("[\\s,.]+");  
		
		//Key → the word (String)
		//Value → its frequency (Integer)
		/*{
			  "i" = 3,
			  "am" = 4,
			  "who" = 1
			} */
			
		Map<String, Integer> hm=new HashMap<>();
		
		
		// if data is an array then no parenthesis (data.length). If data is a String use parenthesis (data.length())
		for (int i=0 ; i<data.length;i++) {
			int count = 0;
			for (int j = 0; j<data.length;j++) {
			if(data[i].equals(data[j])) {
				count++;
				
				hm.put(data[i], count);
			}
		}
	}
System.out.println(hm);
  }
}
