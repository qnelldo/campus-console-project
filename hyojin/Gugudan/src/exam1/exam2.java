package exam1;

import java.util.Scanner;

public class exam2 {
	public static void main(String[]args) {
	
	System.out.println("�Ʒ��� ���� �����Ͻÿ�");
	Scanner sc = new Scanner(System.in);
	System.out.println(" ");
	int dan = sc.nextInt();
	
	for (int i = 1; i < 10; i++) {
		System.out.println(dan + " * " + i + " = " + (dan*i));
	}
	
}}