package bhavya.nerdNet.spring5webApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by barora on 12/20/2017.
 */

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String isbn;
	private String publisher;
	
	@ManyToMany
	private Set<Author> book = new HashSet();
	
	public Book(){
	
	}
	
	public Book(String title, String isbn, String publisher, Set<Author> book) {
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.book = book;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Set<Author> getBook() {
		return book;
	}
	
	public void setBook(Set<Author> book) {
		this.book = book;
	}
	
	public Long getId() {
		return id;
	}
	
}


