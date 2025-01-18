package lk.ijse.libraraymanagement.service;

import lk.ijse.libraraymanagement.dto.BookDTO;

import java.awt.print.Book;
import java.util.List;

public interface BookService {


    void saveBook(BookDTO book);
    void updateBook(String bookId,BookDTO book);
    void deleteBook(String bookId);
    BookDTO getSelectedBook(String bookId);
    List<BookDTO> getAllBooks();


}
