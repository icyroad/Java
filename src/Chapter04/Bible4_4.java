package Chapter04;

public class Bible4_4 {
	public static void main(String[] args) {
		
		int total = 0;
		int minus = 1;
		int j = 0;
		for (int i = 1; i <= 300; i++,minus = -minus ) {
			j =i*minus;
			total +=j;
			
			if (total>=100) {
				break;
			}
		}
		System.out.println(j);
	}
}
