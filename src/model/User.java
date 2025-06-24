/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class User {
    private int id;
    private String username;
    private String passwordHash;
    
    public User(int id, String username, String psswordHash){
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
    }
    
    public int getId() { 
        return id; 
    
    }
    public String getUsername() { 
        return username; 
    }
    
    public String getPasswordHash() { 
        return passwordHash; 
    }
}

