import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerRanKElectronicshop {

	/*
	 * Complete the getMoneySpent function below.
	 */
	public static void main(String[] args)  {
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int[] keyboards={4};
		int[] drives={5,7,8};
		int b=5;
		Long number=(long) 0;
		//int mul=(keyboards.length)*(drives.length);
		//int[] ar=new int[mul];
		List<Long> lst = new ArrayList<>();
		List<Long> lst1 = new ArrayList<>();
		for(int i=0;i<keyboards.length;i++){

			

				for(int j=0;j<drives.length;j++){



					lst.add((long)(keyboards[i]+drives[j]));

					
				}
				
			}

		
		
		
		Collections.sort(lst);
		if(lst.get(0)>b){
			number = (long) -1;
			System.out.println(number);
			System.exit(0);
		}
		for(Long itr: lst){
			if(itr.intValue()>=b){
				lst1.add(itr);
			}
		}
		
		for(Long itr1 : lst1){
			lst.remove(itr1);
		}
		
		Collections.reverse(lst);
		 number =lst.get(0);
		
		


		System.out.println(number);
		/*
		 * Write your code here.
		 */

	}


}


