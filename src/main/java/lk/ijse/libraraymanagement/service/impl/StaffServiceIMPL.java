package lk.ijse.libraraymanagement.service.impl;


import lk.ijse.libraraymanagement.dto.LibStaffDTO;
import lk.ijse.libraraymanagement.dto.Role;
import lk.ijse.libraraymanagement.service.StaffService;
import lk.ijse.libraraymanagement.util.UtilityData;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaffServiceIMPL implements StaffService {


    @Override
    public void saveStaffMember(LibStaffDTO staffMember) {
        staffMember.setStaffId(UtilityData.generateStaffId());
        System.out.println(staffMember);
    }

    @Override
    public void updateStaffMember(String staffId, LibStaffDTO staffMember) {
        // Logic to update staff member
    }

    @Override
    public void deleteStaffMember(String staffId) {
        // Logic to delete staff member
    }

    @Override
    public LibStaffDTO getSelectedStaffMember(String staffId) {
        return new LibStaffDTO(
                "S001",
                "John",
                "Doe",
                "john.doe@example.com",
                LocalDate.parse("2021-01-15"),
                LocalDate.parse("2022-01-15"),
                Role.ADMIN
        );
    }

    @Override
    public List<LibStaffDTO> getAllStaffMembers() {
        List<LibStaffDTO> staffList = new ArrayList<>();
        staffList.add(new LibStaffDTO("S001", "John", "Doe", "john.doe@example.com", LocalDate.parse("2021-01-15"), LocalDate.parse("2022-01-15"), Role.ADMIN));
        staffList.add(new LibStaffDTO("S002", "Jane", "Smith", "jane.smith@example.com", LocalDate.parse("2020-03-10"), LocalDate.parse("2021-03-10"), Role.ADMIN));
        staffList.add(new LibStaffDTO("S003", "Alice", "Johnson", "alice.johnson@example.com", LocalDate.parse("2019-07-22"), LocalDate.parse("2020-07-22"), Role.OFFICER));
        staffList.add(new LibStaffDTO("S004", "Bob", "Brown", "bob.brown@example.com", LocalDate.parse("2018-05-30"), LocalDate.parse("2019-05-30"), Role.LIBRARIAN));
        staffList.add(new LibStaffDTO("S005", "Charlie", "Davis", "charlie.davis@example.com", LocalDate.parse("2017-11-05"), LocalDate.parse("2018-11-05"), Role.OFFICER));
        return staffList;
    }
}

