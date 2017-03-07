package mark.huawei;

import java.util.Scanner;

public class FillupString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String str = scanner.nextLine();
            printFillupString(str);
        }
    }

    private static void printFillupString(String str) {
        if (str.length() % 8 != 0)
        {
            for (int i = 0; i < str.length() % 8; i++)
            {
                str += "0";
            }
        }

        for (int i = 0; i < str.length() / 8; i++)
        {
            System.out.println(str.substring(8 * i, 8 + 8 * i));
        }


    }
}
