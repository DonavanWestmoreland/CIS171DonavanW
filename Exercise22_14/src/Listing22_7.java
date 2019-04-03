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
public class Listing22_7 {
  public static void main(String[] args,int n) {
    long startTime = System.currentTimeMillis();//added code
//    Scanner input = new Scanner(System.in);
//    System.out.print("Find all prime numbers <= n, enter n: ");
    
    
    boolean[] primes = new boolean[n + 1]; // Prime number sieve
    
    // Initialize primes[i] to true
    for (int i = 0; i < primes.length; i++) {
      primes[i] = true; 
    }
    
    for (int k = 2; k <= n / k; k++) {
      if (primes[k]) {
        for (int i = k; i <= n / k; i++) {
          primes[k * i] = false; // k * i is not prime
        }
      }
    }
    
    final int NUMBER_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers found so far
    // Print prime numbers
//    for (int i = 2; i < primes.length; i++) {
//      if (primes[i]) {
//        count++;
//        if (count % 10 == 0) 
//          System.out.printf("%7d\n", i);
//        else
//          System.out.printf("%7d", i);          
//      }
//    }
    
      long stopTime = System.currentTimeMillis();//added code
      long elapsedTime = stopTime - startTime;//added code
      System.out.println("Total elapsed time for Listing22_7 "+elapsedTime);//added code
  }  
}
