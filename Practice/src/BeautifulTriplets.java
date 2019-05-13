import java.util.ArrayList;
import java.util.List;

public class BeautifulTriplets {

	
	public static void main(String[] args) {
		
		int[] array = {1 ,2, 4, 5, 7, 8, 10};
		int d = 3;
		int count=0;
		
		  List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

	        for(int i=0;i<array.length;i++){
	        	
	        	ArrayList<Integer>  addList = new ArrayList<Integer>();
	        	
	        	for(int j=i+1;j<array.length;j++){
	        		
	        		if((array[i]+3)==array[j]){
	        			
	        			addList.add(array[i]);
	        			addList.add(array[j]);
	        			
	        			
	        		}
	        		 if((array[i]+6)==array[j]){
        				addList.add(array[j]);
        				break;
        			}
	        	}
	        	if(addList.size()==3){
	        	list.add(addList);
	        	count=count+1;
	        	}
	        }
	        System.out.println(count);

	}
}
