package in.cdac.books;

public class Book {
	private String bookName;
	private Author bookAuthor;
	private double bookPrice;
	private int bookQty;
	
	Book(String bookName, Author bookAuthor, double bookPrice, int bookQty) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookQty = bookQty;
	}

	public String getBookName() {
		return bookName;
	}

	// getter setter
	public Author getBookAuthor() {
		return bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookQty() {
		return bookQty;
	}

	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}

	@Override
	public String toString() {
		return (bookName + " by " + bookAuthor + ", Price : " + bookPrice + ", QTY : " + bookQty);
	}
}
