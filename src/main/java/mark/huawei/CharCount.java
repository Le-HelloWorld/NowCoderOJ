package mark.huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
        {
            String source = scan.nextLine();
            String target = scan.nextLine();
            System.out.println(charCount(source, target));
        }
    }

    private static int charCount(String source, String target){
        int count = 0;
        Pattern p = Pattern.compile(target.toLowerCase());
        Matcher m = p.matcher(source.toLowerCase());
        while (m.find())
        {
            count++;
        }
        return count;
    }
}
