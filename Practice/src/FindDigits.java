
public class FindDigits {
	public static void main(String[] args) {

		int a = 12;
		String s = String.valueOf(a);
		int count=0;
		System.out.println(s);
		System.out.println("div:"+1012%1);
		for(int i=0;i<s.length();i++){

			CharSequence c = s.subSequence(i, i+1);
			int val = Integer.parseInt(((String) c).trim());
			try{
				int div = (a%val);
				if(div==0){

					count=count+1;
				}
			}
			catch (Exception e) {

			}

		}
		System.out.println(count);
	}

}
