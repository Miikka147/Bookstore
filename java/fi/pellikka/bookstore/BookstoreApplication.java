package fi.pellikka.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.pellikka.bookstore.domain.Book;
import fi.pellikka.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner bookstoreDemo(BookRepository repository) {
		return (args) -> {
			System.out.println("put books to database, in this case H2");
			repository.save(new Book("Hopeasiivet", "Camilla Läckberg"));
			repository.save(new Book("Kultahäkki", "Camilla Läckberg"));
			
			System.out.println("list all books");
			for (Book book : repository.findAll()) {
				System.out.println(book.toString());
			}

		};
	}*/
}
