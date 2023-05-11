package abstraccion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Perro");
		perro p = new perro("Blacky","Dalmata","Negro-Blanco","Grande","Dogui");
		p.ImprimirDatos();
		p.impirimirInformacion();
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("Gato");
		gato g = new gato("Misufa","Persa","Blanco","Pequeño","Pulcrogato");
		g.ImprimirDatos();
		g.impirimirInformacion();
		
	}

}
