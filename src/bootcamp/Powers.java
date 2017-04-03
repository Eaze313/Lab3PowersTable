/**
 * James Bryant II
 * and Christopher Namyst
 * 2/2/17
 * ExponentTable.java
 *
 * This program takes a user inputted number,
 * and displays a table of Powers(Exponents)
 *
 * Extended Challenges :
 * NONE
 */

package bootcamp;
import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Greeting
        String name = GreetExit.hello(scnr);
        String answer;

        do {
            //Get User Number
            int num = Validator.getInt(scnr, "Please Enter a Number: ");

            //Table Header
            System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubed");
            System.out.println("======" + "\t" + "=======" + "\t" + "======");

            for (int i = 1; i <= num; i++) {
                int square = i * i;
                int cube = i * i * i;

                String message = "\n" + i + "       " + square + "       " + "" + cube;

                System.out.print(message);
            }

            System.out.println(" ");
            answer = Validator.getString(
                    scnr,name + ",\nDo you want to " +
                    "continue? (Type yes or no)" );

        } while (answer.equalsIgnoreCase("yes"));

        //Exit
        GreetExit.bye(name);
        scnr.close();
    }
}
