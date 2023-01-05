/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_app.backend;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import java.util.Arrays;

import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author wasu
 */
public class Backend {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
       // Create a MongoDB database
        MongoDatabase database = mongoClient.getDatabase("library_db");
        // Create a MongoDB Collection
        database.createCollection("students");
        MongoCollection<Document> collection = database.getCollection("students");
        System.out.println("Collection Created Successfully!");
        try {
                InsertOneResult result = collection.insertOne(new Document()
                        .append("_id", new ObjectId())
                        .append("username", "vitali@30")
                        .append("phonenumber", 25013476)
                        .append("email", "vitaly12@gsuite.com"));

                System.out.println("Success! Inserted document id: " + result.getInsertedId());
            } catch (MongoException me) {
                System.err.println("Unable to insert due to an error: " + me);
            }
    }
    public void BorrowAct(int regno, int book_id){
        Borrow b = new Borrow(regno,book_id);
        b.setBorrowed();
    }
    public void ReturnAct(int regno, int book_id){
        Borrow b = new Borrow(regno,book_id);
        b.setReturned();
    }
    public void payAct(int regno, int amount){
        Student std = new Student(regno);
        std.pay_fine(amount);
    }
}
