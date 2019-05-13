package com.examples;

public class Tavant {
	static int openCount=0;
	static int closeCount=0;
	static int count = 0;
	public static void main(String[] args) {
		String s = "{}}{";
		

		for(int i=0;i<s.length();i++){

			if(s.charAt(i)=='{'){
				
			
				openCount = openCount+1;
				
			}
			
		}
		for(int i=0;i<s.length();i++){

			 if(s.charAt(i)=='}'){
				if(closeCount>openCount){
					closeCount=openCount;
					break;
				}
				closeCount= closeCount+1;
				
			}
			
		}
		int sum = (openCount+closeCount)/2;
		System.out.println(sum);
	}
}
