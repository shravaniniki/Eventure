package Interface.Problems;

interface Computable{
	public void sumOfNumbers(int[] num);
}

class SumNumbers implements Computable{
	int sum=0;
	public void sumOfNumbers(int[] nums) {
		for(int n:nums) {
			sum+=n;
		}
		
		System.out.println("Sum of numbers is: "+sum);
	}
	
}
public class SumInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNumbers s=new SumNumbers();
		int[] arr= {1,3,4,6,7};
		
		s.sumOfNumbers(arr);
	}

}
