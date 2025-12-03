import java.util.*;

import static java.lang.Integer.MIN_VALUE;

class Day03_PZ02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalSum =0;
        while (sc.hasNext()) {
            String line = sc.next();
            String[] digits = line.split("");
            int tempIndex = 0;
            long localHigh = 0;
            int totalDesiredLength = 12;
            while(totalDesiredLength!=0){
                int totalSearchAreaEndIndex = line.length() - totalDesiredLength;
                int highest = MIN_VALUE;
                for(int i=tempIndex; i <= totalSearchAreaEndIndex; i++){
                    int digit = Integer.parseInt(digits[i]);
                    if(digit > highest) {
                        tempIndex = i + 1;
                        highest = digit;
                    }
                }
                localHigh = localHigh*10+highest;
                totalDesiredLength--;
            }
            totalSum = totalSum + localHigh;
        }
        System.out.println(totalSum);
        sc.close();
    }

}
