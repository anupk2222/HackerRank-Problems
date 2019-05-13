import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LisaWorkbook {

	public static void main(String[] args) {

		int[] arr = {4 ,2, 6, 1, 10};
		int d=3;
		int count=1;

		Map<Integer,List<Integer>> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){

			List<Integer> list = new ArrayList<>();
			//List<Integer> list1 = new ArrayList<>();
			boolean a=true;
			for(int j=0;j<arr[i];j++){

				if(j<=d-1){
					list.add(j+1);
					map.put(count, list);

				}
				else{
					if(list.size()==d){
						a=true;
					}
					if(a){
						a=false;
						count = count+1;
						list = new ArrayList<>();

					}

					list.add(j+1);
					map.put(count, list);
				}



			}
			//map.put(count, list);
			count=count+1;


		}
		int specialCount=0;
		for (Entry<Integer, List<Integer>> entry : map.entrySet()) {

			for(Integer itr : entry.getValue()){

				if(entry.getKey()==itr){
					specialCount=specialCount+1;

				}
			}
		}
		System.out.println(specialCount);
		

	}

}
