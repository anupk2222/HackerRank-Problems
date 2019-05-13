
public class FlatlanSpace {

	public static void main(String[] args) {


		int[] arr = {0,1,2,3,4};
		int[] resultArr = new int[arr.length];
		 int max=resultArr[0];

		for(int i=0;i<arr.length;i++){

			resultArr[i] = arr[i];

			int mid = arr[arr.length-1]/2;

			if(arr[i]>=mid){

				arr[i]=arr[arr.length-1]-arr[i];
				resultArr[i]=arr[i];
			}

		}
		for(int i=0;i<resultArr.length;i++){
			

			if(resultArr[i]>max){
				max=resultArr[i];
			}

		}
		System.out.println(max);


	}

}
