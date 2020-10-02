package modelo;

public class Price {
	
	private boolean discounted;
	private float current_price, 
		before_price,
		savings_amount,
		savings_percent;
	private String currency;
	public Price(boolean discounted, int current_price, int before_price, int savings_amount, int savings_percent,
			String currency) {
		super();
		this.discounted = discounted;
		this.current_price = current_price;
		this.before_price = before_price;
		this.savings_amount = savings_amount;
		this.savings_percent = savings_percent;
		this.currency = currency;
	}
	
	
	
	@Override
	public String toString() {
		return currency + ": " + current_price;
	}


	public boolean isDiscounted() {
		return discounted;
	}
	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}
	public float getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(float current_price) {
		this.current_price = current_price;
	}
	public float getBefore_price() {
		return before_price;
	}
	public void setBefore_price(float before_price) {
		this.before_price = before_price;
	}
	public float getSavings_amount() {
		return savings_amount;
	}
	public void setSavings_amount(float savings_amount) {
		this.savings_amount = savings_amount;
	}
	public float getSavings_percent() {
		return savings_percent;
	}
	public void setSavings_percent(float savings_percent) {
		this.savings_percent = savings_percent;
	}
	public void setSavings_percent(int savings_percent) {
		this.savings_percent = savings_percent;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
