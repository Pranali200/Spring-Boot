/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.services;

import com.springrest.springrest.Doa.StudDao;
import com.springrest.springrest.entities.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PRANALI
 */
public interface StudServices {
    
    @Autowired
    public StudDao studdoa;
    public List<Student>getStudent();

    public Student getStudent(long Roll_no);

    public Student addStudent(Student student);
   // public Student addStudent(Student student);

    public Student updateStud(Student student);

    public void deleteStud(long parseLong);
}
