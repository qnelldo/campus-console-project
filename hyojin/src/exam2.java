
import java.util.Scanner;

public class exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean Continue = true;
        
		while (Continue) {
			
			try {
				System.out.print("���� �Է��ϼ��� : ");
				int dan = sc.nextInt();

				// 9�ܱ����� /for�� (1�ʱ�ȭ ��, 2���ǽ�, 4������){3���๮��} ������ ������
				for (int i = 1; i < 10; i++) {

					int result = dan * i;
					System.out.printf(dan + " * " + i + " = " + result);
					// println() ������ ���� �״�� ��� / printf() �����ڸ� ���� ������ ���� ��ȯ ����
					System.out.println();
				}

				//��� �� ���� ���� �ϱ�
				System.out.print("��� �Ͻðڽ��ϱ�? (y/n): ");
				String input = sc.next();
				//equalsIgnoreCase�� ��ҹ��� ���� ���ڿ��� ���� equals�� ��ҹ��ڱ��� ��
				if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("yes")) {
					Continue = false;
				}
			} catch (Exception e) {
				System.out.println("�߸��� �Է°��Դϴ�: " + e.getMessage());
				sc.nextLine();
			}
		}

		System.out.println("������ ��!");
	}
}
