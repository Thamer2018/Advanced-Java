
public class test {

	public static void main(String[] args) {
	
			public static void sdsdsd(int n) {
				int a = 0;
				int b = 1;
				int s = 0;
				int c = 0;
				int i;
				s = s + a + b;
				System.out.print("The fibonacci series = " + a + "," + b + ",");
				for (i = 3; i <= n; i++) {
					c = a + b;
					System.out.print(c + ",");
					a = b;
					b = c;
					s = s + c;
				}
				System.out.println("upto " + n + " terms completed");
				System.out.println("\nThe sum of the fibonacci series upto " + n + " terms = " + s);
			}
		

	}

}
