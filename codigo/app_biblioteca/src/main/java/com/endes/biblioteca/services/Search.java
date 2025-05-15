package com.endes.biblioteca.services;

import com.endes.biblioteca.model.BookItem;

public interface Search {
	
	//Interfaz para buscar libros por titulo o por autor
	
	BookItem searchByTitle(String title);
	BookItem searchByAuthor(String author);
	
	

}
