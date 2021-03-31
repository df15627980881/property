package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {

    int insert(User user);

    boolean delete(int id);

    boolean update(User user);

    User query(int id);

    int queryId(User user);

    User queryByUsername(String username);

    Boolean changeImage(@Param("userId") int userId, @Param("imagePath") String imagePath);
}
