package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Complaint;
//import java.util.*;
@Repository
public interface ComplaintRepo extends JpaRepository<Complaint,String>{
  
}