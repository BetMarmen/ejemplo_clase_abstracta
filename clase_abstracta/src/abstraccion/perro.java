package abstraccion;

public class perro extends animal {

	private String marca_croqueta;
	

	public perro(String nombre, String raza, String color, String tamaño, String marca_croqueta) {
		super(nombre, raza, color, tamaño);
		this.marca_croqueta = marca_croqueta;
	}


	@Override
	public void impirimirInformacion() {
		// TODO Auto-generated method stub
		System.out.println("Soy un perro y la marca de mi comida favorita es: "+marca_croqueta);
	}

}
