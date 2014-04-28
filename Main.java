
public class Main {

	public static void main(String[] args) {
		TeilnehmerIn MaxKohl = new TeilnehmerIn("Max Kohl", "MaxK@gmx.de", "Student");
		Workshop Games = new Workshop(1212, "Games", "22.07.2013");
		Rahmenprogramm Musical = new Rahmenprogramm("Musical", "23.07.2013", "19:30", "Hamburg");
		ReferentIn NinaMeyer = new ReferentIn("Nina Meyer", "NinMe@gmail.com", "Hacker Co.KG");
		
		System.out.println(MaxKohl);
		System.out.println(Games);
		System.out.println(Musical);
		System.out.println(NinaMeyer);
	}

}

