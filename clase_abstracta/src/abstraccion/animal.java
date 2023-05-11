package abstraccion;

public abstract class animal {
private String nombre,raza,color,tamaño;

public animal(String nombre, String raza, String color, String tamaño) {
	this.nombre = nombre;
	this.raza = raza;
	this.color = color;
	this.tamaño = tamaño;
}
public void ImprimirDatos() {
	System.out.println("El nombre es: "+nombre);
	System.out.println("La raza es: "+raza);
	System.out.println("El color es: "+color);
	System.out.println("El tamaño es: "+tamaño);
}
public abstract void impirimirInformacion();
}
