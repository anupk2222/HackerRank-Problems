import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numOfInputs = scan.nextInt();

		Map<String,Integer> map = new LinkedHashMap<>();
		Map<String,Integer> mapdemo = new LinkedHashMap<>();

		String[] test = new String[numOfInputs];

		//System.out.println(numOfInputs);



		for(int i=0;i<numOfInputs;i++){
			scan.nextLine();
			String stringInput = scan.nextLine();
			//System.out.println(stringInput);

			
			int phoneNum = scan.nextInt();
			
			map.put(stringInput, phoneNum);
			

		}
		scan.nextLine();

		for(int i=0;i<numOfInputs;i++){
			String inp=scan.nextLine();
			if(map.containsKey(inp)){
				for (Entry<String, Integer> entry1 : map.entrySet()){
					if(entry1.getKey().equals(inp)){
						//scan.nextLine();
					mapdemo.put(inp,entry1.getValue() );
					}
					
				}

			}
			else{
				mapdemo.put(inp,null);
			}
			
		}
		scan.close();

		for (Entry<String, Integer> entry : mapdemo.entrySet()){



			if(map.containsKey(entry.getKey())==true){



				System.out.println(entry.getKey() + "=" + entry.getValue());

			}
			else{
				System.out.println("Not found");
			}

		}

	}
}
