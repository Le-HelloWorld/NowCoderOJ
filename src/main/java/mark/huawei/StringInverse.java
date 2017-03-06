package mark.huawei;

import java.util.Scanner;

public class StringInverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb;
        while (scan.hasNext())
        {
            sb = new StringBuilder(scan.nextLine());
            System.out.println(sb.reverse());
        }
    }
}
