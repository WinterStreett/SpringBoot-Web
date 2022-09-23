package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "uid") Integer uid){
        return userService.queryById(uid);
    }

    @GetMapping("/user/all")
    public List<User> getUsers(){
        return userService.query();
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        userService.create(user);
        return "success";
    }

    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        userService.update(user);
        return "success";
    }

//    @DeleteMapping("/user/{UID}")
//    public String deleteUser(@PathVariable("UID") Integer UID){
//        userMapper.deleteById(UID);
//        return "success";
//    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestParam(value = "uid") Integer uid){
        userService.delete(uid);
        return "success";
    }
}
