package com.xinjiang.mapper;

import com.xinjiang.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMapper extends JpaRepository<User,Long> {
    List<User> findAll();
}
