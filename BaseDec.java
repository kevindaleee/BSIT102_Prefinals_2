/**
 * @(#)BaseDec.java
 *
 *
 * @author
 * @version 1.00 2019/10/12
 */

import java.io.*;
import java.util.*;


public class BaseDec {

     public static void main (String[]args)throws IOException{

    		Base64.Decoder nicoleDecoder = Base64.getDecoder(); //declaring the decoder of the msg
            System.out.print("Enter the file name  : ");
            Scanner kevinput = new Scanner(System.in); //initializing scanner

            File gfile = new File(kevinput.nextLine()+".kevz"); // Construct and Reads file with the extension
            kevinput = new Scanner(gfile);

            String listkev = kevinput.nextLine();
            String decodedString = new String(nicoleDecoder.decode(listkev));  //It will decode the msg in this line
            System.out.println(decodedString);

            kevinput.close(); //will close the filewriter
    }


}