
public class Workshop {
	private int nummer;
	private String bezeichnung;
	private String datum;
	
	public Workshop(int nummer, String bezeichnung, String datum) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
	}
	
	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
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

	public String toString(){
		return "Workshop: [Nummer: " + nummer + ", Bezeichnung: " + bezeichnung + ", Datum: " + datum +"]";
	}
}
