package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User queryById(Integer uid) {
        return userMapper.findById(uid);
    }

    @Override
    public List<User> query() {
        return userMapper.findall();
    }

    @Override
    public void create(User user) {
        userMapper.save(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void delete(Integer uid) {
        userMapper.deleteById(uid);
    }

}
