package com.example.evaaherne.foodhive;

public class Users {

    String userId;
    String userName;
    String userUsername;
    String userPassword;
    String userNutValue;
    String userDairyValue;
    String userGlutenValue;

    public Users(String userId, String userName, String userUsername, String userPassword, String userNutValue, String userDairyValue, String userGlutenValue) {

        //Constructors
        this.userId = userId;
        this.userName = userName;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userNutValue = userNutValue;
        this.userDairyValue = userDairyValue;
        this.userGlutenValue = userGlutenValue;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserNutValue() {
        return userNutValue;
    }

    public String getUserDairyValue() {
        return userDairyValue;
    }

    public String getUserGlutenValue() {
        return userGlutenValue;
    }
}
