package mark.huawei;

import java.util.Scanner;

/**
 * 数字反转
 * 描述：
 *      输入一个整数，将这个整数以字符串的形式逆序输出
 *      程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class NumberInverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
        {
            System.out.println(inverseNumber(scan.nextInt()));
        }
    }

    private static String inverseNumber(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        return sb.reverse().toString();
    }
}
