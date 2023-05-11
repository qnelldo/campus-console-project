package Gugudan;

import java.util.Scanner;

public class Controller {

		private  GugudanModel model;
		private  GugudanModel view;
		
		private  Scanner sc = new Scanner(System.in);
		public int input;
		
		public Controller(GugudanModel model, View view) {}
		
		public void run() {
		
		for (int dan = 0; dan != 1;) {
			// try-catch 예외 처리
			try {
				dan = model.inputValue(dan);
				model.outputResult();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}