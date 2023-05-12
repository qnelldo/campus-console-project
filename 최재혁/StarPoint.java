import java.util.Scanner;

public class StarPoint {

	public static void main(String[] args) {
		System.out.println("만들고 싶은 삼각형의 높이를 숫자로 적어주세요.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			// 공백
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

			sc.close();
		}

	}

}
