
import java.util.Scanner;

public class exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean Continue = true;
        
		while (Continue) {
			
			try {
				System.out.print("단을 입력하세요 : ");
				int dan = sc.nextInt();

				// 9단까지만 /for문 (1초기화 식, 2조건식, 4증감식){3실행문장} 순으로 동작함
				for (int i = 1; i < 10; i++) {

					int result = dan * i;
					System.out.printf(dan + " * " + i + " = " + result);
					// println() 변수의 값을 그대로 출력 / printf() 지시자를 통해 변수의 값을 변환 가능
					System.out.println();
				}

				//계속 할 건지 질문 하기
				System.out.print("계속 하시겠습니까? (y/n): ");
				String input = sc.next();
				//equalsIgnoreCase은 대소문자 없이 문자열만 구분 equals는 대소문자까지 비교
				if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("yes")) {
					Continue = false;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력값입니다: " + e.getMessage());
				sc.nextLine();
			}
		}

		System.out.println("구구단 끝!");
	}
}
