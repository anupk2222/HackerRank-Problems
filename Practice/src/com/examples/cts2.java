package com.examples;

import java.util.Scanner;

public class cts2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		
		for(int i=0;i<=n;i++){
			
			for(int j=0;j<n;j++){
				
				int sum=n/2;
				
				if(i!=0&&j==sum){
					count=count+1;
					System.out.print(count);
				}
				else{
					System.out.print(n);
				}
			}
			System.out.println();
		}

	}

}
