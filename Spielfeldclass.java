
public class Spielfeldclass{
	static int FELDGRÖSSE=8;
	static Spielfigur [][] Spielfeld= new Spielfigur[FELDGRÖSSE][FELDGRÖSSE];
	Spielfeldclass() {
		FELDGRÖSSE=8;
	}
	void insert() {
		for  (int i = 0;  i < FELDGRÖSSE; i++) {
			Spielfeld[1][i]=new Spielfigur(Figurentyp.P,Farbe.White);
		}
		for  (int i = 0;  i < FELDGRÖSSE; i++) {
			Spielfeld[6][i]=new Spielfigur(Figurentyp.P,Farbe.Black);
		}
		Spielfeld[0][0]=new Spielfigur(Figurentyp.R,Farbe.White);
		Spielfeld[0][1]=new Spielfigur(Figurentyp.K,Farbe.White);
		Spielfeld[0][2]=new Spielfigur(Figurentyp.B,Farbe.White);
		Spielfeld[0][3]=new Spielfigur(Figurentyp.D,Farbe.White);
		Spielfeld[0][4]=new Spielfigur(Figurentyp.C,Farbe.White);
		Spielfeld[0][5]=new Spielfigur(Figurentyp.B,Farbe.White);
		Spielfeld[0][6]=new Spielfigur(Figurentyp.K,Farbe.White);
		Spielfeld[0][7]=new Spielfigur(Figurentyp.R,Farbe.White);
		
		Spielfeld[7][0]=new Spielfigur(Figurentyp.R,Farbe.Black);
		Spielfeld[7][1]=new Spielfigur(Figurentyp.K,Farbe.Black);
		Spielfeld[7][2]=new Spielfigur(Figurentyp.B,Farbe.Black);
		Spielfeld[7][3]=new Spielfigur(Figurentyp.C,Farbe.Black);
		Spielfeld[7][4]=new Spielfigur(Figurentyp.D,Farbe.Black);
		Spielfeld[7][5]=new Spielfigur(Figurentyp.B,Farbe.Black);
		Spielfeld[7][6]=new Spielfigur(Figurentyp.K,Farbe.Black);
		Spielfeld[7][7]=new Spielfigur(Figurentyp.R,Farbe.Black);
		create();
	}
		void create() {
			System.out.println("==========================================================================================");
				for (int i = 0; i < Spielfeld.length; i++) {
					for (int j =0; j < Spielfeld.length; j++) {
						try {
							System.out.print("|| "+Spielfeld[i][j].name+" "+Spielfeld[i][j].color+" ");
						}
						catch (NullPointerException e) {
							System.out.print("||         ");	
						}
					}
					System.out.println("||");
					System.out.println("==========================================================================================");
				}
		}
}
	