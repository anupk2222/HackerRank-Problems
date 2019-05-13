
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankDemo {

    // Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
        int size=s.length();
        int countD=0;
        //int countU = 0;
        int[] arr = new int[size+1];
        //int[] arr1 = new int[size];
        int zeroCount=0;
        for(int i=0;i<size+1;i++){
            if(s.charAt(i)=='U'){
                arr[i]=countD++;
            }
            else if(s.charAt(i)=='D'){
               arr[i]=countD--;
            }
        }
        for(int i=1;i<size;i++){
           // if(arr[i].length==arr1[i]&&)
           if(arr[i]==0&&arr[i-1]==-1){
               zeroCount++;
           }
        }
        return zeroCount;


    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Input n");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
   	 System.out.println("Input s");
        String s = scanner.nextLine();

        int result = countingValleys(n, s);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();
        System.out.println(result);

        scanner.close();
    }
}
