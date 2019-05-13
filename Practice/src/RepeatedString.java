import java.math.BigInteger;

public class RepeatedString {
	
	
	public static void main(String[] args) {
		String s = "abcac";
		
		
		long  n=10;
		int Size = s.length();
        long quotient = n/Size;
        long reminder = n%Size;
        String str="";
        
        for(int i =0;i<quotient;i++){
          
             str = str.concat(s);
             
        }
        for(int i =0;i<reminder;i++){
        	
        	str = str+s.charAt(i);
        	
        }
        long count=0;
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)=='a'){
        		count=count+1;
        	}
        }
        
        System.out.println(str);
        System.out.println("quotient: "+quotient );
        System.out.println("count: "+count );
	}

}
