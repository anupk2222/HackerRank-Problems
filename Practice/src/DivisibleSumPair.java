
public class DivisibleSumPair {

	public static void main(String[] args) {
		
		
		int[] ar = {1,2,3,4,5,6};
		
		int k=5;
		int count=0;
		
		for(int i=0;i<ar.length;i++){
			
			for(int j=i+1;j<ar.length;j++){
				
				if((ar[i]+ar[j])%k==0){
					
					count=count+1;
				}
				
			}
		}
		System.out.println(count);

	}

}
