package com.company.Question_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {

    private static Scanner input = new Scanner(System.in);

    public void favSoccerPlayer(){
        try{
            System.out.println("Pick your favorite soccer player (Enter a number 1-4) \n" +
                    "1. Cristiano Ronaldo\n" +
                    "2. Lionel Messi\n" +
                    "3. Kylian Mbappe\n" +
                    "4. Neymar Dos Santos");
            switch (input.nextInt()){
                case 1:
                    System.out.println("You picked Ronaldo from Real Madrid");
                    break;
                case 2:
                    System.out.println("You picked Messi from FC Barcelona");
                    break;
                case 3:
                    System.out.println("You picked Mbappe from PSG");
                    break;
                case 4:
                    System.out.println("You picked Neymar from PSG");
                    break;
                default:
                    System.out.println("Enter a number 1-4\ntry again");
                    favSoccerPlayer();
                    break;
            }
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Enter a number between 1 and 4");
            favSoccerPlayer();
        }
    }

}
