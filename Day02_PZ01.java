import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String serial = sc.nextLine().trim();
        String[] ranges = serial.split(",");
        long totalSum = 0;
        for(int i=0;i<ranges.length;i++){
            String[] range = ranges[i].split("-");
            long s = Long.valueOf(range[0]);
            long e = Long.valueOf(range[1]);
            for(long j=s; j<=e;j++){
                int len = (""+j).length();
                if((""+j).startsWith("0")){
                    continue;
                }
                int divisor = 10;
                for(int z=1;z<(""+j).length()/2;z++){
                    divisor = divisor*10;
                    
                }
                long firstHalf = j/divisor;
                long secondHalf = j%divisor;
                if(firstHalf==secondHalf){
                    // System.out.println(j);
                    totalSum=totalSum+j;
                }
            }
        }
        
        System.out.println(totalSum);
    
       

        sc.close();
    }
}
