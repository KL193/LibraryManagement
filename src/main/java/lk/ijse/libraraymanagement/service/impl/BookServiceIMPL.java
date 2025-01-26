package lk.ijse.libraraymanagement.service.impl;


import lk.ijse.libraraymanagement.dto.BookDTO;
import lk.ijse.libraraymanagement.service.BookService;
import lk.ijse.libraraymanagement.util.UtilityData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceIMPL implements BookService {

    @Override
    public void saveBook(BookDTO book) {
        book.setBookId(UtilityData.generateBookId());
        System.out.println("From service layer"+book);
    }

    @Override
    public void updateBook(String bookId, BookDTO book) {

    }

    @Override
    public void deleteBook(String bookId) {

    }

    @Override
    public BookDTO getSelectedBook(String bookId) {
        BookDTO book = new BookDTO();

        book.setBookId("B12345");
        book.setTitle("Effective Java");
        book.setPublisher("Addison-Wesley");
        book.setIsbn("978-0134685991");
        book.setAuthor("Joshua Bloch");
        book.setEdition("3rd");
        book.setPrice(45.99);
        book.setTotalQty(100);
        book.setAvilableQty(80);
        book.setLastUpdatedDate(LocalDate.of(2025, 1, 12));
        return book;
    }

    @Override
    public List<BookDTO> getAllBooks() {

        List<BookDTO> books = new ArrayList<>();

        books.add(new BookDTO("B12345", "Effective Java", "Addison-Wesley",
                "978-0134685991", "Joshua Bloch", "3rd", 45.99, 100, 80,
                LocalDate.of(2025, 1, 12), null));

        books.add(new BookDTO("B12346", "Clean Code", "Prentice Hall",
                "978-0132350884", "Robert C. Martin", "1st", 39.99, 120, 110,
                LocalDate.of(2025, 1, 11), null));

        books.add(new BookDTO("B12347", "Design Patterns", "Addison-Wesley",
                "978-0201633610", "Erich Gamma", "1st", 55.99, 200, 190,
                LocalDate.of(2025, 1, 10), null));

        books.add(new BookDTO("B12348", "Refactoring", "Addison-Wesley",
                "978-0134757599", "Martin Fowler", "2nd", 49.99, 150, 140,
                LocalDate.of(2025, 1, 9), null));

        books.add(new BookDTO("B12349", "The Pragmatic Programmer", "Addison-Wesley",
                "978-0201616224", "Andrew Hunt", "20th Anniversary Edition", 42.99, 90, 85,
                LocalDate.of(2025, 1, 8), null));

        return books;

    }
}