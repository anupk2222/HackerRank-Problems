import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HappyLadybugs {

	public static void main(String[] args) {

		/*String s="AABBC";
		String result = "";
		int count=0;
		int sum=0;
		char[] c =s.toCharArray();

		for(int i=0;i<s.length();i++){

			for(int j=i+1;j<s.length();j++){

				if(c[i]==c[j]){
					 
					 count=count+1;
					
					
				}
				

			}
			if(count==1){
				//System.out.println(c[i]);
				result="YES";
				
			}
			
			count=0;
			
		}
		System.out.println(result);*/
		
		String s="CCAA_";
		
		int count=0;
		String result="YES";
		char[] c =s.toCharArray();
		Map<String,Integer> map= new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			
			if(s.subSequence(i, i+1) != null){
				
				String str = (String) s.subSequence(i, i+1);
				
				if (map.containsKey(str)) {
	                map.put(str, map.get(str) + 1);
	            } else {
	                map.put(str, 1);
	            }
				
				
				
				
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) { 
			
			Pattern p = Pattern.compile("[^A-Za-z0-9]");
			Matcher m = p.matcher(entry.getKey());
			boolean bool = m.find();
			if (bool == true){
				result = "YES";
				continue;
			}
	           
			if(entry.getValue()==1){
				result="NO";
			}
			
			
		}
		System.out.println(result);

	}
	

}
