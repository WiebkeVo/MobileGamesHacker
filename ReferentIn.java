
public class ReferentIn {
	private String name;
	private String email;
	private String firma;
	
	public ReferentIn(String name, String email, String firma) {
		this.name = name;
		this.email = email;
		this.firma = firma;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String toString(){
		return "ReferentIn: [Name: " + name + ", E-mail: " + email+ ", Firma: " + firma +"]";
	}
}
