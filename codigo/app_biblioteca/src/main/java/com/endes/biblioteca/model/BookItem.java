package com.endes.biblioteca.model;

public class BookItem extends Book {
	
	private String barcode;
    private String tag;
    private boolean isReferenceOnly;

    // Constructor
    public BookItem(String ISBN, String title, String summary, String publisher,
        String publicationDate, int numberOfPages, String language,
        String barcode, String tag, boolean isReferenceOnly, String author) {
        super(ISBN, title, summary, publisher, publicationDate, numberOfPages, language, author);
        this.barcode = barcode;
        this.tag = tag;
        this.isReferenceOnly = isReferenceOnly;
    }

    // getters y setters de los atributos una vez mas

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public void setReferenceOnly(boolean referenceOnly) {
        isReferenceOnly = referenceOnly;
    }


}
