package Programs;

public class Pattern123 {
	public static void main(String[] args) {
		int i;
		int j;
		int n = 1;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				System.out.println(n);
				n++;
			}
			System.out.println("\n");
		}
	}
}
