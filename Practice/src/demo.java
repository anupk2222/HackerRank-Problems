import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {

	public static void main(String[] args) {

		
		String s = "Sheet2!A4:AB299";
		String[] splitString = s.split(":");
		Matcher matcher = Pattern.compile("\\d+").matcher(splitString[1]);
		matcher.find();
		int i = Integer.valueOf(matcher.group());
		System.out.println(i);
	}
}
