package Collections;
import java.util.HashSet;

public class HashsetDemo{

	public static void addDataIntoSet(HashSet numSet) {
		numSet.add(100);
		numSet.add(200);
		numSet.add(300);
		numSet.add(600);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> numSet = new HashSet<Integer>();
		
		System.out.print(numSet);
		
		numSet.add(100);
		numSet.add(200);
		numSet.add(300);
		numSet.add(400);
		
		System.out.println(numSet);
		System.out.println(numSet.size());
		
	}

}
