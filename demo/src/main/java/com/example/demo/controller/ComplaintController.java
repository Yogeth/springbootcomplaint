package com.example.demo.controller;

import java.util.*;
import com.example.demo.model.Complaint;
import com.example.demo.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins="*")
public class ComplaintController{
  
  @Autowired
  ComplaintService comp;
  
  @PostMapping("postComplaint")
  public String postComplaint(@RequestParam("name") String name,
                            @RequestParam("email") String email,     
                            @RequestParam("issues") String issues,
                            @RequestParam("message") String message){
    
    comp.postComplaint(name,email,issues,message);
    return "REGISTERED SUCESSFULLY";
  }
  
  @GetMapping("viewComplaints")
  public List<Complaint> getRegData(){
    return comp.getRegData();
  }
}