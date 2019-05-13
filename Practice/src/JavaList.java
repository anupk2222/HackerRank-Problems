import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numOfInput = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numOfInput;i++){
			
			list.add(scan.nextInt());
			
		}
		int operation=scan.nextInt();
		for(int i=0;i<operation;i++){
			String in=scan.next();
			if(in.equals("INSERT")){
				int position=scan.nextInt();
				int num=scan.nextInt();
				list.add(position, num);
				
			}
			else if(in.equals("DELETE")){
				int positionDel=scan.nextInt();
				list.remove(positionDel);
			}
		}
		//System.out.println(list);
		for(Integer itr:list){
			System.out.print(itr+" ");
		}
	}

}
