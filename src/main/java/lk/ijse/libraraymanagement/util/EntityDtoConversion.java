package lk.ijse.libraraymanagement.util;


import lk.ijse.libraraymanagement.dto.BookDTO;
import lk.ijse.libraraymanagement.entities.BookEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EntityDtoConversion {
    private final ModelMapper modelMapper;

    public BookDTO toBookDTO(BookEntity book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public BookEntity toBookEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, BookEntity.class);
    }
    public List<BookDTO> toBookDTO(List<BookEntity> books) {
        return modelMapper.map(books,new TypeToken<List<BookDTO>>(){}.getType());
    }

}
