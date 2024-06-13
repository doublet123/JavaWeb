package edu.sandau.b230111.b23011104.service;

import edu.sandau.b230111.b23011104.entity.Klass;
import edu.sandau.b230111.b23011104.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KlassServiceTest {

    @Autowired
    private KlassService klassService;

    @Test
    void findAll() {
        List<Klass> klasses = klassService.findAll(new Klass());
        Assertions.assertNotNull(klasses);
        Assertions.assertNotEquals(0,klasses.size());
    }

    @Test
    void getReferenceById() {
        Klass klass = klassService.getReferenceById(1);
        Assertions.assertNotNull(klass);
    }
}