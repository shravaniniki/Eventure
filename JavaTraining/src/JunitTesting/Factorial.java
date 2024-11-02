package JunitTesting;
//parameterized test
public class Factorial {

	public int findFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
}
