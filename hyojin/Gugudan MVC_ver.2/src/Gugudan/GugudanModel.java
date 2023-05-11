package Gugudan;

import java.util.Scanner;

public class GugudanModel {

	public int input_first;
	public int input_last;

	public int inputValue(int dan) throws Exception {

		Scanner in = new Scanner(System.in);
		System.out.print("�������� ���۴��� �Է��ϼ��� ");
		this.input_first = in.nextInt();
		System.out.print("�������� ���������� �Է��ϼ���  ");
		this.input_last = in.nextInt();

		// ���� �߻���Ű��, ������ 2~9 �̸� �� �ʰ��� �Ʒ� �޼��� ǥ�� �� ȣ��(�ٽ� �Է�)
		while ((input_first < 2 || input_first > 9) || (input_last < 2 || input_last > 9)) {
			throw new Exception();
		}

		dan = 1;
		return dan;

	}

	void outputResult() {
		// ù��° �Է°��� Ŭ ��� , ���� �ٿ������� ���� j--
		if (input_first > input_last) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input_first; j >= input_last; j--) {
					String result = Integer.toString(j * i);

					if (result.length() == 1) {
						System.out.print(j + " * " + i + " =  " + result + "   ");

					} else {
						System.out.print(j + " * " + i + " = " + result + "   ");
					}
				}
				System.out.println();

			}

			// �ι�° �Է°��� ū ���, ���� �÷����� ���� j++
		} else if (input_last > input_first) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input_first; j <= input_last; j++) {
					String result = Integer.toString(j * i);

					if (result.length() == 1) {
						System.out.print(j + " * " + i + " =  " + result + "   ");
					} else {
						System.out.print(j + " * " + i + " = " + result + "   ");
					}
				}
				System.out.println();

			}

			// �� �Է°��� ������ ���, �� ���� ���
		} else if (input_first == input_last) {
			for (int i = 1; i <= 9; i++) {
				String result = Integer.toString(input_first * i);
				if(result.length() == 1) {
					System.out.println(input_first + " * " + i + " =  " + result);
				} else {
					System.out.println(input_first + " * " + i + " = " + result);
				}
			}
		}
	}
}