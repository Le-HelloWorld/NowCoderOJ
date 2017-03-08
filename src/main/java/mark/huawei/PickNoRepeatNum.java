package mark.huawei;

import java.util.Scanner;
import java.util.Stack;

public class PickNoRepeatNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int num = scanner.nextInt();
            processNum(num);
        }
    }

    private static void processNum(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        String result = "";
        for (int i = 0; i < sb.length(); i++)
        {
            if (!result.contains(String.valueOf(sb.charAt(i))))
            {
                result += sb.charAt(i);
            }
        }
        System.out.println(Integer.valueOf(result));
    }
}
