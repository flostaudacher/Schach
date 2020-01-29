

public class Spielfigur  extends SpielfigureAbstract{
	public Spielfigur(Figurentyp Figuren, Farbe Farb) {
		super(Figuren,Farb);
	}
	public Farbe getValue() {
		return color;
	}
	public Farbe getColor() {
		return color;
	}
	public void setColor(Farbe color) {
		this.color = color;
	}
	public Figurentyp getName() {
		return this.name;
	}
	public void setName(Figurentyp name) {
		this.name = name;
	}
}
