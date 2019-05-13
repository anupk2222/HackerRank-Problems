
public class CavityMap {

	public static void main(String[] args) {
		
		
		String[] arr = {"191","142","1374","259"};
		String[] srr = new String[arr.length];
		char x = 'X';
		for(int i=0;i<arr.length;i++){
			
			
			//String str = String.valueOf(arr[i]);
			StringBuilder str=new StringBuilder(String.valueOf(arr[i]));
			
			for(int j=0;j<str.length()-2;j++){
				
				if((str.charAt(j)<str.charAt(j+1))&&(str.charAt(j+2)<str.charAt(j+1))){
						char cr = str.charAt(j+1);
						cr=x;
						
						str = str.replace(j+1, j+2, "X");
				}
				
			}
			//System.out.println(str);
			srr[i]=str.toString();
			
			
		}
		for(String st : srr){
			System.out.println(st);
		}
		

	}

}
