package model;

public class Book extends Item {
	
	private int n = 50;
	private int i = 0;
	
	private int isbn;	 // Variable used to store the ISBN of the book, which also functions as the book unique code.
	private String[] author = new String[n]; // Variable used to store the author of the book.
	private String publisher; // Variable used to store the publisher of the book.
	private String language; // Variable used to store the language on which the book is written.
	private String genre; // Variable used to store the genre in which the book belongs.
	private int pages; // Variable to store the number of pages the book contains.


	// Constructor

	public Book (int code, String description, String name, double price) 
	{
		super (code, description, name, price);

	}

	public Book (int code, String description, String name, double price, String author) {
		super(code, description, name, price);
	}

	public Book (int code, String description, String name, double price, int isbn, String[] author, String publisher, String language, String genre, int pages) 
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


	public int getiISBN() {
		return isbn;
	}


	public void setISBN(int book_isbn) {
		this.isbn = book_isbn;
	}


	public String[] getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		while (this.author[i] != null) {
		this.author[i] = author;
		i++;
		}
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String book_publisher) {
		this.publisher = book_publisher;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String book_language) {
		this.language = book_language;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int book_pages) {
		this.pages = book_pages;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String book_genre) {
		this.genre = book_genre;
	}


}
