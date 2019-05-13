
public class demo2 {

	static int n=0;
	public static void main(String[] args) {


		int i=20 ;
		int j=23;
		int k=6;
		double[] arr = new double[j-i+1];
		int count=0;
		for(int p=i;p<j+1;p++){

			int reverse = 0;
			int temp=p;
			while (temp != 0) {

				int reminder = temp % 10;
				reverse = reverse * 10 + reminder;
				temp = temp / 10;
			}
			int work = Math.abs((i-reverse)%k);
			if(work==0){
				count=count+1;
			}
			i++;
			/*arr[n]=work;
			n++;*/

		}
		/*int count=0;
		for(int y=0;y<arr.length;y++){
			String[] str = new String[arr.length];
			 str[y] =String.valueOf(arr[y]);
			String s = str[y].substring(str[y].indexOf(".")+1);

			String oio = "0";
			if (s.equals(oio)){
				count=count+1;
			}
		}*/


		System.out.println(count);
	}
}



