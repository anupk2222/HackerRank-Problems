import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Solution {

	public static void main(String[] args) {
		int[] width={2 ,3, 1, 2, 3, 2, 3, 3};
		int[][] cases = {{0,3},{4,6},{6,7},{3,5},{0,7}};
		int[] maxarray=new int[cases.length];
		int n=8;
		int count=0;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		

			for(int i=0;i<width.length;i++){
				map.put(count, width[i]);
				count++;
			}
		
		for(int l=0;l<cases.length;l++){
			
			int size=0;
			int[] arr=null;

			size=(cases[l][1]-cases[l][0])+1;
			arr=new int[size];



			int count1=0;
			


			main:for (Entry<Integer, Integer> entry : map.entrySet()) {
				if(count1<size){
					if(entry.getKey()>=cases[l][0]){
						arr[count1]=entry.getValue();
						count1++;
					}
				}
				else{
					break main;
				}
			}
			int min=arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]<min){
					min=arr[i];
					//maxarray[l]=max;
				}
				

			}
			
			maxarray[l]=min;
		}
		System.out.println(map);
		for(int i=0;i<maxarray.length;i++){
			System.out.print(maxarray[i]+" ");
		}
		//System.out.println(max);
	}
}
