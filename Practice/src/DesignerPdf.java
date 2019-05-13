
public class DesignerPdf {
	public static void main(String[] args) {
		
		int[] a={1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
		String input = "zaba";
		int[] arr = new int[input.length()];
		int[] value= new int[input.length()];
		int maximum=value[0];
			
			for(int j=0;j<input.length();j++){
				
				char c = input.charAt(j);
				int sum=0;
				
				int in = Integer.valueOf(c)-96;
				//System.out.println(in);
				arr[j]=in;
				sum = a[arr[j]-1];
				value[j]=sum;
			
				if(value[j]>maximum){
					maximum=value[j];
				}
				
				
				
			}
			int cal=(input.length()*1)*maximum;
			System.out.println(cal);
			
		
	}

}
