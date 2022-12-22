package com.book.management.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.book.management.entities.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
