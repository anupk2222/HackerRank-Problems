
public class ViralAd {
	
	static int shared=5;
	static int liked=0;
	static int com=0;
	
	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=0;i<n;i++){
			
			liked=(shared/2);
			com=com+liked;
			shared = liked*3;
		}
		System.out.println(com);
	}

}
