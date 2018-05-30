
public class test_tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tab[][] = { { 0, 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 } };
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {
				sum = sum + tab[i][j];
			}
		}

		System.out.println("la somme est " + sum);

	}

}
