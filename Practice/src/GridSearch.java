import java.math.BigInteger;

public class GridSearch {

	public static void main(String[] args) {

		String[] G = {"7283455864","6731158619","8988242643","3830589324","2229505813","5633845374","6473530293","7053106601","0834282956","4607924137"};
		String[] P = {"9505","3845","3530","9324"};
		int count=0;
		int[] arr= new int[G.length];
		for(int i=0;i<P.length;i++){

			main:
				for(int j=0;j<G.length;j++){
				if(G[j].contains(P[i])){
					arr[j]=j;
					//count++;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			if(count==P.length){
				break;
			}
			else if(arr[i]!=0){
				if(count==P.length){
					break;
				}
				count++;
			}
			else{
				count=0;
			}
		}
		if(count==P.length){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
