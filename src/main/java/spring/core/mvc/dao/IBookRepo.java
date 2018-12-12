package spring.core.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.core.mvc.model.Book;

@Repository
public interface IBookRepo extends JpaRepository<Book, Long> {
	public Book findByTitle(String title);

}
