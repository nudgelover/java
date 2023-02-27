package ifcontrole;

public class For {

	public static void main(String[] args) {

		myfor: for (int i = 2; i < 10; i++) {
			System.out.printf("%d 단 \n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
				if ((i * j) == 21) {
					break myfor;
				}
			}
			System.out.println("");
		}
	}
}