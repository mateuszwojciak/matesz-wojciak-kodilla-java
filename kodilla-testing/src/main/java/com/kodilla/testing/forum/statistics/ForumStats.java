package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStats{
    private Statistics statistics;

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumPostsPerUser;
    double averageNumCommentsPerUser;
    double averageNumCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        //calculate stats below
        //this.statistics = statistics;
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers == 0 && numberOfComments ==0 && numberOfPosts ==0 ) {
            averageNumPostsPerUser = 0;
            averageNumCommentsPerUser = 0;
            averageNumCommentsPerPost = 0;
        } else if (numberOfUsers == 0 && numberOfComments ==0 && numberOfPosts !=0 ) {
            averageNumPostsPerUser = 0;
            averageNumCommentsPerUser = 0;
            averageNumCommentsPerPost = numberOfComments / numberOfPosts;
        } else if (numberOfUsers == 0 && numberOfComments !=0 && numberOfPosts ==0){
            averageNumPostsPerUser = 0;
            averageNumCommentsPerUser = 0;
            averageNumCommentsPerPost = 0;
        } else if (numberOfUsers != 0 && numberOfComments ==0 && numberOfPosts ==0){
            averageNumPostsPerUser = numberOfPosts / numberOfUsers;
            averageNumCommentsPerUser = numberOfComments / numberOfUsers;
            averageNumCommentsPerPost = 0;
        } else if (numberOfUsers != 0 && numberOfComments !=0 && numberOfPosts ==0){
            averageNumPostsPerUser = numberOfPosts / numberOfUsers;
            averageNumCommentsPerUser = numberOfComments / numberOfUsers;
            averageNumCommentsPerPost = 0;
        } else if (numberOfUsers == 0 && numberOfComments !=0 && numberOfPosts !=0) {
            averageNumPostsPerUser = 0;
            averageNumCommentsPerUser = 0;
            averageNumCommentsPerPost = numberOfComments / numberOfPosts;
        } else {
            averageNumPostsPerUser = numberOfPosts / numberOfUsers;
            averageNumCommentsPerUser = numberOfComments / numberOfUsers;
            averageNumCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

    private ForumStats forumStats;
    public void showStatistics(){
        System.out.println("Liczba użytkowników: " + numberOfUsers);
        System.out.println("Liczba postów: " + numberOfPosts);
        System.out.println("Liczba komentarzy: " + numberOfComments);
        System.out.println("średnia liczba postów na użytkownika: " + averageNumPostsPerUser);
        System.out.println("średnia liczba komentarzy na użytkownika: " + averageNumCommentsPerUser);
        System.out.println("średnia liczba komentarzy na post: " + averageNumCommentsPerPost);
    }
}
