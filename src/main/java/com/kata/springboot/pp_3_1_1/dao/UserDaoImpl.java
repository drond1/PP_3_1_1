package com.kata.springboot.pp_3_1_1.dao;

import com.kata.springboot.pp_3_1_1.models.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public User showUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        entityManager.merge(updatedUser);

    }

    @Override
    public void deleteUser(int id) {
        User userToBeDeleted = entityManager.find(User.class, id);
        entityManager.remove(userToBeDeleted);
    }

}
