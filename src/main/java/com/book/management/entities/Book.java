package com.book.management.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "book")
public class Book implements Serializable {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

	@NotBlank(message="{validation.categoryname.NotBlank.message}")
    @Column(name = "CATEGORY_NAME")
    private String categoryName;

	@NotNull
    @Column(name = "PUBLISHER")
    private String publisher;

    @NotBlank(message="{validation.title.NotBlank.message}")
    @Column(name = "TITLE")
    private String title;

    @NotBlank(message="{validation.isbn.NotBlank.message}")
    @Column(name = "ISBN")
    private String isbn;
    
    @NotNull
    @Column(name = "PRICE")
    private Float price;
	
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

    @Override
    public String toString() {
        return "Book - Id: " + id + ", Category name: " + categoryName
                + ", Publisher: " + publisher + ", Title: " + title
                + ", ISBN: " + isbn + ", Price: " + price;
    }
}
