package pkgException;
import pkgLibrary.Book;

public class BookException extends Exception{
	
	private Book book;
	private String id;
	public BookException(Book book) {
		super();
		this.book = book;
	
	}
	public BookException(String id) {
		super();
		this.id = id;
		
	}
	protected Book getB() {
		return book;
	}
	protected String getID() {
		return id;
	}

}
