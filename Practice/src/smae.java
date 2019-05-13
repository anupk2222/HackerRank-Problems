
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class smae {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int smallNum = smallest(arr);
            if (smallNum == 0) {
                break;
            }
            int countNum = array(arr, smallNum);
            for (int j = 0; j < arr.length; j++) {
                // System.out.print(arr[j]+ " ");

            }
            list.add(countNum);


           // System.out.print(countNum);
            //System.out.println();

        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i).intValue();
        }
        return ret;
        
    }
    
    public static int smallest(int arr[]) {

        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallest > 0) {
                if (arr[i] < smallest && arr[i] > 0) {
                    smallest = arr[i];
                }
            } else {
                int j = i;
                smallest = arr[j++];
            }
        }

        return smallest;
    }

    public static int array(int arr[], int smallNum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= smallNum && arr[i] > 0) {
                arr[i] = arr[i] - smallNum;
                count = count + 1;
            }
        }
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result[] = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
