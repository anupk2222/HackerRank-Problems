package com.examples;

import java.util.Scanner;

public class cts {

	public static void main(String[] args) {

		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		Scanner scan = new Scanner(System.in);
		int flag = scan.nextInt();
		method(arr,flag);



	}

	public static void method(int[][]arr,int flag){

		if(flag==0){
			for(int i=0;i<arr.length;i++){

				for(int j=0;j<arr[i].length;j++){

					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
		if(flag==1){
			
			for(int j=0;j<arr.length;j++){
				
			for(int i=arr[j].length-1;i>=0;i--){

					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}

}
