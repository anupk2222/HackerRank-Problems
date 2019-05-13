import java.util.Arrays;

public class integerDublicates {
	
	public static void main(String[] args) {
		
		int[] a={1,1,2,1,1,3,3,1,6,1,6};
		int count=0;
		//Arrays.sort(a);
		
		for(int i =0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					count=count+1;
					//i=j;
					//System.out.println(a[i]);
					//break;
					//j++;
				}
				
				
			
			
		}
		if(count==1){
			System.out.println(a[i]);
			
		}
		count=0;
		}
	}

}
