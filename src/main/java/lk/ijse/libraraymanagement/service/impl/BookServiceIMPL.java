package lk.ijse.libraraymanagement.service.impl;


import lk.ijse.libraraymanagement.dao.BookDao;
import lk.ijse.libraraymanagement.dto.BookDTO;
import lk.ijse.libraraymanagement.entities.BookEntity;
import lk.ijse.libraraymanagement.exception.BookNotFoundException;
import lk.ijse.libraraymanagement.service.BookService;
import lk.ijse.libraraymanagement.util.EntityDtoConversion;
import lk.ijse.libraraymanagement.util.UtilityData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import lk.ijse.libraraymanagement.util.EntityDtoConversion;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
@RequiredArgsConstructor
public class BookServiceIMPL implements BookService {

    private final BookDao bookDao;
    private final EntityDtoConversion entityDTOConversion;

    @Override
    public void saveBook(BookDTO book) {
        book.setBookId(UtilityData.generateBookId());
        book.setLastUpdatedDate(UtilityData.generateTodayDate());
        book.setLastUpdatedTime(UtilityData.generateCreatedTime());
//        BookEntity bookEntity = entityDTOConversion.toBookEntity(book);
        bookDao.save(entityDTOConversion.toBookEntity(book));
    }

    @Override
    public void updateBook(String bookId, BookDTO book) {

        Optional<BookEntity> foundBook = bookDao.findById(bookId);
        if(!foundBook.isPresent()){
            throw new BookNotFoundException("Book not found");
        }
        foundBook.get().setTitle(book.getTitle());
        foundBook.get().setPublisher(book.getPublisher());
        foundBook.get().setIsbn(book.getIsbn());
        foundBook.get().setAuthor(book.getAuthor());
        foundBook.get().setEdition(book.getEdition());
        foundBook.get().setPrice(book.getPrice());
        foundBook.get().setAvilableQty(book.getAvilableQty());
        foundBook.get().setTotalQty(book.getTotalQty());
        foundBook.get().setLastUpdatedDate(UtilityData.generateTodayDate());
        foundBook.get().setLastUpdatedTime(UtilityData.generateCreatedTime());
    }

    @Override
    public void deleteBook(String bookId) {
        Optional<BookEntity> foundBook = bookDao.findById(bookId);
        if (!foundBook.isPresent()) {
            throw new BookNotFoundException("Book not found");
        }
        bookDao.deleteById(bookId);
    }

    @Override
    public BookDTO getSelectedBook(String bookId) {
        Optional<BookEntity> foundBook = bookDao.findById(bookId);
        if(!foundBook.isPresent()){
            throw new BookNotFoundException("Book not found");
        }
        return entityDTOConversion
                .toBookDTO(bookDao.getReferenceById(bookId));
    }

    @Override
    public List<BookDTO> getAllBooks() {
        List<BookEntity> allBooks =
                bookDao.findAll();
        return entityDTOConversion.toBookDTOList(allBooks);
    }


//    public List<BookDTO> getAllBooks() {
//
//        List<BookDTO> books = new ArrayList<>();
//
//        books.add(new BookDTO("B12345", "Effective Java", "Addison-Wesley",
//                "978-0134685991", "Joshua Bloch", "3rd", 45.99, 100, 80,
//                LocalDate.of(2025, 1, 12), null));
//
//        books.add(new BookDTO("B12346", "Clean Code", "Prentice Hall",
//                "978-0132350884", "Robert C. Martin", "1st", 39.99, 120, 110,
//                LocalDate.of(2025, 1, 11), null));
//
//        books.add(new BookDTO("B12347", "Design Patterns", "Addison-Wesley",
//                "978-0201633610", "Erich Gamma", "1st", 55.99, 200, 190,
//                LocalDate.of(2025, 1, 10), null));
//
//        books.add(new BookDTO("B12348", "Refactoring", "Addison-Wesley",
//                "978-0134757599", "Martin Fowler", "2nd", 49.99, 150, 140,
//                LocalDate.of(2025, 1, 9), null));
//
//        books.add(new BookDTO("B12349", "The Pragmatic Programmer", "Addison-Wesley",
//                "978-0201616224", "Andrew Hunt", "20th Anniversary Edition", 42.99, 90, 85,
//                LocalDate.of(2025, 1, 8), null));
//
//        return books;
//
//    }
}