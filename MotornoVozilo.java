package nasledjivanjeOsnove;

public class MotornoVozilo {
	private String brojSasije;
	private int brojTockova;
	private String gorivo;
	
	public MotornoVozilo(String brojSasije, int brojTockova, String gorivo) {
		//super();
		this.brojSasije = brojSasije;
		this.brojTockova = brojTockova;
		this.gorivo = gorivo;
	}

	public String getBrojVozilo() {
		return brojSasije;
	}

	public void setBrojVozilo(String brojVozilo) {
		this.brojSasije = brojVozilo;
	}

	public int getBrojTockova() {
		return brojTockova;
	}

	public void setBrojTockova(int brojTockova) {
		this.brojTockova = brojTockova;
	}

	public String getGorivo() {
		return gorivo;
	}

	public void setGorivo(String gorivo) {
		this.gorivo = gorivo;
	}
	
	public void stampajVozilo() {
		System.out.println("Broj sasije je " + brojSasije + " broj tockova je " + brojTockova + " a gorivo je " + gorivo);
	}
	
}
