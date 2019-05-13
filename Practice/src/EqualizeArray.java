import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EqualizeArray {

	public static void main(String[] args) {
		
		int arr[] ={1,2,2,3};
		int count=0;
		
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
			map.put(i, count);
			
			count=0;
		}
		int max = map.get(0);
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>max){
				max=entry.getValue();
			}
			
		}
		//System.out.println(max);
		int mainCount=0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()<max){
				mainCount++;
			}
		}
		System.out.println(mainCount);
	}

}
