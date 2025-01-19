package lk.ijse.libraraymanagement.service;


import lk.ijse.libraraymanagement.dto.LibStaffDTO;
import lk.ijse.libraraymanagement.dto.MemberDTO;

import java.util.List;

public interface StaffService {

    void saveStaffMember(LibStaffDTO staffMember);
    void updateStaffMember(String staffId,LibStaffDTO staffMember);
    void deleteStaffMember(String staffId);
    LibStaffDTO getSelectedStaffMember(String staffId);
    List<LibStaffDTO> getAllStaffMembers();
}
