package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    int points = 10;
    boolean play = true;
    final Random RAND = new Random();
    Scanner userInput = new Scanner(System.in);
    String choice = "";
    boolean decision = false;

    while (play == true) {
      System.out.println("You currently have " + points + " points.");
      decision = false;
      while (decision == false) {
        System.out.println("Would you like to try to double your points? (Y/N)");
        choice = userInput.nextLine();
        if (choice.toUpperCase().equals("Y")) {
          decision = true;
          if (RAND.nextBoolean()) {
            System.out.println("Congratulations! You've doubled your points.");
            points = points * 2;
          } else {
            points = 0;
            System.out.println("Oh no! You've lost all of your points. Thank you for playing.");
            play = false;
          }
        } else if (choice.toUpperCase().equals("N")) {
          System.out.println("You have finished with " + points + " points. Thank you for playing.");
          decision = true;
          play = false;
        } else {
          System.out.println("You seem to have entered an incorrect option. Please try again.");
        }
      }
    }
    userInput.close();
  }
}