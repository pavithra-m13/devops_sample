package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.login;
import java.util.List;




@Repository
public interface LogRepo extends JpaRepository<login,String>{
//login  findByUsernameAndPassword(String email, String password);
login findByEmailAndPassword(String email, String password);
}
