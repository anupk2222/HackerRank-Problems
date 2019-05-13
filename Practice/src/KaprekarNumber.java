
public class KaprekarNumber {


	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<100;i++){
			 //i=1;
			int square = i*i;
			//square = 2025;
			String number = String.valueOf(square);
			int[] addition = new int[number.length()];
			for(int j =0;j<number.length();j++){
				int size=number.length();
				int singleInt = Character.digit(number.charAt(j), 10);
				addition[j]=singleInt;

			}
			
			
				String add1 = "0";
				String add2 = "";
				int div=(number.length())/2;
				for(int y=0;y<div;y++){
					
					add1=add1+addition[y];
					if(add1.isEmpty()){
						add1="0";
					}
				}
				for(int y=div;y<number.length();y++){
					add2=add2+addition[y];
					if(add2.isEmpty()){
						add2="0";
					}
					
				}
				int ad1=Integer.valueOf(add1);
				int ad2 = Integer.valueOf(add2);
				if(ad1+ad2==i){
					//System.out.println("kaprekarNumber");
					System.out.println(i);
				}
				
			
			


		}


	}
}
