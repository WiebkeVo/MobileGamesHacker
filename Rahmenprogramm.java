
public class Rahmenprogramm {
	private String bezeichnung;
	private String datum;
	private String zeit;
	private String ort;
	
	public Rahmenprogramm(String bezeichnung, String datum, String zeit, String ort) {
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getZeit() {
		return zeit;
	}

	public void setZeit(String zeit) {
		this.zeit = zeit;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String toString(){
		return "Rahmenprogramm: [Bezeichnung: " + bezeichnung + ", Datum: " + datum + ", Zeit: " + zeit + ", Ort: " + ort +"]";
	}
}
