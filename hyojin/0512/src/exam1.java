
import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean Continue = true;

        while (Continue) {
            System.out.print("���� �Է��ϼ��� : ");
            int dan = sc.nextInt();

            // 999�ܱ�����
            for (int i = 1; i < 1000; i++) {
                
                    int result = dan*i;
                    System.out.printf(dan + " * " + i + " = " + result);
                
                System.out.println();
            }

            // Ask if the user wants to continue
            System.out.print("��� �Ͻðڽ��ϱ�? (y/n): ");
            String input = sc.next();

            if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("yes")) {
                Continue = false;
            }
        }

        System.out.println("������ ��!");
    }
}
