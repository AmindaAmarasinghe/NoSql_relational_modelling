/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_app;

/**
 *
 * @author wasu
 */
public class Student {
    private String std_name;
    private int std_id;
    private boolean std_status;
    private int fine;
    
    Student(int id, String name){
        this.std_id = id;
        this.std_name = name;
        this.std_status = false;
        this.fine = 0;
    }
    String getStdName(){
        return this.std_name;
    }
    int getStd_id(){
        return this.std_id;
    }
    int getStd_fine(){
        return this.fine;
    }
    void setStd_fine(int amount){
        this.fine=amount;
    }
    void pay_fine(int amount){
        this.fine-=amount;
    }
    boolean getStdStatus(){
        return this.std_status;
    }
    
}
