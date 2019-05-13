
public class MarsExploration {

	public static void main(String[] args) {


		String s = "SOSOSOSOSDSDSKWOSDOSDOASDOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS";
		StringBuffer sb = new StringBuffer(s);

		for(int i=0;i<sb.length();i++){

			if(sb.length()>2){

				if(sb.subSequence(i, i+3).equals("SOS")){

					String str = (String) s.subSequence(i, i+3);
					sb.replace(i, i+3, "");
					i=-1;

				}
				else{
					break;
				}
			}
		}
		System.out.println(sb);
		int size= sb.length()/2;
		int size1=sb.length()/3;
		if(sb.length()%2==0){
			System.out.println(size);
		}
		else{
			System.out.println(size1);
		}


	}

}
