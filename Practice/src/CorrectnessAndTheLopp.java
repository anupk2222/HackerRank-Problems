
public class CorrectnessAndTheLopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7 ,4, 3, 5, 6, 2};
		int[] ar = new int[arr.length];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]<min){
				min=arr[i];
				
				
			}
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(ar[i]);
		}

	}

}
