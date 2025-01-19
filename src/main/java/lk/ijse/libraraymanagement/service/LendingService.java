package lk.ijse.libraraymanagement.service;

import lk.ijse.libraraymanagement.dto.LendingDTO;
import lk.ijse.libraraymanagement.dto.MemberDTO;

import java.util.List;

public interface LendingService {
    void addLending(LendingDTO lendingDTO);
    void handOverLending(String lendingID);
    void deleteLending(String lendingID);
    LendingDTO getSpecificLending(String lendingID);
    List<LendingDTO> getAllLendings();
}
