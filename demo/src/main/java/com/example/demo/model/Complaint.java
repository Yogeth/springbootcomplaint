package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Complaint{
 private String name;
 @Id
 private String email;
 private  String issues;
 private  String message;
}