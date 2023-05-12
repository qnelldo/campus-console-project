
public class StarPoint {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			// 공백
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
