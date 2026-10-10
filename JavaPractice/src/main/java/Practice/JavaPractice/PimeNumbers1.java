package Practice.JavaPractice;

public class PimeNumbers1 {
		
		static boolean prime(int n) {	
			if(n<=1) {
				return false;
			}
			else {
				for (int i=2; i<n ; i++) {
					if (n%i==0) {
						return false;
					}
					
				}
			}
			return true;
		}

		public static void main(String[] args) {
			System.out.println(prime(2));
		}
	}


