/**
 * @(#)Base.java
 *
 *
 * @author
 * @version 1.00 2019/10/12
 */

import java.util.*;
import java.io.*;

public class Base {

public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in); //declaring scanner variable
    System.out.println("Input file name: "); //to let the user input a file name
    String userInput = sc.nextLine(); //to receive the user's input
    FileWriter fw = new FileWriter(userInput+".kevz"); //declaring file writer variable

    while (userInput != null) { //looping so that the user can enter as much as they want
        System.out.println("Enter text: ");
        userInput = sc.nextLine();  //to pass to the userInput variable of what the users type

        if (userInput.equals(":q")) //if it is satisfied the user need to type ":q"
            break; //to stop the loop

        String encodedString = Base64.getEncoder().encodeToString(userInput.getBytes()); //converting word to base64
        System.out.println("User Input encoded: " + encodedString); //to let the user see the encoded word into base 64
        fw.write(encodedString + "\n"); //to write into the file of what the user's typed
    }
    sc.close(); //to close the scanner
    fw.close(); //to close the file writer
}


}