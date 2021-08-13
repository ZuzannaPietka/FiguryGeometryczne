
public interface FiguraGeomtryczna {
	public double podajObwod();
	public double podajPole();
	public default String podajOpis() {
		return getClass().getSimpleName()+" obw�d: "+podajObwod()+" pole: "+podajPole();
	}
}

