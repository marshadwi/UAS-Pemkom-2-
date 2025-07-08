package model;

import java.io.Serializable;

public class Recipe implements Serializable {

    private int id;
    private int userId;
    private String title;
    private String category;
    private String ingredients;
    private String steps;
    private int duration;
    private String difficulty;
    private String imageFileName;

    // Constructor lengkap (biasanya untuk edit atau ambil dari database)
    public Recipe(int id, int userId, String title, String category,
                  String ingredients, String steps, int duration,
                  String difficulty, String imageFileName) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.category = category;
        this.ingredients = ingredients;
        this.steps = steps;
        this.duration = duration;
        this.difficulty = difficulty;
        this.imageFileName = imageFileName;
    }

    // Constructor tanpa id (biasanya untuk data baru sebelum disimpan ke DB)
    public Recipe(int userId, String title, String category,
                  String ingredients, String steps, int duration,
                  String difficulty, String imageFileName) {
        this.userId = userId;
        this.title = title;
        this.category = category;
        this.ingredients = ingredients;
        this.steps = steps;
        this.duration = duration;
        this.difficulty = difficulty;
        this.imageFileName = imageFileName;
    }

    // GETTER
    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public int getDuration() {
        return duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    // SETTER (jika perlu ubah)
    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}