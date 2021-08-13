
public interface FiguraGeomtryczna {
	public double podajObwod();
	public double podajPole();
	public default String podajOpis() {
		return getClass().getSimpleName()+" obwód: "+podajObwod()+" pole: "+podajPole();
	}
}

