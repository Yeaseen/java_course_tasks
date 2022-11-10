package demo;

class Book {

	private String title;
	private String author;
	private float price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String titleIn) {
		this.title = titleIn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String titleIn, String authorIn, float priceIn) {
		super();
        
		if(titleIn == null ) {
			throw new IllegalArgumentException("The title is not correct");
        	
        }
		else if(authorIn == null ) {
			throw new IllegalArgumentException("The author name is not correct");
		}
		else if(priceIn < 0) {
			throw new IllegalArgumentException("The price is not correct");
		}
		
		this.title = titleIn;
		this.author = authorIn;
		this.price = priceIn;

	}
	
	
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
//	}


}






