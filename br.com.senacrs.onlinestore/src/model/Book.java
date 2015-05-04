package model;

public class Book extends Item {
	
	private int isbn;	 // Variable used to store the ISBN of the book, which also functions as the book unique code.
	private String author; // Variable used to store the author of the book.
	private String publisher; // Variable used to store the publisher of the book.
	private String language; // Variable used to store the language on which the book is written.
	private String genre; // Variable used to store the genre in which the book belongs.
	private int pages; // Variable to store the number of pages the book contains.
	private Cart[] cart; // Variable to check which carts books are in. 
	
	
	// Constructor
	
	public Book (int code, String description, String name, double price) 
	{
		super (code, description, name, price);
		
	}
	
	public Book (int code, String description, String name, double price, int isbn, String author, String publisher, String language, String genre, int pages) 
	{
		super(code, description, name, price);
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.language = language;
		this.genre = genre;
		this.pages = pages;
		
	}

	
	// Below are the setters and getters.



	public int getBook_isbn() {
		return isbn;
	}


	public void setBook_isbn(int book_isbn) {
		this.isbn = book_isbn;
	}


	public String getBook_author() {
		return author;
	}


	public void setBook_author(String book_author) {
		this.author = book_author;
	}


	public String getBook_publisher() {
		return publisher;
	}


	public void setBook_publisher(String book_publisher) {
		this.publisher = book_publisher;
	}


	public String getBook_language() {
		return language;
	}


	public void setBook_language(String book_language) {
		this.language = book_language;
	}


	public int getBook_pages() {
		return pages;
	}


	public void setBook_pages(int book_pages) {
		this.pages = book_pages;
	}


	public String getBook_genre() {
		return genre;
	}


	public void setBook_genre(String book_genre) {
		this.genre = book_genre;
	}


	public Cart[] getBook_cart() {
		return cart;
	}


	public void setBook_cart(Cart[] book_cart) {
		this.cart = book_cart;
	};
	
	
	
}
