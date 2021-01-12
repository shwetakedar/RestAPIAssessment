package pojoClasses;


public class ExchangeRate {
	
	private String base;
	private String date;
	private RatesPojo rates;


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}
	
	public RatesPojo getRates() {
		return rates;
	}

	public void setRates(RatesPojo rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return "ExchangeRate [base=" + base + ", date=" + date + ", rates=" + rates + "]";
	}
}
