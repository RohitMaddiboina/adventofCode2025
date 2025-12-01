import java.util.*;
import java.lang.*;
import java.io.*;

class Day01PZ01
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int totalRotations = 100;
		int resolvedVal = 50;
		int pwd = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
		    String opr = scanner.next();
		    int startIndex = findStartingDigitOfCharater(opr);
		    String dir = opr.substring(0,startIndex);
		    int times = Integer.valueOf(opr.substring(startIndex));
		    
		    if("R".equals(dir)){
		        resolvedVal=resolvedVal+(times%100);
		        resolvedVal = resolvedVal%100;
		    }else if("L".equals(dir)){
		      resolvedVal= resolvedVal - (times%100);
		      resolvedVal=(100+resolvedVal)%100;
		      
		    }
		    if(resolvedVal == 0){
		        pwd++;
		    }
		}
        System.out.println(pwd);
        

	}
	
	private static int findStartingDigitOfCharater(String raw){
	    for(int i=0;i<raw.length(); i++){
	        if(Character.isDigit(raw.charAt(i))){
	            return i;
	        }
	    }
	    return -1;
	}
}
