
public class TaumBday {

	public static void main(String[] args) {

		int b=10; int w=10; int bc=1; int bw=1; int z=1; 
		int sumup=0;
		int sumdown=0;

		if(b>0&&w>0){
			sumup = (b*bc) + (w*bw);
			if(bc>bw+z){
				sumdown = (w*bw)+(b*(bw+z));
			}
			else if(bw>bc+z){
				sumdown = (b*bc)+(w*(bc+z));
			}
		}
		if(sumdown>0){
			if(sumup<sumdown){
				if(sumdown==0){
					System.out.println(sumup);
				}
			}
			else{
				System.out.println(sumdown);
			}
		}
		else{
			System.out.println(sumup);
		}
	}

}
