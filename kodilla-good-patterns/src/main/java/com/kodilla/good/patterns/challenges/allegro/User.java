package com.kodilla.good.patterns.challenges.allegro;

final public class User {
    private final String userName;
    private final String userId;
    private final String email;

    User(String userName, String userID, String email) {
        this.userName = userName;
        this.userId = userID;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
