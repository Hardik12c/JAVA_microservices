package com.User.userproject.Service;

import com.User.userproject.Entity.Userservice;
import com.User.userproject.Helperclasses.Department;
import com.User.userproject.Helperclasses.ResponseTemplate;
import com.User.userproject.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public String adduser(Userservice User){
        userRepository.save(User);
        return "Data saved successfully";
    }

    public List<Userservice> getusers(Long id){
        return userRepository.findAllByid(id);
    }

    public ResponseTemplate getdeptbyuserid(long userid){
        ResponseTemplate obj=new ResponseTemplate();

        Userservice user=userRepository.findByid(userid);
        Department department=restTemplate.getForObject("http://deparment-service/api/v1/getdept/"+user.getDepartmentid(), Department.class);
        obj.setUserservice(user);
        obj.setDepartment(department);
        return obj;
    }

}
