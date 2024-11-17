import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // ADD
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //ADD AT INDEX
        list.add(1,40);
        System.out.println(list);

        //GET
        System.out.println(list.get(2));

        //SET
        list.set(2,50);
        System.out.println(list.get(2));

        //REMOVE
        list.remove(2);
        System.out.println(list);

        //SIZE
        System.out.println(list.size());
    }
}