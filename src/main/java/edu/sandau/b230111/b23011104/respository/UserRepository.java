package edu.sandau.b230111.b23011104.respository;

import edu.sandau.b230111.b23011104.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByName(String name);

    List<User> findByNameAndAge(String name, Integer age);
    List<User> findByNameContainingAndAge(String name, Integer age);
}
