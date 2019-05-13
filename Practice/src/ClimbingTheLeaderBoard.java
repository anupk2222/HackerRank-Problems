import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClimbingTheLeaderBoard {

	static int[] scores = {100,90,90,80,75,60};
	static int[] alice = {50,65,77,90,102};
	static int scoresSize = scores.length;
	static int aliceSize = alice.length;
	static int[] last = new int[aliceSize];
	static int g=0;
	

	public static void main(String[] args) {

		int[] newScores = new int[scores.length + 1];

		//copy values into new array
		for(int i=0;i < scores.length;i++)
			newScores[i] = scores[i];
		scores = newScores;


		int Temp;

		for (int k = 0; k < scores.length; k++) {
			if(k==aliceSize){
				break;
			}
			scores[scoresSize] = alice[k];
			for (int i = 0; i < scores.length; i++)
			{
				for (int j = i + 1; j < scores.length; j++)
				{
					if(scores[i] < scores[j])
					{
						Temp = scores[i];
						scores[i] = scores[j];
						scores[j] = Temp;
					}		
				}
			}
			
			method(scores,alice[k],alice);
			
			
			for(int i=0; i<scores.length; i++)
		       {
		           if(scores[i] == alice[k])
		           {
		               for(int j=i; j<(scores.length-1); j++)
		               {
		                   scores[j] = scores[j+1];
		               }
		               //count++;
		               break;
		           }
		       }
			
			/*int removeIndex = k;
			for(int i1 = removeIndex; i1 < scores.length-1; i1++){
				scores[i1] = scores[i1 + 1];
			}*/

		}
		
		
		for(int i=0;i<aliceSize;i++){
			System.out.println(last[i]);
		}
		


	}

	static void method(int[] scores, int aliceNumber,int[] alice){

		//int[] rank = new int[scoresSize];

		int rankCount=1;
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		int[] newScores = new int[scores.length + 1];
		for(int i=0;i < scores.length;i++)
			newScores[i] = scores[i];
		scores = newScores;
		int currentInt = scores[0];
		map.put(scores[0],rankCount);
		// rank[0]=1;// this is to store current element in loop, default is first 
		//int sameNumCount = 0; // this is to store count of same number found consecutely
		
		for (int i = 1; i < scores.length; i++) {

			if (currentInt != scores[i]) {
				currentInt = scores[i];
				// increment count if same number count is greater than 0
				rankCount=rankCount+1;
				map.put(scores[i],rankCount);
				
				// rank[i]=rankCount;

			} else {
				//rankCount=rankCount;
				// rank[i]=rankCount;
				map.put(scores[i],rankCount);
			}

		}
		/*for(int i =0;i< scores.length;i++){
            System.out.println(map);
            
            //if(alice[i])
        }*/
		//int[] fival = new int[aliceSize];
		int fival;
		
		
		
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
			
			
			
			if(entry.getKey()==aliceNumber&&g<aliceSize){
				fival=entry.getValue();
				last[g]=fival;
				g++;
				break;
			}
		
             
	   
		
	
		
	}
	
	

}
