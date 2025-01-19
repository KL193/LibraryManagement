package lk.ijse.libraraymanagement.service.impl;

import lk.ijse.libraraymanagement.dto.LendingDTO;
import lk.ijse.libraraymanagement.service.LendingService;
import lk.ijse.libraraymanagement.util.UtilityData;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LendingServiceIMPL implements LendingService {


    @Override
    public void addLending(LendingDTO lendingDTO) {
        lendingDTO.setLendingId(UtilityData.generateLendingId());

    }

    @Override
    public void handOverLending(String lendingID) {

    }

    @Override
    public void deleteLending(String lendingID) {

    }

    @Override
    public LendingDTO getSpecificLending(String lendingID) {
        return null;
    }

    @Override
    public List<LendingDTO> getAllLendings() {
        return List.of();
    }
}
