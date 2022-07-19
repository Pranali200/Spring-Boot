/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.entities;

import javax.persistence.Entity;

/**
 *
 * @author PRANALI
 */
@Entity
public class Student {
    
    public long Roll_no;
    public String Name;
    public String Branch;
    
    public Student(long Roll_no,String Name,String Branch )
    {
    super();
    this.Roll_no=Roll_no;
    this.Name=Name;
    this.Branch=Branch;
    }
    
    public Student(){
        super();
    }
    public void getRoll_no(long Roll_no){
    this.Roll_no=Roll_no;
    }
     public void setRoll_no(long Roll_no){
    this.Roll_no=Roll_no;
    }
     public void getName(String Name){
    this.Name=Name;
    }
     public void setName(String Name){
    this.Name=Name;
    }
      public void getBranch(String Branch){
    this.Branch=Branch;
    }
     public void setBranch(String Branch){
    this.Branch=Branch;
    }

    public long getRoll_no() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
        
        