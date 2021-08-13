import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		FiguraGeomtryczna kolo = new Kolo(10);
		System.out.println(kolo);
		Wielokat prostokat = new Prostokat (5,10);
		System.out.println(prostokat);
		Prostokat kwadrat = new Kwadrat(10);
		System.out.println(kwadrat);
		
		List<FiguraGeomtryczna> figuryGeometryczne = new ArrayList<FiguraGeomtryczna>();
		figuryGeometryczne.add(kwadrat);
		figuryGeometryczne.add(kolo);
		figuryGeometryczne.add(prostokat);
		
		wypiszFiguryGeometryczne(figuryGeometryczne);
		wypiszProstokaty(figuryGeometryczne);
		wypisz(figuryGeometryczne, Prostokat.class);
	}
	private static void wypisz(List<FiguraGeomtryczna> figuryGeometryczne, Class klasa) {
		System.out.println(klasa.getSimpleName().toUpperCase());
		for (FiguraGeomtryczna fg: figuryGeometryczne) {
			if(klasa.isInstance(fg)) {
				System.out.println(fg);
			}
		}	
		System.out.println("--------------------------------------");
	}


	
	private static void wypiszProstokaty(List<FiguraGeomtryczna> figuryGeometryczne) {
		System.out.println("PROSTOKATY");
		for (FiguraGeomtryczna fg: figuryGeometryczne) {
			if(fg instanceof  Prostokat)
			System.out.println(fg);
		}
		System.out.println("--------------------------------------");
	}
		
	private static void wypiszFiguryGeometryczne(List<FiguraGeomtryczna> figuryGeometryczne) {
		System.out.println("FIGURY GEOMETRYCZNE");
		for (FiguraGeomtryczna fg: figuryGeometryczne) {
				System.out.println(fg);
			}
			System.out.println("--------------------------------------");	
	}

}
