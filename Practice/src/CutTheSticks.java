
public class CutTheSticks {


	public static void main(String[] args) {

		int[] arr={5,4,4,2,2,8};
		
		int[] result = mainmethod(arr);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
	}
	 static int[] mainmethod(int arr[]){
		int[] array = new int[arr.length];
		int countNum = 0;
		for(int i=0;i<arr.length;i++){
			int smallNum = smallest(arr);
			if(smallNum==0){
				break;
			}
			countNum= array(arr,smallNum);
			for(int j=0;j<arr.length;j++){
			//System.out.print(arr[j]+ " ");
			
			}
			//System.out.println(countNum);
			
			array[i]=countNum;
		}
		
			
		
		return array;
	}

	public static int smallest(int arr[]){
		
		int smallest = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(smallest>0){
			if(arr[i]<smallest&&arr[i]>0){
				smallest = arr[i];
			}
			}
			else{
				int j=i;
				smallest = arr[j++];
			}
		}
		
		return smallest;
	}
	public static int array(int arr[], int smallNum){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=smallNum && arr[i]>0){
				arr[i]= arr[i]-smallNum;
				count=count+1;
			}
		}
		return count;
	}
}
