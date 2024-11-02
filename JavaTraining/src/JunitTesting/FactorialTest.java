package JunitTesting;
import static org.junit.Assert.assertEquals;
//parameterized test
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FactorialTest {

	private Factorial fact;
	private Calculator cal;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		fact=new Factorial();
		cal=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		fact=null;
		cal=null;
	}

	@ParameterizedTest
	@ValueSource(ints= {5,2,6,12})
	void testFindFactorial(int n) {
		int result=fact.findFactorial(n);
		
		if(n==5)
			assertEquals(120,result,"5 factorial is: 120");
		else if(n==2)
			assertEquals(2,result,"2 factorial is: 2");
		else if(n==6)
			assertEquals(720,result,"6 factorial is: 720");
		else if(n==12)
			assertEquals(12990,result,"12 factorial is: 12990");
	}
	
	@ParameterizedTest
	@CsvSource({"2,3,5","10,23,43","1,2,3"})
	void testAdd(int a,int b,int result) {
		int actual=cal.add(a, b);
		assertEquals(result,actual,a+"+"+b+"="+result);
	}

	//we can use disabled annotation to skip the test case for testing
	//we also have CSVFileSource for.csv file testing
}
