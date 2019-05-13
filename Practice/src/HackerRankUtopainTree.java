
public class HackerRankUtopainTree {
	static int height = 0;
	// Complete the utopianTree function below.
	public static void main(String[] args) {


		int n=4;

		for(int i =0;i<n+1;i++){
			if(i==0){
				height=1;
				System.out.println(i+" "+height);
			}
			else if(i!=0&&i%2!=0){
				height = height*2;
				System.out.println(i+" "+height);
			}
			else{
				height =height+1;
				System.out.println(i+" "+height);
			}
		}
		
		//System.out.println(height);

	} 


}
