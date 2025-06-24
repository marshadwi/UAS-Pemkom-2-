/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Recipe<T> implements Serializable {
    private int id;
    private int userId;
    private String title;
    private String category;
    private T ingredients;
    private String steps;
    private int duration;
    private String difficulty;
    
    public Recipe(int id, int userId, String title, String category, 
            T ingredients, String steps, int duration, String difficulty){
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.category = category;
        this.ingredients = ingredients;
        this.steps = steps;
        this.duration = duration;
        this.difficulty = difficulty;
    }
    
    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public T getIngredients() { return ingredients; }
    public String getSteps() { return steps; }
    public int getDuration() { return duration; }
    public String getDifficulty() { return difficulty; }
}
