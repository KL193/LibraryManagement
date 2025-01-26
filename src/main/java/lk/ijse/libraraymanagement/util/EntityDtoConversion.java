package lk.ijse.libraraymanagement.util;


import lk.ijse.libraraymanagement.dto.BookDTO;
import lk.ijse.libraraymanagement.dto.LibStaffDTO;
import lk.ijse.libraraymanagement.entities.BookEntity;
import lk.ijse.libraraymanagement.entities.StaffEntity;
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

    //Book
    public BookDTO toBookDTO(BookEntity book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public BookEntity toBookEntity(BookDTO bookDTO) {

        return modelMapper.map(bookDTO, BookEntity.class);
    }
    public List<BookDTO> toBookDTO(List<BookEntity> books) {
        return modelMapper.map(books,new TypeToken<List<BookDTO>>(){}.getType());
    }
    public List<BookDTO> toBookDTOList(List<BookEntity> books){
        return modelMapper.map(books,new TypeToken<List<BookDTO>>(){}.getType());
    }

    //Staff

    public LibStaffDTO libStaffDTO(StaffEntity staff) {
        return modelMapper.map(staff, LibStaffDTO.class);
    }

    public StaffEntity toStaffEntity(LibStaffDTO libStaffDTO) {
        return modelMapper.map(libStaffDTO, StaffEntity.class);
    }

    public List<LibStaffDTO> toLibStaffDTOList(List<StaffEntity> staffs) {
        return modelMapper.map(staffs,new TypeToken<List<LibStaffDTO>>(){}.getType());
    }

    public List<LibStaffDTO> libStaffDTOList(List<StaffEntity> staffs) {
        return modelMapper.map(staffs,new TypeToken<List<LibStaffDTO>>(){}.getType());
    }

}
