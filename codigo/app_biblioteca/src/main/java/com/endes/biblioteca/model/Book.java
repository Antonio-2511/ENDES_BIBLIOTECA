package com.endes.biblioteca.model;

public abstract class Book {
	
	protected String ISBN;
    protected String title;
    protected String summary;
    protected String publisher;
    protected String publicationDate;
    protected int numberOfPages;
    protected String language;
    protected String author;

    // Constructor
    public Book(String ISBN, String title, String summary, String publisher,
                String publicationDate, int numberOfPages, String language,String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.summary = summary;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.author=author;
    }

    // getters y setters de los atributos

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    


}
