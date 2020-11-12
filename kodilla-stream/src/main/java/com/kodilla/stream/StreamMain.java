package com.kodilla.stream;

import com.kodilla.stream.forumuser.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.Period.between;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map theResultStringOfUserMap = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getNumberOfPosts() > 1)
                .filter(forumUser -> {
                    Period period = Period.between(forumUser.getBirthDate(), LocalDate.now());
                    int ageOfUser = period.getYears();
                    return ageOfUser >= 20;
                })
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser::getUsername));

        System.out.println(theResultStringOfUserMap);
    }
}