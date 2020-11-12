package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserMap = new ArrayList<>();

    public Forum() {
        theUserMap.add(new ForumUser(1, "Jan Kowalski",
                'M', LocalDate.of(1979, 10, 16), 10));
        theUserMap.add(new ForumUser(2, "Anna Nowak",
                'F', LocalDate.of(1999, 1, 28), 3));
        theUserMap.add(new ForumUser(3, "Andrzej Nowak",
                'M', LocalDate.of(1990, 1, 20), 94));
        theUserMap.add(new ForumUser(4, "Brad Pitt",
                'M', LocalDate.of(2010, 10, 16), 0));
        theUserMap.add(new ForumUser(5, "Karina Kowalska",
                'F', LocalDate.of(1961, 8, 3), 15));
        theUserMap.add(new ForumUser(6, "Angelina Jolie",
                'F', LocalDate.of(1979, 10, 16), 10));
        theUserMap.add(new ForumUser(7, "Michał Wiśniewski",
                'M', LocalDate.of(1979, 10, 16), 10));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserMap);
    }

}
