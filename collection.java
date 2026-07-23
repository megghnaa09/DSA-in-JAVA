import java.util.*;
public class collection{
    public static void main(String[] args) {
        List<Integer> li= new ArrayList<>();
        li.add(20);
        li.add(30);
        li.add(40);
        li.remove(2);
        li.add(1,20);
        System.out.println(li+" ");

        List<Integer> li2= new ArrayList<>();
        li2.addAll(li);
        System.out.println(li2+" ");
        System.out.println();
        System.out.println(li2.get(1));

        System.out.println("for loop:");
        for(Integer ele:li){
            System.out.println(ele+" ");
        }
        System.out.println("Iterator:");
        Iterator<Integer> it= li.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}