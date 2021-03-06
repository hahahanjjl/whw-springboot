package com.whw.dao;

import com.whw.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by whw on 2018/4/18.
 */
public interface UserDao {
    List<User> findAll();

    User getUser(Integer id);

    void update(User user);

    void insert(User user);

    void insertAll(List<User> users);

    void remove(Integer id);

    List<User> findByPage(User user, Pageable pageable);
}
