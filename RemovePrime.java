import java.util.ArrayList;

public class RemovePrime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(12);
        list.add(13);
        list.add(15);
        list.removeIf(RemovePrime :: isPrime);
        System.out.println(list);

    }

    public static boolean isPrime(int list) {
        if (list <= 1) return false;
        for (int i = 2 ; i <= Math.sqrt(list); i++) {
            if (list % i == 0) return false;
        }
        return true;
    }

}
