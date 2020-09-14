package fi.lehtinen.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.lehtinen.Bookstore.domain.Book;
import fi.lehtinen.Bookstore.domain.BookRepository;
import fi.lehtinen.Bookstore.domain.Category;
import fi.lehtinen.Bookstore.domain.CategoryRepository;


@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner Bookstore(BookRepository brepository,CategoryRepository crepository) {
		return (args) -> {
			log.info("save books");
			crepository.save(new Category("Horror")); // uusi kategoria
			crepository.save(new Category("Fantasy"));
			
			brepository.save(new Book("Harry Potter","J.K Rowling","3898208029",1985,20.00,crepository.findByName("Horror").get(0)));
			brepository.save(new Book("Kirja","Matti Meikäläinen","820982908",1987,30.59,crepository.findByName("Fantasy").get(0)));	
			
			log.info("fetch all books");
			for (Book book : brepository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}