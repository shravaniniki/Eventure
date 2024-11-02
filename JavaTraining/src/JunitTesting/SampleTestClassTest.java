/**
 * 
 */
package JunitTesting;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class SampleTestClassTest {

	/**
	 * @throws java.lang.Exception
	 */
	
     private static SampleTestClass sample;
     
     @BeforeAll
     public static void SetUp() {
         sample = new SampleTestClass();
         System.out.println("Calculator.SetUpAll - BeforeAll");
     }
    
	@Test
	void testCase1() {
		boolean expectedResult=true;
		
		assertTrue(expectedResult,sample.isPrime(5));
		assertEquals(expectedResult,sample.isPrime(2));
		assertEquals(expectedResult,sample.isPrime(7));
		System.out.println("Result for Prime Number");
		
	}
	
private void assertTrue(boolean expectedResult, boolean prime) {
		// TODO Auto-generated method stub
		
	}

//	@Test
//	void testCase2() {
//		boolean expectedResult=true;
//		boolean actualResult=sample.isPrime(52);
//		assertEquals(expectedResult,actualResult);
//		System.out.println("Result for Prime Number");
//		
//	}
//	@Test
//	void testCase3() {
//		boolean expectedResult=true;
//		boolean actualResult=sample.isPrime(10);
//		assertEquals(expectedResult,actualResult);
//		System.out.println("Result for Prime Number");	
//	}



	@Test
	void testCase4() {
		boolean expectedResult=true;
		boolean actualResult=sample.isPalendrome("madam");
		assertEquals(expectedResult,actualResult);
		System.out.println("Result for Palendrome Number");
	}
	@Test
	void testCase5() {
		boolean expectedResult=true;
		boolean actualResult=sample.isPalendrome("ll");
		assertEquals(expectedResult,actualResult);
		System.out.println("Result for Palendrome Number");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		sample=null;
	}
}
