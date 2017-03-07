package mark.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MingMingRandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> result = new HashSet<>();
        while (scanner.hasNext())
        {
            int n = scanner.nextInt();
            while (n > 0)
            {
                int input = scanner.nextInt();
                result.add(input);
                n--;
            }
            printResult(result);
            result.clear();
        }
    }

    private static void printResult(HashSet<Integer> result) {
        ArrayList<Integer> sort = new ArrayList<>();
        for (Integer i : result)
        {
           sort.add(i);
        }
        Collections.sort(sort);
        for (Integer i : sort)
        {
            System.out.println(i);
        }
    }
}
