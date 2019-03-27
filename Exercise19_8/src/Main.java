/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reyta
 */
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arrays
        ArrayList<Integer> ints = new ArrayList<>(asList(1,2,3));
        ArrayList<String> strings = new ArrayList<>(asList("Nebraska","Idaho","California")); 
        // callign generic method
        Main.shuffle(ints);
        Main.shuffle(strings);
    }
    
    public static <E> void shuffle(ArrayList<E> list){
        //before
        System.out.println(list);
        //shuffling
        Collections.swap(list, 0,2);
        //after
        System.out.println(list);
    }
    
}
