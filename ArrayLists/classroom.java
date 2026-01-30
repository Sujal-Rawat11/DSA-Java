package ArrayLists;
import java.util.*;

public class classroom {
    public static void main(String args[]){
        //Java collection Framework
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Get Operation - o(1)
        int element = list.get(2);
        System.out.println(element);

        //Delete 
        list.remove(2);
        System.out.println(list);

        //Set
        list.set(2, 10);

        //contain
        System.out.println(list.contains(1));
        System.out.println(list.contains(11)); 
        

    }
}
