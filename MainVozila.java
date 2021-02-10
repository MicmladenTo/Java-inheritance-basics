package nasledjivanjeOsnove;

public class MainVozila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotornoVozilo vozilo1 = new MotornoVozilo("12345", 4, "benzin");
		//vozilo1.stampajVozilo();
		Kamion kamion1 = new Kamion("1234", 6, "dizel", 2, 'c');
		//kamion1.stampajKamion();
		Hladnjaca h1 = new Hladnjaca("12345", 8, "dizel", 1, 'e', 4, -20);
		h1.stampajHladnjacu();

	}

}
