import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendDelete {


	public static void main(String[] args) {
		String original = "anupkumarsinha";
		//char[] chr = original.toCharArray();
		String given = "anupkumarsingh";
		//char[] giv = given.toCharArray();
		int num=4;
		int dubNum=0;


		StringBuffer sb = new StringBuffer(original);
		StringBuffer sbb = new StringBuffer(original);
		StringBuffer sb1 = new StringBuffer(given);

		for(int i=0;i<=sbb.length();i++){
			int temp;
			if(sbb.charAt(i)==sb1.charAt(i)){
				continue;
			}
			else{
				temp=i;

				for(int j =sbb.length();j>temp;j--){
					sbb.deleteCharAt(j-1);
					dubNum=dubNum+1;
					if(dubNum==0){
						break;
					}

				}
			}
			break;
		}
		
		for(int i=0;i<=sb.length();i++){
			int temp;
			if(sb.charAt(i)==sb1.charAt(i)){
				continue;
			}
			else{
				temp=i;
				for(int j =temp;j<sb1.length();j++){
					sbb.append(sb1.charAt(j));
					dubNum=dubNum+1;
					if(dubNum==0){
						break;
					}

				}
			}
			break;
		}
		if(num==dubNum){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}


	}
}
