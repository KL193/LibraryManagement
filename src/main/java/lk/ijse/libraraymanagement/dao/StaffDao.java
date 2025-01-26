package lk.ijse.libraraymanagement.dao;

import lk.ijse.libraraymanagement.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<StaffEntity,String> {
}
