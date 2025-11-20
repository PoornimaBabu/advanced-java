//Collection, List examples

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);    
        numbers.add(30);
        numbers.add(40);
        // numbers.add("60");

        // Set<Integer> array = new HashSet<Integer>(); //unordered
        Set<Integer> array = new TreeSet<Integer>(); //sorted order 
        array.add(44);
        array.add(23);
        array.add(10);
        array.add(5);
        array.add(5); //duplicate values are not allowed in Set

        Iterator<Integer> i = array.iterator(); //Collection is extended from Iterable interface
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("Collection - ");
        for(int num : numbers){
            System.out.println(num);
        }
        System.out.println("Set - ");
        for(int a : array){
            System.out.println(a);
        }
    }
}
