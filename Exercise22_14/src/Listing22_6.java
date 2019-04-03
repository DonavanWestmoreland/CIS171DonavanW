/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reyta
 */
import java.util.Scanner;
public class Listing22_6 {
  public static void main(String[] args, int n) {
      long startTime = System.currentTimeMillis();//added code
//    Scanner input = new Scanner(System.in);
//    System.out.print("Find all prime numbers <= n, enter n: ");
//    

    // A list to hold prime numbers
    java.util.List<Integer> list = 
      new java.util.ArrayList<>(); 

    final int NUMBER_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness
    int squareRoot = 1; // Check whether number <= squareRoot

    //System.out.println("The prime numbers are \n");

    // Repeatedly find prime numbers
    while (number <= n) {
      // Assume the number is prime
      boolean isPrime = true; // Is the current number prime?

      if (squareRoot * squareRoot < number) squareRoot++;

      // Test whether number is prime
      for (int k = 0; k < list.size() 
                        && list.get(k) <= squareRoot; k++) {
        if (number % list.get(k) == 0) { // If true, not prime
          isPrime = false; // Set isPrime to false          
          break; // Exit the for loop
        }
      }

//      // Print the prime number and increase the count
//      if (isPrime) {
//        count++; // Increase the count
//        list.add(number); // Add a new prime to the list
//        if (count % NUMBER_PER_LINE == 0) {
//          // Print the number and advance to the new line
//          System.out.println(number);
//        }
//        else
//          System.out.print(number + " ");
//      }

      // Check if the next number is prime
      number++;
    }
      long stopTime = System.currentTimeMillis();//added code
      long elapsedTime = stopTime - startTime;//added code
      System.out.println("Total elapsed time for Listing22_6 "+elapsedTime);//added code
  }  
}
