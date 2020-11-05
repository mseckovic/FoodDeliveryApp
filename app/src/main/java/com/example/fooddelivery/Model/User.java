package com.example.fooddelivery.Model;

public class User {

    //region Variables
    private String Name;
    private String Password;
    //endregion

    //region Constructors
    public User(){

    }

    public User(String name, String password) {
        Name = name;
        Password = password;
    }
    //endregion

    //region Getters/Setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    //endregion

}
