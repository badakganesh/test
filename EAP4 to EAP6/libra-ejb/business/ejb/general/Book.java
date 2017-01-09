package business.ejb.general;

import java.util.*;

public class Book implements java.io.Serializable {

private String isbn;
private String bookName;
private String authors;
private String price;


public String getIsbn(){
return this.isbn;
}

public String getBookName(){
return this.bookName;
}

public String getAuthors(){
return this.authors;
}

public String getPrice(){
return this.price;
}

public void setIsbn(String isbn ) {
	this.isbn = isbn ;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public void setAuthors(String authors) {
	this.authors = authors;
}

public void setPrice(String price) {
	this.price = price;
}

}
	
