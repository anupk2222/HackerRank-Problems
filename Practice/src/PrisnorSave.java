
public class PrisnorSave {

	public static void main(String[] args) {

		int numofprisnor=5;
		int numberofsweets=2;
		int seat=2;
		int count=0;
		int num = 1;
		for(int i=1;i<numberofsweets+seat;i++){
			
			
				count = count+1;

				if(i==(numofprisnor*num)+1){
					count = 1;
					num=num+1;
				}
			
		}
		System.out.println(count);
	}

}
