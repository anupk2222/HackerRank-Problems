
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BreakingRecord {

	public static void main(String[] args) {

		int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};

		
		List<Integer> scoresCount = new ArrayList<>();
		

		int highestCount = higestScore(scores);
		int lowestCount = lowestScore(scores);
		
		
		scoresCount.add(highestCount);
		scoresCount.add(lowestCount);
		
		Integer []intArr = new Integer[scoresCount.size()];
		
		intArr = scoresCount.toArray(intArr);
		
		
		
		
		
		

	}
	
	public static int lowestScore(int[] scores){
		List<Integer> lowestScore = new ArrayList<>();
		int Lcount=0;
		
		main :for(int i=0;i<scores.length-1;i++){

			insideMain :for(int j=i;j<scores.length;j++){
				
				if(scores[i]<=scores[j]){

				lowestScore.add(scores[i]);
				
				if(lowestScore.size()==scores.length){
					break main;
				}
				
				}
				else{
					Lcount=Lcount+1;
					i=j;
					lowestScore.add(scores[i]);
					
				}

			}

		}
		return Lcount;
		
	}
	
	public static int higestScore(int[] scores){
		List<Integer> higestScore = new ArrayList<>();
		int Hcount=0;
		
		main : for(int i=0;i<scores.length-1;i++){

			for(int j=i;j<scores.length;j++){
				
				if(scores[i]>=scores[j]){

				higestScore.add(scores[i]);
				
				if(higestScore.size()==scores.length){
					break main;
				}
				
				}
				else{
					Hcount=Hcount+1;
					i=j;
					higestScore.add(scores[i]);
					
				}

			}

		}
		return Hcount;
		
	}

}
