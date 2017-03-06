package mark.huawei;

import java.util.Scanner;

/**
 * 查找输入整数二进制中的个数
 * 求int型正整数在内存中存储时1的个数
 */

public class FindNumberOf1 {
    private static int findNumberOf1(int num) {
        /* 请实现 */
        return Integer.bitCount(num);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
        {
            System.out.println(findNumberOf1(scan.nextInt()));
        }
    }
}
