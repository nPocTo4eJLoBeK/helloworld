package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FootballPlayer implements Comparable<FootballPlayer>{
    private String name;
    private String surname;
    private String lastName;
    private Integer age;
    private Integer rating;
    private Integer goals;
    private Integer assists;

    FootballPlayer(String name, String surname, String lastName, int age, int rating, int goals, int assists){
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        this.age = age;
        this.rating = rating;
        this.goals = goals;
        this.assists = assists;
    }

    FootballPlayer(String name, String surname, String lastName, int age){
        this( name,  surname,  lastName,  age, 0, 0, 0);
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(FootballPlayer player) {
        return this.rating.compareTo(player.rating);
    }

    public String toString(){
      return name + " " + rating + " " + age;
    }
}


class FootballPlayerComparatorByAge implements Comparator<FootballPlayer> {
    @Override
    public int compare(FootballPlayer player1, FootballPlayer player2) {
        return player2.getAge().compareTo(player1.getAge());
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        List<FootballPlayer> footballPlayerList = new ArrayList<>();
        FootballPlayer player1 = new FootballPlayer("a", "a", "a", 15);
        FootballPlayer player2 = new FootballPlayer("b", "b", "b", 22, 65, 2, 1);
        FootballPlayer player3 = new FootballPlayer("c", "c", "c", 19, 50, 2, 1);
        FootballPlayer player4 = new FootballPlayer("d", "d", "d", 16, 77, 2, 1);
        footballPlayerList.add(player1);
        footballPlayerList.add(player2);
        footballPlayerList.add(player3);
        footballPlayerList.add(player4);
        Collections.sort(footballPlayerList, Collections.reverseOrder());
        System.out.println(footballPlayerList);

        FootballPlayerComparatorByAge comparator = new FootballPlayerComparatorByAge();
        footballPlayerList.sort(comparator.reversed());
        System.out.println(footballPlayerList);
    }
}
