package lk.ijse.libraraymanagement.dao;

import lk.ijse.libraraymanagement.entities.LendingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LendingDao extends JpaRepository<LendingEntity,String> {
}
