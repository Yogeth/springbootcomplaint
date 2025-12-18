package com.example.demo.service;
import com.example.demo.model.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ComplaintRepo;
import java.util.*;

@Service
public class ComplaintService{
  @Autowired
  ComplaintRepo repo;
  public void postComplaint(String name,String email,String issues,String message){
    Complaint comp=new Complaint(name,email,issues,message);
    repo.save(comp);
  }
  
  public List<Complaint> getRegData(){
     return repo.findAll();
  }
}