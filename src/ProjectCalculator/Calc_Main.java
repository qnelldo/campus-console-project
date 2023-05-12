package ProjectCalculator;

public class Calc_Main {

	public static void main(String[] args) {

		Calc_Model cal_Model = new Calc_Model();
		Calc_View cal_View = new Calc_View();
		Calc_Controller cal_Controller = new Calc_Model(cal_Model, cal_View);
		
		Calc_Controller.run();
	}

}
