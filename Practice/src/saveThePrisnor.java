
public class saveThePrisnor {



	public static void main(String[] args) {

		int numberOfPrisnor = 4;
		int n=1;
		int numberOfSweets = 6;
		int startsWith = 2;
		int count=startsWith-1;

		for(int i=startsWith;i<numberOfSweets+startsWith;i++){
			
			count=count+1;



			if(i==(numberOfPrisnor*n)){
				if(i==numberOfSweets+startsWith-1){
					break;
				}
				else{
					count=0;
					n=n+1;
				}

			}


		}
		System.out.println(count);
	}

}
