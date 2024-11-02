package MockitoDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;

class MoneyTransferServiceTest {

	@Mock
	private CurrencyConverter cc;
	
	@InjectMocks
	private MoneyTransferService mts;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);//enable mocking through annotations
	}
	
	
	@Test
	void testMoneyTransfer() {
//		CurrencyConvertor cc=Mockito.mock(CurrencyConvertor.class); //getting mock of currency convertor
		Mockito.when(cc.conversion(12000,"INR","USD")).thenReturn(142.89);
//		MoneyTransferService service=new MoneyTransferService(cc); //passing mck object to moneytransferservice 
		
		double result=mts.moneyTransfer(12000, "INR", "USD");
		System.out.println("result is: "+result);
		assertEquals(142.89,result);
		
//		Mockito.verify(cc).conversion(12000, "INR","USD");//verify the behaviors
	}

}
