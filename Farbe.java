
public enum Farbe {
	White(0),Black(1);
	private int Farbzahl;
	Farbe(int Farbzahl) {
		this.Farbzahl=Farbzahl;
		System.out.println(""+getFarb());
	}
	String getFarb() {
		if(Farbzahl==0) {
			return"White";
		}
		else {
			return"Black";
		}
	}
}
