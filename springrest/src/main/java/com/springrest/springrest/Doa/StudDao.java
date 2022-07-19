/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.Doa;

import com.springrest.springrest.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author PRANALI
 */
public interface StudDao extends JpaRepository<Student,Long> {
    
}
