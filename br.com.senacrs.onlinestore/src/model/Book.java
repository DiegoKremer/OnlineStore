package model;

public class Book extends Item {
	
	private int isbn;	 // Variable used to store the ISBN of the book, which also functions as the book unique code.
	private Author author; // Variable used to store the author of the book.
	private Publisher publisher; // Variable used to store the publisher of the book.
	private String language; // Variable used to store the language on which the book is written.
	private String genre; // Variable used to store the genre in which the book belongs.
	private int pages; // Variable to store the number of pages the book contains.
	private Cart[] cart; // Variable to check which carts books are in. 
	
	
	// Constructor
	
	
	public Book (int b_code, String b_description, String b_name, double b_price, int b_isbn, Author b_author, Publisher b_publisher, String b_language, String b_genre, int b_pages) {
		super(b_code, b_description, b_name, b_price);
		this.isbn = b_isbn;
		this.author = b_author;
		this.publisher = b_publisher;
		this.language = b_language;
		this.pages = b_pages;
		
	}

	
	// Below are the setters and getters.



	public int getBook_isbn() {
		return isbn;
	}


	public void setBook_isbn(int book_isbn) {
		this.isbn = book_isbn;
	}


	public Author getBook_author() {
		return author;
	}


	public void setBook_author(Author book_author) {
		this.author = book_author;
	}


	public Publisher getBook_publisher() {
		return publisher;
	}


	public void setBook_publisher(Publisher book_publisher) {
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
