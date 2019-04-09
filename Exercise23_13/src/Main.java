/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Donavan Westmoreland
 */
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // random number generating
    for (int i = 0;i < 10000;i++){
      int thing = (int)(Math.random()*10000);
      list.add(i, thing);
    }
    radixSort(list);
  }//end of main
  
  
  public static void radixSort(ArrayList<Integer> list){
      ArrayList<Integer>[] bucket = new ArrayList[10];//initializing buckets
      //creating buckets 0-9
      for (int i = 0; i < 10; i++){
          bucket[i] = new ArrayList<>();
      }
      //for checking each digit
      int divisor = 1;
      
      for (int h = 0;h < 3;h++){
          
          for (int i = 0; i < list.size(); i++) {
              // seperating the buckets by the digit and sorting them into each bucket
              bucket[(list.get(i)/divisor)%10].add(list.get(i));
              } //end of for2
          list.clear();
          for (int f = 0; f < 10; f++){
              //putting everything back into the ArrayList
              list.addAll(bucket[f]);
              bucket[f].clear();//emptying buckets for the next loop
          }//end of for3
          divisor *=10; // increasing the digit checked
      }//end of for1
      
      System.out.println(list);//printing out ArrayList
  }
}
