package com.example.demo.mapper;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findall();

    @Select("select * from user where uid=#{uid}")
    User findById(Integer uid);

    @Update("INSERT INTO user (name, gender, age) VALUES (#{name}, #{gender}, #{age});")
    @Transactional
    void save(User user);

    @Update({"update user set name=#{name}, age=#{age}, gender=#{gender} WHERE uid=#{uid}"})
//    @Update("INSERT INTO user (name, gender, age) VALUES (#{name}, #{gender}, #{age});")
    @Transactional
    void updateById(User user);


    @Delete("delete from user where uid=#{uid}")
    @Transactional
    void deleteById(Integer uid);
}
