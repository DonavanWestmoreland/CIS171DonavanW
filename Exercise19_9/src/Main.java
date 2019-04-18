/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reyta
 */
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(asList(5,3,2,1,4));
        ArrayList<String> strings = new ArrayList<>(asList("Denver","Ontario","Dallas","Carthidge","Ava"));
        
        Main.sort(ints);
        Main.sort(strings);
    }
    public static <E extends Comparable<E>>void sort(ArrayList<E> list){
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
