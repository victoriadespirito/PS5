package pkgEmpty;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import pkgException.BookException;
import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class BookTest {
	
	@Test
	public void GetBookTest() throws BookException {
		Book b = new Book("bk100");
		assertEquals("Commputer",b.getGenre());
	}
	
	@Test
	public void AddBookTest() throws BookException{
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		cat.AddBook(new Book("bk113","author", "title","genre", 50.0, new Date(2016,4,1),
			"description", 22.10));
		Book b = new Book("bk113");
		assertEquals("description",b.getDescription());
		
	}
}



