package homework_6;

public class Igrobali {
	public static void main(String[] args) {
		
	int[] score = {120,85,200,95,150,60,175,110};
		
		
		
		int best = score[0];
		int worst = score[0];
		
		for(int i = 0; i < score.length;i++) {
		System.out.println(score[i]);
		best = Math.max(best,score[i]);
		worst = Math.min(worst,score[i]);
	}
		int diference = best - worst;
		
		if(diference > 100) {
			System.out.println("very big diference");
		}
		
		
	}
}
