package modelo;

public class Producto {
	/*
	 * "item_id": "153454286909",
	 * "pic_url": "https://thumbs2.ebaystatic.com/m/mNcjg7SiEMd5qNwIc0lAXYA/140.jpg",
	 * "url": "https://www.ebay.com/itm/MICHAEL-KORS-BAR-PAVE-STATION-CHAIN-NECKLACE-ROSE-GOLD-TONE-60-NEW-/153454286909",
	 * "title": "MICHAEL KORS BAR PAVE STATION CHAIN NECKLACE ROSE GOLD TONE 60" NEW",
	 * "price": "$59.99"
	 * */
	private final String item_id, 
						 pic_url,
						 url,
						 title,
						 price;
	
	
	public Producto(String item_id, String pic_url, String url, String title, String price) {
		super();
		this.item_id = item_id;
		this.pic_url = pic_url;
		this.url = url;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return  "item_id: " + getItem_id() +"\n"
				+"pic_url: " + getPic_url() +"\n"
				+"url: " + getUrl() +"\n"
				+"title: " + getTitle() +"\n"
				+"price: " + getPrice();
	}

	public String getItem_id() {
		return item_id;
	}

	public String getPic_url() {
		return pic_url;
	}

	public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public String getPrice() {
		return price;
	}
	
	
}
