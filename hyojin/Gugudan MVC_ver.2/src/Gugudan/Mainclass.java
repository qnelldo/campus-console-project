package Gugudan;

public class Mainclass {
	public static void main(String[] args) {
	
	GugudanModel model = new GugudanModel;
	View view = new View;
	Controller controller = new Controller(model view);
	
	Controller.run();

}
}
