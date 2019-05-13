import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int t=scan.nextInt();
		 int a = 0,b = 0,n = 0;
	        for(int i=0;i<t;i++){
		a=scan.nextInt();
		b=scan.nextInt();
		n=scan.nextInt();
    	
        method(a,b,n);
        System.out.println();
		
	        }
	       
	        	
	        //method(a,b,n);
	        
	       
	        
	        
		
       /* for(int i=0;i<n;i++){
        	System.out.print(s[i]+" ");
        }*/
	}
	
	static void method(int a,int b,int n){
		int sum=0;
        int[] s = new int[n];
        for(int i=0;i<n;i++){
        		int power=(int) Math.pow(2,i);
            sum=sum+(a+(power*b));
            a=0;
            s[i]=sum;
            System.out.print(s[i]+" ");
            

        }
		
		
	}
}
