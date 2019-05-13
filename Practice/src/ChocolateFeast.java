import java.util.Scanner;

public interface ChocolateFeast {
	Scanner scan  = new Scanner(System.in);
	
	static int rupees = scan.nextInt();
	//static int n=15;
	public static void main(String[] args) {
		System.out.println("Please enter cost of single choclate");
		int costOfChoclate=scan.nextInt();
		System.out.println("Please enter count of wrapper to get 1 choclate");
		int wrapper = scan.nextInt();
		
		//int cost=3;
		//int wrapper =2;
		int wrap=0;
		int choclateCount = 0;

		for(int i=1;i<=rupees/costOfChoclate;i++){


			if(i*costOfChoclate<=rupees){
				choclateCount++;
				wrap++;
			}

			if(wrap>=wrapper){
				for(int j=0;j<wrap;j++){
					int cho=0;
					
						wrap=wrap-wrapper;
						choclateCount=choclateCount+1;
						//cho=choclateCount;
						//if(choclateCount>=2 &&choclateCount%2==0){
						wrap=wrap+1;
					
					//}
				}
			}


		}



		System.out.println("Number of Choclates you can buy in"+" "+rupees+" " +"rupess are :"+choclateCount);

	}

}
