package lk.ijse.libraraymanagement.dao;

import lk.ijse.libraraymanagement.entities.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<MemberEntity, String> {
}
