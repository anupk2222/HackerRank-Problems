import java.util.Arrays;

public class StringReverse {
public static void main(String[] args) {
	

	String p="madam";
	String a = p.toLowerCase();
	String q="mada";
	String b = q.toLowerCase();
	char[] aa = new char[a.length()];
	char[] bb =new char[b.length()];
	boolean flag=true;
	
   
	if(a.length()==b.length()){
		
		for(int i =0;i<a.length();i++){
			 aa[i] = a.charAt(i);
			 bb[i] = b.charAt(i);
			 
			 
		}
		method(aa);
		method(bb);
		
		for(int i1 =0;i1<a.length();i1++){
			
			
				 
				 if(aa[i1]==bb[i1]){ 
					flag=true;
				 }
				 
				 else{
					 flag=false;
				 }
			 
		}
		if(flag==true){
			System.out.println("anagram");
		}
		else{
			System.out.println("not anagram");
		}
		//System.out.println("anagram");
		
		}
	else{
		System.out.println("Not annagram");
	}
    	
    	
}
	 private static void swapChars(int i, int j, char[] charArray) {
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	    }
	 private static void method(char[] aa){
		 for (int i = 0; i < aa.length; i++) {
	            for (int j = i + 1; j < aa.length; j++) {
	                if (Character.toLowerCase(aa[j]) < Character.toLowerCase(aa[i])) {
	                    swapChars(i, j, aa);
	                }
	            }
			}
	 }
}
	 

