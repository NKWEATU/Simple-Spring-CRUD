package nkc_Tech.RestApi_CRUD.repository;

import nkc_Tech.RestApi_CRUD.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
