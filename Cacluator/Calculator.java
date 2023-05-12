package Cacluator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

			int num1 = 0;
			int num2 = 0;
			String op;
			int result;

			System.out.println("계산기입니다" + "\n");
			System.out.println("q를 입력하시면 계산기가 종료됩니다.");

			Scanner input = new Scanner(System.in);

			while (true) {
				try {
					System.out.print("첫번째 수를 입력하세요 : ");
					String inputString = input.nextLine(); // 일단 무조건 string으로 받음
					if (IsInputQ(inputString)) {
						break;
					}
					num1 = Integer.parseInt(inputString);

					System.out.println("연산자를 입력하세요 ( +, -, *, / )");
					System.out.print(">> ");
					op = input.next().trim();
					input.nextLine();
					if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
					} else {
						System.out.println("올바른 연산자를 입력해주세요." + "\n");
					}

					System.out.print("두번째 수를 입력해주세요 : ");
					inputString = input.next(); // 일단 무조건 string으로 받음
					input.nextLine();
					if (IsInputQ(inputString)) {
						break;
					}
					num2 = Integer.parseInt(inputString);

					// 연산 및 출력
					double divide; // 나누기는 double 변수로 결과 출력하기
					if (op.equals("+")) {
						result = num1 + num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + result + "\n");
					} else if (op.equals("-")) {
						result = num1 - num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + result + "\n");
					} else if (op.equals("*")) {
						result = num1 * num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + result + "\n");
					} else if (op.equals("/")) {
						divide = (double) num1 / num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + divide + "\n");
					}
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요" + "\n");

				}
			}
		}

	public static boolean IsInputQ(String input) {
		if (input.equals("q") || input.equals("Q")) {
			return true;
		}
		return false;
	}

}
