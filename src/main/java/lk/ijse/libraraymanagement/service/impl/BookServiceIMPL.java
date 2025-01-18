package lk.ijse.libraraymanagement.service.impl;


import lk.ijse.libraraymanagement.dto.BookDTO;
import lk.ijse.libraraymanagement.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceIMPL implements BookService {
    @Override
    public void saveBook(BookDTO book) {
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
        return null;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return List.of();
    }
}