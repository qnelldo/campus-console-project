package NewGugudan;

import java.util.Scanner;

class NewGugudanView {
	private Scanner scanner;

	public NewGugudanView() {
		scanner = new Scanner(System.in);
	}

	public int getDanInput() {
		System.out.print("���� �Է��ϼ��� (1~9 ����): ");
		return Integer.parseInt(scanner.nextLine());
	}

	public void displayMultiplicationTable(int dan) {
		System.out.printf("������ %d��:%n", dan);
	}

	public boolean getContinueInput() {
		System.out.print("��� �Ͻðڽ��ϱ�? (y/n): ");
		String input = scanner.next();
		return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
	}

	public void closeScanner() {
		scanner.close();
	}
}
