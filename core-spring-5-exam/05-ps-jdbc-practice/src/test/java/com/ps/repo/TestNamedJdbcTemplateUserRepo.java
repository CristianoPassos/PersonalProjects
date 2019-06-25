package com.ps.repo;

import com.ps.config.AppConfig;
import com.ps.config.TestDataConfig;
import com.ps.ents.User;
import com.ps.repos.UserRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestDataConfig.class, AppConfig.class})
// DONE 30. [BONUS] Write test methods to cover all methods in JdbcNamedTemplateUserRepo
public class TestNamedJdbcTemplateUserRepo {

    @Autowired
    @Qualifier("userNamedTemplateRepo")
    UserRepo userRepo;

    @Before
    public void setUp() {
        assertNotNull(userRepo);
    }

    @Test
    public void testFindById() {
        User user = userRepo.findById(1L);
        assertEquals("John", user.getUsername());
    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void testNoFindById() {
        User user = userRepo.findById(99L);
    }

    @Test
    public void testFindAll() {
        Set<User> users = userRepo.findAll();

        assertEquals(4, users.size());
    }

    @Test
    public void testFindAllByUserName() {
        Set<User> users = userRepo.findAllByUserName("Joh", false);

        assertEquals(2, users.size());
    }

    @Test
    public void testCountUsers() {
        int users = userRepo.countUsers();

        assertEquals(4, users);
    }

    @Test
    public void testUpdatePassword() {
        int user = userRepo.updatePassword(1L, "passNew");

        assertEquals(1, user);
    }

}