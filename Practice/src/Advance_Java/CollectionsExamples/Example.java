package Advance_Java.CollectionsExamples;
// all of the below are extending the collection interface
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Example {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>(); // this is a collection of all types of data
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        List<Integer> list = new ArrayList<>(); // this is a list of all types of data
        list.add(1);
        list.add(55);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Set<Integer> set = new HashSet<>(); // this only includes unique values
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        Collection<Integer> set2=new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);
        Iterator<Integer> it=nums.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
