package Chapter04;

public class Bible4_5 {
	public static void main(String[] args) {
		int i = 1;
		String dot = "*";
		while (true) {
			System.out.print(dot);
			System.out.println();
			
			dot +="*";
			i +=1;
		
			if (i>=10) {
				break;
			}
		}
	}
}
