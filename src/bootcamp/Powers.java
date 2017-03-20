/**
 James Bryant II and Christopher Namyst
    2/2/17
    ExponentTable.java
    This program takes a user inputted number,
    squares and  cubes it
 **/

package bootcamp;

import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {

        System.out.println("Hello and Welcome!\nLet's Grow, Exponentially!!!");
        System.out.println(" ");

        Scanner scnr = new Scanner(System.in);

        String answer;
        do {

            int num = Validator.getInt(scnr, "Please Enter a Number: ");

            System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubed");
            System.out.println("======" + "\t" + "=======" + "\t" + "======");

            for (int i = 1; i <= num; i++) {

                int square = i * i;
                int cube = i * i * i;

                String message = "\n" + i + "       " + square + "       " + "" + cube;
                System.out.print(message);
            }
            System.out.println();
            answer = Validator.getString(scnr,"Do you want to continue? Type yes or no" );

        } while (answer.equalsIgnoreCase("yes"));


        System.out.println("Okay, See You Next Time!");
    }
}
