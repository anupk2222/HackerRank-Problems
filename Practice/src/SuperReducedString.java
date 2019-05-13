import java.util.LinkedHashMap;
import java.util.Map;

public class SuperReducedString {
	public static void main(String[] args) {

		String a = "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
		StringBuffer sb = new StringBuffer(a);
		Map<Character,Integer> map = new LinkedHashMap<>();
		int count=0;
		for(int i=0;i<a.length();i++){

			CharSequence c =sb.subSequence(i, i+1);



			if(map.containsKey(a.charAt(i))){
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
				//sb.replace(i, i+1, "");
				map.remove(a.charAt(i));
			}
			else{
				map.put(a.charAt(i), 1);

			}

		}
		if(map.isEmpty()){
			System.out.println("Empty String");
		}
		else{
			for (Map.Entry<Character,Integer> entry : map.entrySet()) {

				System.out.print(entry.getKey());
			}
		}

	}
}
