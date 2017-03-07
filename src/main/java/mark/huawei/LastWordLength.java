package mark.huawei;

import java.util.Scanner;

public class LastWordLength {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
        {
            String line = scan.nextLine();
            System.out.println(lastWordLength(line));
        }
    }

    private static int lastWordLength(String line) {
        if (5000 > line.length())
        {
            String[] split = line.split("\\s+");
            return split[split.length - 1].length();
        }
        else
        {
            return 0;
        }
    }
}
