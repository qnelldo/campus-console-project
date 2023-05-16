import java.util.Scanner;

public class StarPoint1 {

	public static void main(String[] args) {
		System.out.println("* 홀수값 입력 정삼각형 *");
		System.out.println();
		System.out.println("만들고 싶은  홀수값 정삼각형의 밑변의 길이를 숫자로 적어주세요.");
		System.out.println("예시) 5");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			// 공백
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			// 별
			for (int k = n; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
		sc.close();

	}

}
