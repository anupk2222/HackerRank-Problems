
public class FairRations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,5,6,7};
		int count=0;
		int specialCount=0;

		for(int i=0;i<arr.length;i++){


			if(arr[i]%2!=0){
				if(i==arr.length-1){
					specialCount=0;
					break;
				}
				arr[i]=arr[i]+1;
				specialCount=specialCount+1;
				arr[i+1]=arr[i+1]+1;
				specialCount=specialCount+1;
				i=-1;
				count=0;
			}
			
			else{
				count=count+1;
				if(count==arr.length){
					break;
				}
			}
			


		}
		/*for(int i =0;i<arr.length;i++){
		System.out.println(arr[i]);
		}*/
		if(specialCount==0){
			System.out.println("NO");
		}
		else{
			System.out.println(specialCount);
		}

	}

}
