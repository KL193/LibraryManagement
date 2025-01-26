package lk.ijse.libraraymanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "lending") // table eke namq wenas karanawa
public class LendingEntity {

    @Id
    private String LendingId;
    @ManyToOne
    @JoinColumn(name="bookId", nullable=false)
    private BookEntity book;
    @ManyToOne
    @JoinColumn(name = "memberId",nullable = false)
    private MemberEntity member;
    private String lendingDate;
    private String returnDate;
    private boolean isActive;
    private String overDue;
    private String fineAmount;

}
