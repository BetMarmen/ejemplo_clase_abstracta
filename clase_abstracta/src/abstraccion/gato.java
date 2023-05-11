package abstraccion;

public class gato extends animal{
private String marca_arena;

public gato(String nombre, String raza, String color, String tamaño, String marca_arena) {
	super(nombre, raza, color, tamaño);
	this.marca_arena = marca_arena;
}

@Override
public void impirimirInformacion() {
	// TODO Auto-generated method stub
	System.out.println("Soy un gato y la marca de la arena que uso es: "+marca_arena);
}

}
