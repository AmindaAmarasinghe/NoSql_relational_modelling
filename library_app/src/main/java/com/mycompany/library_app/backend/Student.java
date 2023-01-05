/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_app.backend;

/**
 *
 * @author wasu
 */
public class Student {
    private String std_name;
    private int std_id;
    private boolean std_status;
    private float fine;
    
    public Student(int id, String name){
        this.std_id = id;
        this.std_name = name;
        this.std_status = false;
        this.fine = 0;
    }
    public Student(int id){
        this.std_id = id;
    }
    public String getStdName(){
        return this.std_name;
    }
    public int getStd_id(){
        return this.std_id;
    }
    public float getStd_fine(){
        return this.fine;
    }
    public void addStd_fine(int amount){
        this.fine+=amount;
    }
    public void pay_fine(int amount){
        this.fine-=amount;
    }
    public void setBorrowed(){
        this.std_status=false;
    }
    public void setReturned(){
        this.std_status=true;
    }
    public boolean getStdStatus(){
        return this.std_status;
    }
    
}
