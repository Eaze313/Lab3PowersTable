/**
 * James Bryant II
 * and Christopher Namyst
 * 2/2/17
 * ExponentTable.java
 *
 * Created GreetExit on 4/3/17
 *
 * This program takes a user inputted number,
 * and displays a table of Powers(Exponents)
 *
 * Extended Challenges :
 * NONE
 */

package bootcamp;
import java.util.Scanner;

class GreetExit {

    //Method - Greets the User
    static String hello(Scanner scan) {
        //Greeting and UserName Request
        String user = Validator.getString(
                scan, "Hi. Welcome to the Exponent Table!!!\n" +
                        "Please tell me your name?\n");

        return user;
    }

    //Method - Farewells the User
    static String bye(String userName) {
        return "\nFarewell " + userName + ",\nUntil Next Time!!!";
    }




}
