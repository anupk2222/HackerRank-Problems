import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.mysql.jdbc.Buffer;

public class HackerRankIsString {

	public static void main(String[] args) {

		String s = "hereiamstackerrank";
		StringBuffer str = new StringBuffer("hackerrank");
		
		String result="";
		
		for(int i=0;i<s.length();i++){
			
			main:for(int j=0;j<str.length();j++){
				
				if(s.charAt(i)==str.charAt(j)){
					str.replace(j, j+1, "");
				result=result+s.charAt(i);	
				break main;
				}
			}
		}
		System.out.println(result);
		/*char[] chr = str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();


		for(int i=0;i<s.length();i++){

			char c=s.charAt(i);

			if(map.containsKey(c)){

				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}
		String result="";
		int c=0;
		char[] com = new char[chr.length];

		
			for (Entry<Character, Integer> entry : map.entrySet()){
				//com[c++]=entry.getKey();
				main : 
					for(int i =0;i<chr.length;i++){


						if(entry.getKey()==chr[i]){
							result=result+entry.getKey();
							map.put(entry.getKey(), entry.getValue()-1);
							break main ;
						}

					}
			

		}
		if(str.equals(result)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		System.out.println(result);*/

	}

}
