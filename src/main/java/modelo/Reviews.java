package modelo;

public class Reviews {
	private int total_reviews;
	private float ratings;

	public Reviews(int total_reviews, int ratings) {
		super();
		this.total_reviews = total_reviews;
		this.ratings = ratings;
	}

	public int getTotal_reviews() {
		return total_reviews;
	}

	public void setTotal_reviews(int total_reviews) {
		this.total_reviews = total_reviews;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	
	
}
