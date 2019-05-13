import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public class PickingNumbers {

	public static void main(String[] args) {
		
		
		
		int[] a= {1,1,2,2,4,4,5,5,5};
		Arrays.sort(a);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
 		
		for(int i=0;i<a.length;i++){
			
			List<Integer> l = new ArrayList<>();
			l.add(a[i]);
 			for(int j=i+1;j<a.length;j++){
				
				int num=Math.abs(a[i]-a[j]);
				
				
				if(num<=1){
					
					l.add(a[j]);
				}
			}
 			list.add(l);
		}
		
		int max=list.get(0).size();
		
		for(int i=0;i<list.size();i++){
			
			
			if(list.get(i).size()>max){
				max=list.get(i).size();
			}
		}
		System.out.println(max);

	}

}
