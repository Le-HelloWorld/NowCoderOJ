package mark.huawei;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class MergeTableRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int loop = scanner.nextInt();

            SortedMap<Integer, Integer> saveRecord = new TreeMap<>();
            for (int i = 0; i < loop; i++)
            {
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                if (saveRecord.containsKey(key))
                {
                    saveRecord.put(key, value + saveRecord.get(key));
                }
                else
                {
                    saveRecord.put(key, value);
                }
            }
            for (Integer key : saveRecord.keySet())
            {
                System.out.println(key + " " + saveRecord.get(key));
            }
        }
    }
}
