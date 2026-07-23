import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Set<Integer> hst= new HashSet<>();
        hst.add(10);
        hst.add(89);
        hst.add(77);
        hst.add(10); // wont give error but doesnt contain duplicate values
        System.out.println(hst+" ");

        //linked hashset
        Set<Integer> hst2= new LinkedHashSet<>();
        hst2.add(10);
        hst2.add(89);
        hst2.add(77);
        System.out.println(hst2+" ");

        //treeSet
        Set<Integer> hst3= new TreeSet<>();
        hst3.add(10);
        hst3.add(89);
        hst3.add(77);
        hst3.add(10); // wont give error but doesnt contain duplicate values
        System.out.println(hst3+" ");
    }
    
}
