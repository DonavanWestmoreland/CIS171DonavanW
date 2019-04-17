/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reyta
 */

import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static BubbleSort bs = new BubbleSort();
    public static HeapSort hs = new HeapSort();
    public static MergeSort ms = new MergeSort();
    public static QuickSort qs = new QuickSort();
    public static RadixSort rs = new RadixSort();
    public static SelectionSort ss = new SelectionSort();
    public static int[] list;
    public static double[] times = new double[36];
    
    public static void main(String[] args) {
        timeCollection();
        print();
    }
    
    public static void randomArray(int[] arr){
      for (int i = 0;i < arr.length;i++){
        int thing = (int)(Math.random()*100);
        arr[i]= thing;
      }
    }
    
    
    public static void timeCollection(){
        ArrayList<Integer> numHolder = new ArrayList<>(Arrays.asList(500,100,150,200,250,300));
        int k = 0;
        for (int i = k;i < numHolder.size(); i++){
            randomArray (list=new int[numHolder.get(i)]);
            long startTime = System.currentTimeMillis();
            SelectionSort.sort(list = new int[numHolder.get(i)]);
            long endTime = System.currentTimeMillis();
            long executionTime = (endTime - startTime);
            times[k] = executionTime;
            k++;
        }
        for (int i = 0;i < numHolder.size(); i++){
            randomArray (list=new int[numHolder.get(i)]);
            long startTime = System.currentTimeMillis();
            rs.sort(list = new int[numHolder.get(i)]);
            long endTime = System.currentTimeMillis();
            long executionTime = (endTime - startTime);
            times[k] = executionTime;
            k++;
        }
        for (int i = 0;i < numHolder.size(); i++){
            randomArray (list=new int[numHolder.get(i)]);
            long startTime = System.currentTimeMillis();
            bs.sort(list = new int[numHolder.get(i)]);
            long endTime = System.currentTimeMillis();
            long executionTime = (endTime - startTime);
            times[k] = executionTime;
            k++;
        }  
        for (int i = 0;i < numHolder.size(); i++){
            randomArray (list=new int[numHolder.get(i)]);
            long startTime = System.currentTimeMillis();
            ms.sort(list = new int[numHolder.get(i)]);
            long endTime = System.currentTimeMillis();
            long executionTime = (endTime - startTime);
            times[k] = executionTime;
            k++;
        }
        for (int i = 0;i < numHolder.size(); i++){
            randomArray (list=new int[numHolder.get(i)]);
            long startTime = System.currentTimeMillis();
            qs.sort(list = new int[numHolder.get(i)]);
            long endTime = System.currentTimeMillis();
            long executionTime = (endTime - startTime);
            times[k] = executionTime;
            k++;
        }
        for (int i = 0;i < numHolder.size(); i++){
            randomArray (list=new int[numHolder.get(i)]);
            long startTime = System.currentTimeMillis();
            hs.sort(list = new int[numHolder.get(i)]);
            long endTime = System.currentTimeMillis();
            long executionTime = (endTime - startTime);
            times[k] = executionTime;
            k++;
        }

    }
    
    public static void print(){
        System.out.println("Array Size | 50000   100000  150000  200000  250000  300000");
        System.out.println("-----------------------------------------------------------");
        System.out.println("SelectSort |  "+times[0]+"     "+times[1]+"      "+times[2]+"     "+times[3]+"     "+times[4]+"     "+times[5]);
        System.out.println("SelectSort |  "+times[6]+"     "+times[7]+"      "+times[8]+"     "+times[9]+"     "+times[10]+"     "+times[11]);
        System.out.println("SelectSort |  "+times[12]+"     "+times[13]+"      "+times[14]+"     "+times[15]+"     "+times[16]+"     "+times[17]);
        System.out.println("SelectSort |  "+times[18]+"     "+times[19]+"      "+times[20]+"     "+times[21]+"     "+times[22]+"     "+times[23]);
        System.out.println("SelectSort |  "+times[24]+"     "+times[25]+"      "+times[26]+"     "+times[27]+"     "+times[28]+"     "+times[29]);
        System.out.println("SelectSort |  "+times[30]+"     "+times[31]+"      "+times[32]+"     "+times[33]+"     "+times[34]+"     "+times[35]);
    }
    
}
