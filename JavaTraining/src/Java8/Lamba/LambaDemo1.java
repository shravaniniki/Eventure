package Java8.Lamba;

@FunctionalInterface
interface EligibleToVote{
	public boolean isEligible(int age);
}
public class LambaDemo1 {

	public static void verifyEligibility(int[] ages,EligibleToVote logic) {
		for(int age:ages) {
			if(logic.isEligible(age)) {
				System.out.println(age+" is eligible");
			}else {
				System.out.println(age+" is not eligible");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[] = {22,15,23,17,8};
		
//		EligibleToVote eligible=(personAge)->{
////			if(personAge>=18) {
////				return true;
////			}
////			return false;
////			
//			// or
//			return personAge>=18 ? true:false;
//		};
		//or 
		EligibleToVote eligible=(personAge)->personAge>=18 ? true:false;
		
		verifyEligibility(ages,eligible);
		//or 
//		verifyEligibility(ages,(personAge)-> personAge>=18 ? true:false);

	}

}
