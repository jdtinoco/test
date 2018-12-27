package deors.demos.microservices.bookrecservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.client.discovery.EnableDiscoveryClient

public class BookrecserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookrecserviceApplication.class, args);
	}

}


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id @GeneratedValue private Long id;
    private String title;
    private String author;
}

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {

    @Query("select b from Book b order by RAND()")
    List<Book> getBooksRandomOrder();
}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/bookrec")
    public Book getBookRecommendation() {
        return bookRepository.getBooksRandomOrder().get(0);
    }
}
