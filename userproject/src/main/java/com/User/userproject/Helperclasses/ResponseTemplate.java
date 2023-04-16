package com.User.userproject.Helperclasses;


import com.User.userproject.Entity.Userservice;
import lombok.Data;

@Data
public class ResponseTemplate {

    private Userservice userservice;
    private Department department;
}
