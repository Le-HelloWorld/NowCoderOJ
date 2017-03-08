package mark.huawei;

import java.util.HashSet;
import java.util.Scanner;

public class CountCharType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            String str = scanner.nextLine();
            processStr(str);
        }
    }

    private static void processStr(String str) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++)
        {
            int c = str.charAt(i);
            if (0 <= c && 127 >= c)
            {
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
