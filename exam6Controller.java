
public class exam6Controller {
    private exam6View view;

    public exam6Controller() {
        view = new exam6View();
    }

    public void generateMultiplicationTable() {
        boolean Continue = true;

        while (Continue) {
            try {
                int dan = view.promptUserForDan();
                exam6Model table = new exam6Model(dan);

                for (int i = 1; i < 10; i++) {
                    int result = table.getResult(i);
                    view.displayResult(dan, i, result);
                }

                Continue = view.promptUserToContinue();
            } catch (NumberFormatException e) {
                System.out.println("1~9사이 정수 값을 입력해 주세요.");
                view.scanner.nextLine();
            }
        }
    }
}