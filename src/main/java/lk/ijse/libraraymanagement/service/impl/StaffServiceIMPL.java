package lk.ijse.libraraymanagement.service.impl;


import lk.ijse.libraraymanagement.dto.LibStaffDTO;
import lk.ijse.libraraymanagement.dto.Role;
import lk.ijse.libraraymanagement.service.StaffService;
import lk.ijse.libraraymanagement.util.UtilityData;
import org.springframework.stereotype.Service;
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

    }

    @Override
    public void deleteStaffMember(String staffId) {

    }

    @Override
    public LibStaffDTO getSelectedStaffMember(String staffId) {
        return new LibStaffDTO("S001", "John", "Doe", "john.doe@example.com", "2021-01-15", "2022-01-15", Role.ADMIN );
    }

    @Override
    public List<LibStaffDTO> getAllStaffMembers() {
        List<LibStaffDTO> staffList = new ArrayList<>();
        staffList.add(new LibStaffDTO("S001", "John", "Doe", "john.doe@example.com", "2021-01-15", "2022-01-15", Role.ADMIN ));
        staffList.add(new LibStaffDTO("S002", "Jane", "Smith", "jane.smith@example.com", "2020-03-10", "2021-03-10", Role.ADMIN));
        staffList.add(new LibStaffDTO("S003", "Alice", "Johnson", "alice.johnson@example.com", "2019-07-22", "2020-07-22", Role.OFFICER));
        staffList.add(new LibStaffDTO("S004", "Bob", "Brown", "bob.brown@example.com", "2018-05-30", "2019-05-30", Role.LIBRARIAN));
        staffList.add(new LibStaffDTO("S005", "Charlie", "Davis", "charlie.davis@example.com", "2017-11-05", "2018-11-05", Role.OFFICER));
        return staffList;
    }
}

