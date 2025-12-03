import java.util.*;

import static java.lang.Integer.MIN_VALUE;

class Day03_PZ01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum =0;
        while (sc.hasNext()) {
            String line = sc.next();
            String[] digits = line.split("");
            int tempIndex = 0;
            int highest = MIN_VALUE;
            int second = MIN_VALUE;
            for (int i = 0; i < digits.length; i++) {
                int d1 = Integer.parseInt(digits[i]);
                if (d1 > highest) {
                    tempIndex = i;
                    highest = d1;
                }
            }
            if (tempIndex == digits.length - 1) {
                for (int i = 0; i <= tempIndex - 1; i++) {
                    int d1 = Integer.parseInt(digits[i]);
                    if (d1 > second) {
                        second = d1;
                    }
                }
                second = second*10+highest;
                totalSum = totalSum+second;

            } else {
                for (int i = tempIndex+1; i < digits.length; i++) {
                    int d1 = Integer.parseInt(digits[i]);
                    if (d1 > second) {
                        second = d1;
                    }
                }
                highest = highest*10+second;
                totalSum = totalSum + highest;
                // System.out.println(highest);
            }


        }
        System.out.println(totalSum);
        sc.close();
    }

}
