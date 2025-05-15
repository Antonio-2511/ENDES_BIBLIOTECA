package com.endes.biblioteca.catalogo;
import com.endes.biblioteca.model.BookItem;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CatalogTest {
	
	private Catalog catalog;

    @Before
    public void setUp() {
        catalog = new Catalog();
        BookItem book = new BookItem(
                "123456789",
                "Java Básico",
                "Libro de introducción a Java",
                "OpenLibros",
                "2022-01-01",
                300,
                "Español",
                "B001",
                "TAG001",
                false,
                "Juan Pérez"
        );
        catalog.createBookItem(book);
    }

    @Test
    public void testSearchByTitle() {
        BookItem result = catalog.searchByTitle("Java Básico");
        assertNotNull(result);
        assertEquals("Java Básico", result.getTitle());
    }

    @Test
    public void testGetBookItem() {
        BookItem result = catalog.getBookItem("123456789");
        assertNotNull(result);
        assertEquals("123456789", result.getISBN());
    }

    @Test
    public void testDeleteBookItem() {
        catalog.deleteBookItem("123456789");
        BookItem result = catalog.getBookItem("123456789");
        assertNull(result);
    }


}
