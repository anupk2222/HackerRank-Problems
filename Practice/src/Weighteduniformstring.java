import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Weighteduniformstring {

	public static void main(String[] args) {


		String s = "aaabbbbcccddd";
		int[] arr ={9,7,8,12,5};
		Map<String,Integer> map = new LinkedHashMap<>();
		String result="";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			String str=String.valueOf(c);
			if(map.containsKey(str)){
				result = result+s.charAt(i);
				int fin = 0;
				for(int j=0;j<result.length();j++){
					Integer a= Integer.valueOf(result.charAt(j));
					int sum = a-96;
					fin=fin+sum;

				}
				map.put(result, fin);

			}
			else{
				result=""+s.charAt(i);
				Integer a= Integer.valueOf(s.charAt(i));
				int sum = a-96;

				map.put(result, sum);
			}


		}
		for(int i=0;i<arr.length;i++){

			//MAIN:for (Entry<String, Integer> entry : map.entrySet()){

				if(map.containsValue(arr[i])){
					System.out.println("Yes");
					//break MAIN;
				}
				else{
					System.out.println("No");
				}
				

			//}
			
		}

	}

}
