
public class Prostokat implements Wielokat {

	private double bokA;
	private double bokB;
	
	public Prostokat (double bokA, double bokB) {
		this.bokA = bokA;
		this.bokB = bokB;
	
	}
	@Override
	public double podajObwod() {
		double obwod = 2* (bokA+bokB);
		return obwod;
	}

	@Override
	public double podajPole() {
		double pole = bokA*bokB;
		return pole;
	}

	@Override
	public int podajLiczbeKatow() {
		return 4;
	}
		
	public String toString () {
		return podajOpis()+" liczba k¹tów: "+podajLiczbeKatow();
	
	}

}
