package poo;

public class Principal {
	
	public static void main(String[] args) {
		
		Coche Renault = new Coche();
		
		Renault.establece_color("rojo");
		
		System.out.println(Renault.dime_datos_geneales());
		
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos("si");
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador("si");
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		
		System.out.println("El precio total del coche es: " + Renault.precio_coche());
		
	}

}
