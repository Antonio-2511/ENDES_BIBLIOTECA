package com.endes.biblioteca.services;
import com.endes.biblioteca.model.BookItem;

public interface Manage {
	
	//Interfaz para poder gestionar los libros
	
	void createBookItem(BookItem bookItem);
	void updateBookItem(BookItem bookItem);
	void deleteBookItem(String ISBN);
	BookItem getBookItem(String ISBN);
	
}
