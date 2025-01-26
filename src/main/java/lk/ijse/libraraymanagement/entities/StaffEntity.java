package lk.ijse.libraraymanagement.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.libraraymanagement.dto.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class StaffEntity {

    @Id
    private String staffId;
    private String fName;
    private String lName;
    private String email;
    private String joinDate;
    private String lastUpdated;
    private Role role;

}
