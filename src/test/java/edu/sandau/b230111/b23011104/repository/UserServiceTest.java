package edu.sandau.b230111.b23011104.repository;

import edu.sandau.b230111.b23011104.entity.User;
import edu.sandau.b230111.b23011104.service.UserRepositoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepositoryService userRepositoryService;

    @Test
    void findByName(){
        List<User> users = userRepositoryService.findByName("胡雨蒙");
        Assertions.assertNotNull(users);
        Assertions.assertEquals(1,users.size());
    }

    @Test
    void findAll(){
        List<User> users = userRepositoryService.findAll(new User(null,null,null));
        Assertions.assertNotNull(users);
        Assertions.assertNotEquals(0,users.size());
    }
}
