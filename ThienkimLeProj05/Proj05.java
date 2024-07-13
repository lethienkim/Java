/*File Proj05.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with the String and
StringBuffer classes. Student also needs to understand
what it means to apply the == operator to object 
references such as strA and strB. For example, see
https://www.tutorialspoint.com/differences-between-and-equals-method-in-java
**********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;

class Proj05{
  public static void main(String[] args){ //define main
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get a random number of type int. Cast it down to
    // type byte simply to reduce the maximum value.
    // Store it in a variable named valA of type byte.
    // Display it.
    byte valA = (byte)(generator.nextInt());
    System.out.println("Random byte value = " + valA);
    
    //Create a String object consisting of the 
    // beginning of a student certification. Embed 
    // the random byte in the String object.
    String strA = valA + " " +
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n";
      
    //Pass the certification string to the student's
    // method named runA. Display the return value
    // which will include the random byte and the
    // student's name.
    String strB = Proj05Runner.runA(strA);
    System.out.println(strB);
    
    System.out.println(
      "The following statement must print false.");
    System.out.println(strA == strB);
    
    //Create a StringBuffer object containing the
    // random value and pass it to the student's
    // method named runB.. Display the returned object
    // which will contain the random value and the
    // student's name.
    StringBuffer strBufA = new StringBuffer("" + valA);
    StringBuffer strBufB = Proj05Runner.runB(strBufA);
    System.out.println(strBufB);
    
    System.out.println(
      "The following statement must print true.");
    System.out.println(strBufA == strBufB);
    
     }//end main
}//end class Proj05
//End program specifications