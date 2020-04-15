package fa.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.training.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
