
import java.util.Random;

public class A3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		final int REGION1SCORE = 7;
		final int REGION234SCORE = 5;
		final int REGION567SCORE = 3;
		final int REGION8910SCORE = 1;
		final int MAX = 1000;
		
		int [] regionCount = new int[9] , regionPoint = new int [9];
		int pointTotal=0;
		int region=0; 
		int totalHits=0;
		
		do {
			
			region = rand.nextInt(10)-1;
			
			switch (region) {
			case 0: 
				regionCount[region] += 1;
				regionPoint[region] += REGION1SCORE;
				pointTotal +=REGION1SCORE;
				break;
			case 1 : 
			case 2 : 	
			case 3 : 
				regionCount[region] += 1;
				regionPoint[region] += REGION234SCORE;
				pointTotal +=REGION234SCORE;
				break;
			case 4 : 
			case 5 : 	
			case 6 : 
				regionCount[region] += 1;
				regionPoint[region] += REGION567SCORE;
				pointTotal +=REGION567SCORE;
				break;
			case 7 : 
			case 8 : 	
			case 9 : 
				regionCount[region] += 1;
				regionPoint[region] += REGION8910SCORE;
				pointTotal +=REGION8910SCORE;
				break;
			}
			
			totalHits++;
			
		} while (pointTotal < MAX);
		
		System.out.println("|------------------>>>><<<<------------------|");
		System.out.println("|    Welcome to the Simplified Dart Game!    |");
		System.out.println("|------------------>>>><<<<------------------|");
		System.out.println("");
		
		System.out.println("Region\tHits\tPoints");
		System.out.println("---------------------------");
		
		for (int i=0; i<regionCount.length;i++){
			System.out.println((i+1) + "\t" + regionCount[i] + "\t" +  regionPoint[i] );
		}
		
		System.out.println("");
		System.out.println("It took " + totalHits + " tosses for a total of " + pointTotal);
		System.out.println("");
		System.out.println("That was an effortless game of darts!");
		
		
		

	}

}
