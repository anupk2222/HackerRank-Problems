
public class SeparateNumber {

	public static void main(String[] args) {

		String s = "99910001001";
		int count=0;
		for(int i=0;i<s.length();i++){

			String str = ""+s.charAt(i);
			Integer itr = Integer.valueOf(str);

			for(int j=0;j<s.length();j++){

				itr = itr+1;
				String sb = String.valueOf(itr);
				if(s.contains(sb)){
					count++;
				}
				else{
					break;
				}

			}
		}
	}

}
