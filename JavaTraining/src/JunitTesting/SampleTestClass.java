package JunitTesting;

public class SampleTestClass {
		// TODO Auto-generated method stub
		public boolean isPrime(int num) {
			 
	        if (num <= 1) {
	            return false;
	        }else {
	        for (int i = 2; i <= Math.sqrt(num); i++)
	            if (num % i == 0)
	                return false;
	        }
	        return true;
		}
		
		public boolean isPalendrome(String str) {
			 int i = 0;
			 int j = str.length() - 1;

		        while (i < j) {

		            if (str.charAt(i) != str.charAt(j)) {
		                return false;
		            }
		            i++;
		            j--;
		        }

		        return true;
		}
	}

