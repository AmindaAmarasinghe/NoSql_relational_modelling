/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_app.backend;

/**
 *
 * @author wasu
 */
public class Book {
    
    private String book_name;
    private int book_id;
    private boolean book_status; //true-libarary false-outside
    
    Book(int id, String name){
        this.book_id = id;
        this.book_name = name;
        this.book_status=true;
    }
    String getBook_Name(){
        return this.book_name;
    }
    int getBook_id(){
        return this.book_id;
    }
    boolean getBookStatus(){
        return this.book_status;
    }
    
    public void setBorrowed(int book_id){
        this.book_status=false;
    }
    public void setReturned(int book_id){
        this.book_status=true;
    }
}
