import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StrangeCounter {

	public static void main(String[] args) {
		
		int second=3;
		int count=1;
		int sec2=second;
		long input = 4;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<=second;i++){
			
			map.put(count, sec2);
			count=count+1;
			sec2=sec2-1;
			if(i==second-1){
				second = 2*second;
				if(second>(int)Math.pow(2, 12)){
					break;
				}
				sec2=second;
				i=-1;
				
			}
			
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) { 
           
			if(entry.getKey()==input){
				System.out.println(entry.getValue());
			}
		}
		long z= (long) Math.pow(10,12);
		System.out.println(z);
		
		

	}

}
