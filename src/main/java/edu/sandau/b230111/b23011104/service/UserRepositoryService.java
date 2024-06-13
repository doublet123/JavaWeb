package edu.sandau.b230111.b23011104.service;

import edu.sandau.b230111.b23011104.entity.User;
import edu.sandau.b230111.b23011104.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepositoryService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(User user){
        return userRepository.findAll(Example.of(user));
    }

    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }

    public void save(User user){
        userRepository.save(user);
    }

    public User getById(Integer id){
        return userRepository.getById(id);
    }
    public List<User> findByName(String name){
        return userRepository.findByName(name);
    }
}
