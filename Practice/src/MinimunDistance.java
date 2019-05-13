import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimunDistance {

	public static void main(String[] args) {
		
		int[] arr={7, 1, 7, 4, 1, 7};
		int count=0;
		int i=0;
		int j=0;
		List<Integer> list = new ArrayList<Integer>();
		
		for( i=0;i<arr.length;i++){
			
			for( j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					count=count+1;
					//System.out.println(arr[i]);
					
					
					
				}
				
			}
			if(count==1){
				//count=0;
				System.out.println(arr[i]);
				int sub=Math.abs(i-j);
				list.add(sub);
			}
			
			count=0;
			
		}
		if(list.size()==2){
		int minIndex = (Collections.min(list));
		System.out.println(minIndex);
		}
		else{
			System.out.println("-1");
		}
		
		
		

	}

}
