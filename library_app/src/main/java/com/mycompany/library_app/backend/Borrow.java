/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_app.backend;

/**
 *
 * @author wasu
 */
public class Borrow {
    private int id_;
    private int std_id;
    private int book_id;
    private String borrowed_date;
    private String returned_date;
    private float fine;
    
    public Borrow(int std_id, int book_id ){
        this.id_=1;
        this.book_id=book_id;
        this.std_id=std_id;
    }
    public void setBorrowed(){
        Student std=new Student(this.std_id);
        std.setBorrowed();
        
    }
    public void setReturned(){
        Student std=new Student(this.std_id);
        std.setReturned();
    }
}
