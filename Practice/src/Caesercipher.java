
public class Caesercipher {

	public static void main(String[] args) {

		String s = "-Azk nMQ ls";
		int n=3;

		StringBuffer sb = new StringBuffer(s);

		for(int i=0;i<s.length();i++){


			CharSequence c =sb.subSequence(i, i+1);
			Integer itr = Integer.valueOf(sb.charAt(i));
			if((itr>=65&&itr<=90) || (itr>=97&&itr<=122)){
				int org=itr+n;
				int orgnic=0;
				int sum=0;
				if(itr>=65&&itr<=90){
					if(org>90){
					 orgnic= org-90;
					 sum = 64+orgnic;
					 char ch=(char)sum;
						System.out.print(ch);
					}
					else{
						orgnic= itr+n;
						char ch=(char)orgnic;
						System.out.print(ch);
					}
					
				}
				else if(itr>=97&&itr<=122){
					if(org>122){
						 orgnic= org-122;
						 sum = 96+orgnic;
						 char ch=(char)sum;
							System.out.print(ch);
						}
						else{
							orgnic= itr+n;
							char ch=(char)orgnic;
							System.out.print(ch);
						}
				}
				else{
					char ch=(char)org;
					System.out.print(ch);
				}
			}
			else{
				System.out.print(c);
			}

		}


	}

}
