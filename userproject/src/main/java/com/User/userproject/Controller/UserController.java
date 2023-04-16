package com.User.userproject.Controller;


import com.User.userproject.Entity.Userservice;
import com.User.userproject.Helperclasses.ResponseTemplate;
import com.User.userproject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("{id}")
    public List<Userservice> getalluser(@PathVariable Long id){
        return userService.getusers(id);
    }

    @GetMapping("{userId}")
    public ResponseTemplate getdeptbyuser(@PathVariable Long userId){
        return userService.getdeptbyuserid(userId);
    }
    @PostMapping("/adduser")
    public String adduser(@RequestBody Userservice user){
        return userService.adduser(user);
    }

}

