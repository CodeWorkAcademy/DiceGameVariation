package com.company;import java.util.Random;
import java.util.Scanner;

public class Pig {

    public static void main(String[] args) {
        int die1, die2;
        int score = 0;
        Scanner keyboard = new Scanner(System.in);

        String again = "y";
        Random rnd = new Random();

        while (again.equals("y"))
        {
            die1 = 1 + rnd.nextInt(6);
            die2 = 1 + rnd.nextInt(6);

            if (die1 + die2 == 2)
            {
                score = score + 25;
            } else if (die1 > 1 && die2 > 1){
                score = score + die1 + die2;
            }

            System.out.printf("You roll: %d and %d. Your score is %d.\n", die1, die2, score);

            if (score < 100)
            {
                System.out.println("Press Y to roll again.");
                again = keyboard.next();
            }
            else
            {
                System.out.println("Game Over. You Win!");
                again="n";
            }
        }
    }
}
