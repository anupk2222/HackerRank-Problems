
public class SherlokSquare {

	public static void main(String[] args) {
		
		int a=35;
		int b =70;
		int count=0;
		int c = (int) Math.sqrt(b);
		for(int i=0;i<=c;i++){
			int square = i*i;
			if(square>=a&&square<=b){
				count++;
			}
		}
		System.out.println(count);

	}

}
