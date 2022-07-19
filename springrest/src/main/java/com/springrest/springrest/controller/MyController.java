/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PRANALI
 */
@RestController
public class MyController {
    
    @Autowired
    private StudServices studservice;
    @GetMapping("/home")
    public String home(){
    return "this is home page";
    }
    
    
    //getStudent data
    @GetMapping("/student")
    public List<Student>getStudent()
    {
    return this.studservice.getStudent();
    }
    
    //get data from roll no
    @GetMapping("/student/{Roll_no}")
    public Student getStudent(@PathVariable String Roll_no)
    {
    return this.studservice.getStudent(Long.parseLong(Roll_no));
    }
    
    //add student 
    @PostMapping(path="/student",consumes="application/json")
    public Student addStudent(@RequestBody Student student)
    {
    return this.studservice.addStudent(student);
    }
    
    //update Student
    @PutMapping("/student")
     public Student updateStud(@RequestBody Student student){
     return this.studservice.updateStud(student);
     }
     
     //delete Student
     @DeleteMapping("/student/{Roll_no}")
     public ResponseEntity<HttpStatus> deleteStud(@PathVariable String Roll_no){
         try{
             this.studservice.deleteStud(Long.parseLong(Roll_no));
             return new ReponseEntity<>(HttpStatus.OK);
         }catch(Exception e){
              return new ReponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
         }
         
             

}
    

