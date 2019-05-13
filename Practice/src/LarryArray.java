import java.util.Arrays;

public class LarryArray {

	public static void main(String[] args) {

		int[] arr = {3,1,2};
		int[] route = new int[3];
		int count=0;
		main : for(int i=0;i<arr.length-1;i++){

			for(int j=i;j<route.length+i;j++){
				
				if(arr[i]+1==arr[i+1]){
					continue main;
				}
				else{
					route[count]=arr[j+1];
					count++;

				}

			}

			int k=0;
			int temp=0;
			//int temp2=0;
			while(k==0){
				temp=route[k];
				//route[k+2]=temp2;
				route[k]=route[k+1];
				route[k+1]=route[k+2];
				route[k+2]=temp;
				k=1;
			}
			int routecount=0;
			for(int l=i+1;l<=route.length;l++){
				arr[l]=route[routecount];
				routecount++;
			}

			i=-1;
			count=0;
			route=new int[3];
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}

	}

}
