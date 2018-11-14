package com.example.evaaherne.foodhive;

public class Users {

    String userId;
    String userName;
    String userEmail;
    String userPassword;
    String userNutValue;
    String userDairyValue;
    String userGlutenValue;

    public Users(String userId, String userName, String userEmail, String userPassword, String userNutValue, String userDairyValue, String userGlutenValue) {

        //Constructors
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
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

    public String getUserEmail() {
        return userEmail;
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

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserNutValue(String userNutValue) {
        this.userNutValue = userNutValue;
    }

    public void setUserDairyValue(String userDairyValue) {
        this.userDairyValue = userDairyValue;
    }

    public void setUserGlutenValue(String userGlutenValue) {
        this.userGlutenValue = userGlutenValue;
    }
}
