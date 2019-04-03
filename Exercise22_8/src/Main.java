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
import java.util.ArrayList;
import java.io.IOException;
import static java.util.Arrays.asList;
class Main {
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(System.in);
    int n ;
    System.out.println("find all Prime numbers up to: ");
    n = scan.nextInt();
    numbers(n);
    scan.close();
  }
  public static boolean isPrime(int n)throws IOException{
    // 2 is the only even prime number
    if (n%2==0) return false;
    //i only need to check the odds after 2
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;//false = not prime
    }
    return true;//true = prime
    }


    public static void numbers(int n )throws IOException{
        PrimeFile.readFromFile();
        ArrayList<Integer> list = PrimeFile.thing;
        if (!list.contains(2)){
            list.add(0,2); // manually added two cause it was giving me trouble and i was running out of time
        }
        for (int i = 2; i<n; i++){
            if (isPrime(i)== true) {
                //System.out.println("yay");    testing
                if(!list.contains(i)){ //checking to see if its already in the arrayList so no repeats
                    list.add(i);
                }
                //else System.out.println("already there"); testing
            }
            //else System.out.println("Not Prime"); testing
            
        }
        System.out.println(list);
        PrimeFile.writeToFile(list);
    }
}

  


    





