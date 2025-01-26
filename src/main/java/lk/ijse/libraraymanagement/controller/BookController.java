package lk.ijse.libraraymanagement.controller;

import lk.ijse.libraraymanagement.dto.BookDTO;
import lk.ijse.libraraymanagement.exception.BookNotFoundException;
import lk.ijse.libraraymanagement.service.BookService;
import lk.ijse.libraraymanagement.service.impl.BookServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")

public class BookController {

    @GetMapping
    public String healthTest(){

        return "Book controller is running";
    }

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBook(@RequestBody BookDTO bookDTO){
        bookService.saveBook(bookDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //Delete book ekata adala logic eka
    @DeleteMapping("{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable String bookId){

        try {
            bookService.deleteBook(bookId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (BookNotFoundException e){

            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PatchMapping(("{bookId}"))
    public ResponseEntity<Void> updateBook(@RequestParam ("bookId") String id, @RequestBody BookDTO bookDTO){
        try {
            bookService.updateBook(id, bookDTO);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (BookNotFoundException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    @GetMapping(value = "{bookId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDTO> getSelectedBook(@PathVariable String bookId){
        try {
            return ResponseEntity.ok(bookService.getSelectedBook(bookId));
        }catch (BookNotFoundException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }



    @GetMapping(value = "getall",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BookDTO>> getAllBooks(){

        return ResponseEntity.ok(bookService.getAllBooks());
    }

 }


