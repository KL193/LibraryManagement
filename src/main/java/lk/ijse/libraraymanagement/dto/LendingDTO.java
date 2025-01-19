package lk.ijse.libraraymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LendingDTO implements Serializable {
    private String LendingId;
    private String book;
    private String member;
    private String lendingDate;
    private String returnDate;
    private boolean isActive;
    private String overDue;
    private String fineAmount;


}
