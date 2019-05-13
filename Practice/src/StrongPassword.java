import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) {
		
		String s="aaZZa4@44";
		
		
		Pattern p = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
		Matcher m= p.matcher(s);
		boolean b = m.find();
		if (b == true){
			System.out.println("strong");
		}
		else{
			System.out.println("not strong");
		}

	}

}
