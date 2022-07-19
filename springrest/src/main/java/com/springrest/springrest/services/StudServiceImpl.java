/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.services;

import com.springrest.springrest.entities.Student;
import static java.lang.Long.parseLong;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author PRANALI
 */
@Service
public class StudServiceImpl implements StudServices{
    
  List<Student> list;
     public StudServiceImpl(){
         
         /*list=new ArrayList<>();
         list.add(new Student(1,"Pranali","CSE"));
         list.add(new Student(2,"Vedant","ME"));
         list.add(new Student(3,"Prince","IT"));
         list.add(new Student(4,"Sam","AI"));
         list.add(new Student(5,"Ruchi","DS"));*/
    
    }
    @Override
    public List<Student>getStudent(){
    return studdoa.findAll();
     }
    
     public Student getStudent(long Roll_no){
     
        /* Student s=null;
         for(Student student:list)
         {
         if(student.getRoll_no()==Roll_no){
             s=student;
             break;
         }
         }*/
         return studdoa.getOne(Roll_no);
}
     public Student addStudent(Student student){
    // list.add(student);
      studdoa.save(student);
      return student;
     }
     
     @Override
     public Student updateStud(Student student){
         
         /*list.forEach(e ->{
         if(e.getRoll_no() == student.getRoll_no()){
             e.setName(student.getName());
             e.setBranch(student.getBranch());
             
         }
     });*/
         studdoa.save(student);
     return student;
     }
     
    @Override
     public void deleteStud(long parselong){
     //list=this.list.stream().filter(e ->e.getRoll_no()!= parseLong).collect(Collectors.toList());
     Student entity=studdoa.getOne(parselong);
     studdoa.delete(entity);
     }
     
}
     