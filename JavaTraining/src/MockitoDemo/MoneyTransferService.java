package MockitoDemo;



public class MoneyTransferService {
	private CurrencyConverter currencyConverter;
	
	public MoneyTransferService(CurrencyConverter currencyConevrter) {
		this.currencyConverter = currencyConverter;
	}
	public double moneyTransfer(double amount, String fromCountry, String toCountry) {
		System.out.println("MoneyTranserSerice.moneyTransfer()");
		double result = currencyConverter.conversion(amount, fromCountry, toCountry);
		return result;
	}
	
}
