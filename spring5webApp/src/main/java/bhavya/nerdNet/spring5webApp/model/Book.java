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
	
	public Book(String title, String isbn, String publisher, Set<Author> boo) {
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.boo = boo;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	private String title;
	private String isbn;
	private String publisher;
	
	@ManyToMany
	private Set<Author> boo = new HashSet();
	
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
	
	public Set<Author> getBoo() {
		return boo;
	}
	
	public void setBoo(Set<Author> boo) {
		this.boo = boo;
	}
	
	
	
	
	
	public Long getId() {
		return id;
	}
	
}


