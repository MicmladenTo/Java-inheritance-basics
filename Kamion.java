package nasledjivanjeOsnove;

public class Kamion extends MotornoVozilo{
	
	private int brojPrikolica;
	private char kategorijaVozacke;
	
	public Kamion(String brojSasije, int brojTockova, String gorivo, int brojPrikolica, char kategorijaVozacke) {
		super(brojSasije, brojTockova, gorivo);
		this.brojPrikolica = brojPrikolica;
		this.kategorijaVozacke = kategorijaVozacke;
	}

	public int getBrojPrikolica() {
		return brojPrikolica;
	}

	public void setBrojPrikolica(int brojPrikolica) {
		this.brojPrikolica = brojPrikolica;
	}

	public char getKategorijaVozacke() {
		return kategorijaVozacke;
	}

	public void setKategorijaVozacke(char kategorijaVozacke) {
		this.kategorijaVozacke = kategorijaVozacke;
	}
	
	public void stampajKamion() {
		super.stampajVozilo();
		System.out.println(" i broj prikolica je " + brojPrikolica + " a neophodna kategorija vozacke je " + kategorijaVozacke);
	}
	
}
