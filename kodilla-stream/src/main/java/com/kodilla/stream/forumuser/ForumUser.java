package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Date;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userId, final String username,
                     final char sex, final LocalDate birthDate,
                     final int numberOfPosts){
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString(){
        return "ForumUser - number: " + userId + ", UserName= "
                + username + ", Sex= " + sex + ", BirthDate= "
                + birthDate + ", number of posts= " + numberOfPosts;
    }
}
