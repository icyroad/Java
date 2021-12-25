package Chapter04;

import java.util.Random;

public class Bible4_6 {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			
			int dice1 = random.nextInt();
			int dice2 = random.nextInt();
			if (dice1 + dice2 ==6) {
				System.out.println(dice1 + "," + dice2);
				
			}
		}
		
		
		
	}
}
