import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BomberMan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int r = 6;

	        List<String> grid = new ArrayList<>();
	        List<List<String>> list = new ArrayList<List<String>>();

	        for (int i = 0; i < r; i++) {
	            String gridItem = scanner.nextLine();
	           grid.add(gridItem);
	           
	        }
	        list.add(grid);
	        //System.out.println(list);
	        for(int i=0;i<list.size();i++){
	        	System.out.println(list.get(i));
	        }


	}

}
