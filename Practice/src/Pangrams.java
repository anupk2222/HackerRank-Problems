import java.util.LinkedHashMap;
import java.util.Map;

public class Pangrams {

	public static void main(String[] args) {
		
		
		String s= "We promptly judged antique ivory buckles for the next prize";
		String c = s.replaceAll("\\s+", "").toLowerCase();
		StringBuffer sb = new StringBuffer(c);
		int count=0;
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<sb.length();i++){
			
			Integer a= Integer.valueOf(sb.charAt(i));
			if(a>=65&&a<=90 || a>=97&&a<=122){
				
				if(map.containsKey(sb.charAt(i))){
					
					map.put(sb.charAt(i),  map.get(sb.charAt(i))+1);
				}
				else{
					map.put(sb.charAt(i), 1);
				}
			}
			
			
		}
		if(map.size()==26){
			System.out.println("Pangrams");
		}
		else{
			System.out.println("Not Pangrams");
		}

	}

}
