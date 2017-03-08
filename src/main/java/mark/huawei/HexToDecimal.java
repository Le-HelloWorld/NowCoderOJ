package mark.huawei;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String hex = scanner.nextLine();
            System.out.println(Integer.valueOf(hex.substring(2), 16));
        }
    }
}
