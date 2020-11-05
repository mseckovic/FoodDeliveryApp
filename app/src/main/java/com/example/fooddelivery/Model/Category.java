package com.example.fooddelivery.Model;

public class Category {

    //region Variables
    private String Name;
    private String Image;
    //endregion

    //region Constructors
    public Category() {

    }

    public Category(String name, String image) {
        Name = name;
        Image = image;
    }

    //endregion

    //region Getters/Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
    //endregion

}
