
public class HallownSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int p=20;
				int d=3;
				int m=6;
				int s=85;
				int arr = 0;
				int count=0;
				
				for(int i=0;i<s;i++){
					
					if((p+arr)<=s){
						arr=p+arr;
						count=count+1;
						}
					if(p>m){
					
					p=p-d;
					
					if(p<m){
						p=m;
					}
					
					}
					
					
					
				}
				System.out.println(count);

	}

}
