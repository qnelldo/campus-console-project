import java.util.Scanner;

public class StarPoint2 {

	public static void main(String[] args) {
		System.out.println("* 직사각형 *");
		System.out.println();
		System.out.println("만들고 싶은 사각형의 가로. 세로 길이를 순서대로 적어주세요.");
		System.out.println("예시) 4 5");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
