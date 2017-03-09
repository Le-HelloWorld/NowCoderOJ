package mark.huawei;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            System.out.println(new StringBuilder(scanner.nextLine()).reverse());
        }
    }
}
