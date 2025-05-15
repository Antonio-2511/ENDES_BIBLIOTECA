package com.endes.biblioteca.catalogo;
import com.endes.biblioteca.model.BookItem;
import com.endes.biblioteca.services.Manage;
import com.endes.biblioteca.services.Search;

import java.util.HashMap;
import java.util.Map;

public class Catalog implements Search, Manage{
	
	private Map<String, BookItem> books = new HashMap<>();
	private BookItem resultado;
	
	

	@Override
	public void createBookItem(BookItem bookItem) {
		books.put(bookItem.getISBN(), bookItem);
	}

	@Override
	public void updateBookItem(BookItem bookItem) {
		books.put(bookItem.getISBN(), bookItem);		
	}

	@Override
	public void deleteBookItem(String ISBN) {
		books.remove(ISBN);
		
	}

	@Override
	public BookItem getBookItem(String ISBN) {
		 resultado = null;
	        if (books.containsKey(ISBN)) {
	            resultado = books.get(ISBN);
	        }
	        return resultado;

	}

	@Override
	public BookItem searchByTitle(String title) {
		resultado = null;
        for (BookItem libro : books.values()) {
            if (libro.getTitle().equalsIgnoreCase(title)) {
                resultado = libro;
            }
        }
        return resultado;

	}

	@Override
	public BookItem searchByAuthor(String author) {
		resultado = null;
        for (BookItem libro : books.values()) {
            if (libro.getAuthor().equalsIgnoreCase(author)) {
                resultado = libro;
            }
        }
        return resultado;

	}

	

}
