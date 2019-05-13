import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staticInitilizationBlock {
/*
//Write your code here
static Scanner scan = new Scanner(System.in);
static boolean flag = true;
static int B;
static int H;
static {
	 try {
 B=scan.nextInt();
 H =scan.nextInt();
       
  if(B<0 || H<0){
      flag=false;
     throw new Exception();
		
	} }catch (Exception e) {
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
  
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main
*/
	
	/*public static void main(String[] args) {
		 String s="0";
		int n=100;
		 if(n>=-100&&n<=100){
		  s = String.valueOf(n);
		   }
		    
		    if (n == Integer.parseInt(s)) {
		     System.out.println("Good job");
		    } else {
		     System.out.println("Wrong answer.");
		    }
	}*/
	public static void main(String[] args) {
		String A ="welcometojava";
		int n=3;
		String s="";
		String smallest="";
		String largest="";
		int i;
		//String B = "java";
		List<String> lst = new ArrayList<String>();
		for( i =0;i<=A.length()-n;i++){
			
			s=A.substring(i, i+n);
			lst.add(s);
			
		if( i == 0){
            smallest = s;
        }
        if(s.compareTo(largest)>0){
            largest = s;
        }else if(s.compareTo(smallest)<0)
            smallest = s;
		}
		
		for(String a:lst){
			System.out.println(a);
			
		}
		System.out.println();
		System.out.println(smallest);
		System.out.println(largest);
		
		/* String p=A.substring(0,1).toUpperCase();
         p=p+A.substring(1, A.length()).toLowerCase();
         String q=B.substring(0,1).toUpperCase();
         q=q+B.substring(1, B.length()).toLowerCase();
System.out.println(p+" "+q);*/
				//char first = s.toUpperCase().charAt(0);
				//String y = first+p;
				//System.out.println(p);
	}

private static String substring(int i, int length) {
	// TODO Auto-generated method stub
	return null;
}

	
}//end of class
