package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.internal.matchers.Null;
import org.mockito.junit.jupiter.*;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {

        testCounter++;
        System.out.println("\n" + "Test # " + testCounter + "\n");
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void testAveragesWhenZeroPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Cat Tom");
        userNames.add("Mouse Jerry");
        userNames.add("Fish Nemo");

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(0, forumStats.averageNumPostsPerUser);
    }

    @Test
    void testAveragesWhenThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Cat Tom");
        userNames.add("Mouse Jerry");
        userNames.add("Fish Nemo");

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(333, forumStats.averageNumPostsPerUser);
    }

    @Test
    void testAveragesWhenZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Cat Tom");
        userNames.add("Mouse Jerry");
        userNames.add("Fish Nemo");

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(0, forumStats.averageNumPostsPerUser);
    }

    @Test
    void testAveragesWhenLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Cat Tom");
        userNames.add("Mouse Jerry");
        userNames.add("Fish Nemo");

        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(166, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(333, forumStats.averageNumPostsPerUser);
    }

    @Test
    void testAveragesWhenMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Cat Tom");
        userNames.add("Mouse Jerry");
        userNames.add("Fish Nemo");

        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(2, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(333, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(166, forumStats.averageNumPostsPerUser);
    }

    @Test
    void testAveragesWhenZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(0, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(0, forumStats.averageNumPostsPerUser);
    }

    private List<String> generateUsers(int usersQuantity){
        List<String> listOfUsers = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++){
            String user = new String("Name of the user plus n: " + n);
            listOfUsers.add(user);
        }
        return listOfUsers;
    }
    @Test
    void testAveragesWhenThousandUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames = generateUsers(1000);

        when(statisticsMock.commentsCount()).thenReturn(4000);
        when(statisticsMock.postsCount()).thenReturn(2000);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        forumStats.showStatistics();

        //Then
        Assertions.assertEquals(2, forumStats.averageNumCommentsPerPost);
        Assertions.assertEquals(4, forumStats.averageNumCommentsPerUser);
        Assertions.assertEquals(2, forumStats.averageNumPostsPerUser);
    }
}
