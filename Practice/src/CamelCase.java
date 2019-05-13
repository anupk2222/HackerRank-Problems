import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

	public static void main(String[] args) {


		String s="oneTwoThree";
		int count=1;
		for(int i=0;i<s.length();i++){

			String str = (String) s.subSequence(i, i+1);
			Pattern p = Pattern.compile("[A-Z]");
			Matcher m= p.matcher(str);

			boolean b = m.find();
			if (b == true){
				count=count+1;
			}
		}
		System.out.println(count);


	}

}
