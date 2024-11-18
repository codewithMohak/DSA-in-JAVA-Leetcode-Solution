import java.util.ArrayList;
import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // String str = "youcandoit";
        String str = "Welcometocodingworld";
        removeVowels(str);
        sc.close();
    }

    public static void removeVowels(String st) {
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            System.out.print(ch);

        }
    }
    
}
