package lk.ijse.libraraymanagement.dao;

import lk.ijse.libraraymanagement.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<BookEntity,String> {
}
