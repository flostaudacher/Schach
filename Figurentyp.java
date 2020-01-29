
public enum Figurentyp {
	P(1),B(20),R(4),K(21),King(2),Queen(22);
	private int moeglicheFelder;
	Figurentyp(int moeglicheFelder) {
		this.moeglicheFelder=moeglicheFelder;
		System.out.println(""+getFigur());
	}
	int getmoeglicheFelder() {
		return moeglicheFelder;
	}
	String getFigur() {
		if (getmoeglicheFelder()==1) {
			return "Bauer";
		}
		if (getmoeglicheFelder()==20) {
			return "Turm";
		}
		if (getmoeglicheFelder()==4) {
			return "Pferd";
		}
		if (getmoeglicheFelder()==21) {
			return "Läufer";
		}
		if (getmoeglicheFelder()==2) {
			return "König";
		}
		if (getmoeglicheFelder()==22) {
			return "Königin";
		}
		return "";
	}
}
