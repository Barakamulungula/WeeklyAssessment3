package com.company.Question_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */

        List <String> soccerPlayer  = new ArrayList();
        soccerPlayer.add("Cristiano Ronaldo");
        soccerPlayer.add("Lionel Messi");
        soccerPlayer.add("Neymar Dos Santos");
        soccerPlayer.add("Zlatan Ibrahimovic");
        soccerPlayer.add("Kylian Mbappe");
        soccerPlayer.add("Thomas Muller");

        displayArray(soccerPlayer);



    }

    public static void displayArray(List<String> Player){
        for (String x:
             Player) {
            System.out.println(x);
        }
    }
}
