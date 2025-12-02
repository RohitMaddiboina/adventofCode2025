import java.util.*;

class Day02_PZ02 {
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
                int maxPairLength = (""+j).length()/2;
                int count=0;
                for(int k=1;k<=maxPairLength;k++){
                List <Long> sets = split( (""+j), k);
                    for(int l=1;l<sets.size();l++){
                        if(sets.get(l-1).equals(sets.get(l))){
                            count++;
                        }else{
                            count=0;
                            break;
                        }
                    }
                     if(count>=2){
                         break;   
                    }
                }
                if(count!=0){
                    totalSum=totalSum+j;
                }
            }
        }
        
        System.out.println(totalSum);
    
       

        sc.close();
    }
    
    private static List<Long> split(String s, int partSize){
        List<Long> parts = new ArrayList();
        for(int i=0;i<s.length();i=i+partSize){
            int end = Math.min(i+partSize,s.length());
            parts.add(Long.valueOf(s.substring(i, end)));
        }
        return parts;
    }
}
