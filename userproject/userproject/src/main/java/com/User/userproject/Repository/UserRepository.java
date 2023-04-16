package com.User.userproject.Repository;

import com.User.userproject.Entity.Userservice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Userservice,Long> {
    Userservice findByid(long userid);

    List<Userservice> findAllByid(long id);
}
