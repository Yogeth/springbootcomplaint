package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Complaint{
 private name;
 @Id
 private email;
 private issues;
 private message;
}