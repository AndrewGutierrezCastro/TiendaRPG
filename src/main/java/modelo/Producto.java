package modelo;

public class Producto {
	
	/*
	 * "position":{ "page":1, "position":1, "global_position":1 },
	 * "asin":"B07T91KFMP", 
	 * "price":{ 
	 * 			"discounted":false, 
	 * 			"current_price":499.99,
	 * 			"currency":"USD",
	 * 			"before_price":0, 
	 * 			"savings_amount":0,
	 * 			"savings_percent":0
	 * 			}, 
	 * "reviews":{ "total_reviews":312, "rating":4.5 },
	 * "url":"https://www.amazon.com/dp/B07T91KFMP", "score":"1404.00",
	 * "sponsored":false, 
	 * "amazonChoice":false, 
	 * "bestSeller":false,
	 * "amazonPrime":true,
	 * "title":"Rapsodo Mobile Launch Monitor | MLM | Pro-Level Accuracy | Video Replay | Shot Tracer | “Best Indoor and Outdoor Golf Laun...",
	 * "thumbnail":"https://m.media-amazon.com/images/I/61h7xp5JztL._AC_UL320_.jpg"
	 */
	private String title,
					 asin, 
					 url,
					 score,
					 sponsored,
					 amazonChoice,
					 bestSeller,
					 amazonPrime,
					 thumbnail;
	private Price price;

	private Position position;
	
	private Reviews reviews;

	public Producto(String title, String asin, String url, String score, String sponsored, String amazonChoice,
			String bestSeller, String amazonPrime, String thumbnail, Price price, Position position, Reviews reviews) {
		super();
		this.title = title;
		this.asin = asin;
		this.url = url;
		this.score = score;
		this.sponsored = sponsored;
		this.amazonChoice = amazonChoice;
		this.bestSeller = bestSeller;
		this.amazonPrime = amazonPrime;
		this.thumbnail = thumbnail;
		this.price = price;
		this.position = position;
		this.reviews = reviews;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [title=" + title + ", asin=" + asin + ", url=" + url + ", score=" + score + ", sponsored="
				+ sponsored + ", amazonChoice=" + amazonChoice + ", bestSeller=" + bestSeller + ", amazonPrime="
				+ amazonPrime + ", thumbnail=" + thumbnail + ", price=" + price;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getSponsored() {
		return sponsored;
	}

	public void setSponsored(String sponsored) {
		this.sponsored = sponsored;
	}

	public String getAmazonChoice() {
		return amazonChoice;
	}

	public void setAmazonChoice(String amazonChoice) {
		this.amazonChoice = amazonChoice;
	}

	public String getBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(String bestSeller) {
		this.bestSeller = bestSeller;
	}

	public String getAmazonPrime() {
		return amazonPrime;
	}

	public void setAmazonPrime(String amazonPrime) {
		this.amazonPrime = amazonPrime;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}
	
	
	
	

	
}
