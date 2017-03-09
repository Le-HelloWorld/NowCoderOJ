package mark.huawei;

import java.util.Scanner;

public class CountAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNegative = 0;
        double sum = 0;
        while (scanner.hasNext())
        {
            String nums = scanner.nextLine();
            String[] num = nums.split("\\s+");
            for (String cur : num)
            {
                if (cur.contains("-"))
                {
                    countNegative++;
                }
                else
                {
                    sum += Integer.parseInt(cur);
                }
            }
            System.out.println(countNegative);
            int countPositive = num.length - countNegative;
            if (countPositive != 0)
            {
                System.out.println(String.format("%.1f",sum / countPositive));
            }
            else
            {
                System.out.println(0.0);
            }

        }

    }
}
