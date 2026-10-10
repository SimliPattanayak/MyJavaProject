package Practice.JavaPractice;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		reverseEachWordOfString("Java is a good programming langauge");
	}
	
	static void reverseEachWordOfString(String inputString)
	{
	 String[] words = inputString.split(" ");
	 String reverseString = "";
	 
	 for (int i = 0; i<words.length; i++) {
	 String word = words[i];
	 String nstr = "";
	
	 for (int j = word.length()-1; j>=0; j--) {
	 nstr = nstr+word.charAt(j);
	 }
	 reverseString = reverseString + nstr + " ";
	 }
	 
	 System.out.println(inputString);
	 System.out.println(reverseString);

	}

}

//Code only in the Main Method
/*class Main {
    public static void main(String[] args) {
       String s= "Java is a good programming langauge";

	 String[] words = s.split(" ");
	 String reverse = "";
	 
	 for (int i = 0; i<words.length; i++) {
	 String word = words[i];
	 String nstr = "";
	
	 for (int j = word.length()-1; j>=0; j--) {
	 nstr = nstr+word.charAt(j);
	 }
	 reverse = reverse + nstr + " ";
	 }
	 
	 System.out.println(s);
	 System.out.println(reverse);

	}
}*/


//Using StringBuilder
/*class Main {
    public static void main(String[] args) {

    String s = "SIMLI PATTANAYAK";

        String[] words = s.split(" ");
    StringBuilder reversestring = new StringBuilder();

        for(int i=0; i<words.length;i++){
           String word = words[i];
        StringBuilder reversechar = new StringBuilder();
            
            for(int j=word.length()-1; j>=0; j--){
                 reversechar.append(word.charAt(j));
                
            }

            reversestring.append(reversechar.append(" ")) ;
        }

        System.out.println(reversestring);
        
        
            }
        }*/
