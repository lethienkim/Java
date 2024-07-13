/* File Proj04Runner
This is skeleton code for Proj04. It will compile and
run, but it won't meet the assignment specifications.
*****************************************************/

class Proj04Runner{

  static double run(byte[] byteArray){
    //Print a required certification on the 
    // command-line screen.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Thienkim Le\n");

    //Insert code to get and display the length of the array
    int arrayLength = byteArray.length;
    System.out.println("Array length = " + arrayLength);

    //Insert code to get and display the value in the 
    // last element in the array.
    byte lastValue = byteArray[arrayLength - 1];
    System.out.println("Value in last element = " + lastValue);

    //Insert code to determine and display whether the
    // last element in the array is odd or even.
    if (lastValue % 2 == 0) {
      System.out.println("The value in the last element is Even");
    } else {
      System.out.println("The value in the last element is Odd");
    }

    double sum = 0;    
    //Insert code to compute and display the sum of all the
    // values stored in the array as type double. Include
    // code that will display the beginning and ending
    // indices.
    System.out.println("Begin loop at index = 0");
    for (int i = 0; i < arrayLength; i++) {
      sum += byteArray[i];
    }
    System.out.println("End loop at index = " + (arrayLength - 1));
    System.out.println("The sum is " + sum);
    
    //double avg = 9999;
    //Insert code to compute and display the average of all
    // the values in the array.
    double avg = sum / arrayLength;
    System.out.println("The average is " + avg);

    return avg;

  }//end run method

}//end class Proj04Runner