import java.util.Scanner;

public class exam6View {
	private Scanner scanner;

	public exam6View() {
	        scanner = new Scanner(System.in);
	    }

	public int promptUserForDan() {
		System.out.print("���� �Է��ϼ���: ");
		return Integer.parseInt(scanner.nextLine());
	}

	public void displayResult(int dan, int multiplier, int result) {
		System.out.printf("%d * %d = %d%n", dan, multiplier, result);
	}

	public boolean promptUserToContinue() {
		System.out.print("��� �Ͻðڽ��ϱ�? (y/n): ");
		String input = scanner.next();
		return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
	}
}