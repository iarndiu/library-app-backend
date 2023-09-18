package com.iarndiu.springbootlibrary.dao;
import com.iarndiu.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
