
public class Kolo implements FiguraGeomtryczna {

	private double promien;
	
	public Kolo(double promien) {
		this.promien = promien;
	}
	@Override
	public double podajObwod() {
		double obwod = 2*Math.PI*promien;
		return obwod;
	}

	@Override
	public double podajPole() {
		double pole = Math.PI*Math.pow(promien, 2);
		return pole;
	}
	public String toString() {
		return podajOpis();
	}

}
