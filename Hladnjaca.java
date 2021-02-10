package nasledjivanjeOsnove;

public class Hladnjaca extends Kamion {
	private int brojKlima;
	private int stepenHladjenja;
	
	public Hladnjaca(String brojSasije, int brojTockova, String gorivo, int brojPrikolica, char kategorijaVozacke,
			int brojKlima, int stepenHladjenja) {
		super(brojSasije, brojTockova, gorivo, brojPrikolica, kategorijaVozacke);
		this.brojKlima = brojKlima;
		this.stepenHladjenja = stepenHladjenja;
	}

	public int getBrojKlima() {
		return brojKlima;
	}

	public void setBrojKlima(int brojKlima) {
		this.brojKlima = brojKlima;
	}

	public int getStepenHladjenja() {
		return stepenHladjenja;
	}

	public void setStepenHladjenja(int stepenHladjenja) {
		this.stepenHladjenja = stepenHladjenja;
	}
	
	public void stampajHladnjacu() {
		super.stampajKamion();
		System.out.println(" i broj klima je " + brojKlima + " i stepen hladjenja je " + stepenHladjenja);
	}
	
	
}
