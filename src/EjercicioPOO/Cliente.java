package EjercicioPOO;

public class Cliente {

	// Constructor
	private String Nombre;
	private String DNI;
	private boolean Miembro;
	private String Menbresia;

	public Cliente(String nombre, String DNI, String Menbresia) {
		super();
		this.Nombre = nombre;
		this.DNI = DNI;
		this.Miembro = true;
		this.Menbresia = Menbresia.toLowerCase();
	}
	public Cliente(String nombre, String DNI) {
		super();
		this.Nombre = nombre;
		this.DNI = DNI;
		this.Miembro = false;
		
	}

	// Getters y setters

	public double getDescuento(double cost) {
		double descuento;
		if (this.Menbresia.equals("platino")) {
			// 10%
			descuento = cost - (cost * 0.1);

		} else if (this.Menbresia.equals("oro")) {
			// 15%
			descuento = cost - (cost * 0.15);
		} else if (this.Menbresia.equals("premium")) {
			// 20%
			descuento = cost - (cost * 0.2);
		} else {
			descuento = cost;
		}
		return descuento;

	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public boolean isMiembro() {
		return Miembro;
	}

	public void setMiembro(boolean miembro) {
		this.Miembro = miembro;
	}

	public String getMenbresia() {
		return Menbresia;
	}

	public void setMenbresia(String menbresia) {
		this.Menbresia = menbresia;
	}

	public String toString() {
		if (this.Miembro) {
			return "Nombre: " + this.Nombre + "\nDNI: " + this.DNI + "\nMenbresia: " + this.Menbresia;
		} else {
			return "Nombre: " + this.Nombre + "\nDNI: " + this.DNI;
		}
	}

}
