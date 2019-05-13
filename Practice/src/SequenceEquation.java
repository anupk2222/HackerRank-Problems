import java.util.Arrays;

public class SequenceEquation {

	public static void main(String[] args) {


		int[] p = {2,3,1};
		int[] pd = transfer(p);
		Arrays.sort(p);
		/*for(int i=0;i<p.length;i++){
			System.out.print(p[i]+" ");
		}*/
		System.out.println();

		for(int i=0;i<p.length;i++){

			int num = p[i];
			for(int j=0;j<p.length;j++){
				if(num==pd[j]){
					int sum=j+1;
					//System.out.println(sum);
					for(int k=0;k<p.length;k++){
						if(sum==pd[k]){
							int org=k+1;
							System.out.print(org+" ");
						}
					}
				}

			}

		}

	}
	static int[] transfer(int[] p){

		int[] pdd = new int[p.length];
		for(int i=0;i<p.length;i++){
			pdd[i]=p[i];

		}
		return pdd;

	}

}
