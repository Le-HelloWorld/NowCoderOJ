package mark.huawei;


import java.util.Scanner;

/**
 * 取近似值
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class NumberRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
        {
            System.out.println(Math.round(scan.nextDouble()));
        }

    }
}
