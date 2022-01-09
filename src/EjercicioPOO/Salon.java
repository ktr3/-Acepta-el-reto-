package EjercicioPOO;

import java.util.Date;

public class Salon {

	private Cliente[] clienteArray;
	private Visita[] visitArray;

	// Construcctores
	public Salon(int maxCliente, int maxVisitas) {
		this.clienteArray = new Cliente[maxCliente];
		this.visitArray = new Visita[maxVisitas];
	}

	public Salon() {
		this.clienteArray = new Cliente[10];
		this.visitArray = new Visita[10];
	}

	// getter y setter

	public Cliente[] getClient() {
		return this.clienteArray;
	}

	public Visita[] getVisita() {
		return visitArray;
	}

	// metodos
	public void añadirClientes(Cliente c) {
		boolean añadido = false;
		if (!fullclientes()) {
			int i = 0;
			while (i < this.clienteArray.length && !añadido) {
				if (this.clienteArray[i] == null) {
					this.clienteArray[i] = c;
					añadido = true;
				}
				i++;
			}

		}

	}
	private boolean fullclientes() {
		int i = 0;
		while (i < clienteArray.length) {
			if (clienteArray[1] == null) {
				return false;
			} i++;
		} return true;
	}
	
	public void bajaCliente(Cliente c) {
		Cliente c2 = new Cliente(c.getNombre(), c.getDNI());
		int i = 0;
		boolean añadidoCliente = false;
		boolean añadidoVisita = false;
		Visita actualVisita = null;
		while(i < this.clienteArray.length && !añadidoCliente) {
			this.clienteArray[i] = c2;
			añadidoCliente = true;
			i++;
		}
		while (i < this.visitArray.length && !añadidoVisita) {
			actualVisita = this.visitArray[i];
			if(actualVisita.getvisitCliente().getDNI().equals(c.getDNI())) {
				actualVisita.setCliente(c2);
				añadidoVisita = true;
			}
			i++;
		}
			
	}
	
	public Cliente setMembresiaClient(Cliente c, String miemb) {
		c.setMenbresia(miemb);
		c.setMiembro(true);
		return c;
	}
	
	public void añadirVisita(Visita v) {
		if (!fullVisitas() && !visitaEncontrada(v.getvisitCliente().getDNI(),v.getDate())) {
			boolean añadir = true;
			int i = 0;
			while (i < this.visitArray.length && !añadir) {
				if(this.visitArray[i] == null) {
					this.visitArray[i] = v;
					añadir = true;
				}
				i++;
			}
			
		}
	}
	
	private boolean visitaEncontrada(String DNI, Date d) {
		int i = 0;
		Visita actualVisita = null;
		while (i < this.visitArray.length) {
		actualVisita = this.visitArray[i];
		if(actualVisita != null) {
			if(actualVisita.getvisitCliente().getDNI().equals(DNI) && actualVisita.getDate().equals(d)) {
				return true;
			}
		}
		i++;
	}
		return false;
	}
	
	private boolean fullVisitas() {
		int i = 0;
		while (i < visitArray.length) {
			if(visitArray[i] == null) {
				return false;
			}
			i++;
		}return true;
	}

	public void getVisitasCliente(Cliente c) {
		int i = 0;
		Visita v;
		while (i<this.visitArray.length) {
			v = this.visitArray[i];
			if(v != null) {
				String Nombre = v.getvisitCliente().getNombre();
				String DNI = v.getvisitCliente().getDNI();
				
				if(Nombre.equalsIgnoreCase(c.getNombre()) && DNI.equalsIgnoreCase(c.getDNI())) {
					System.out.println(v.toString());
				}
			}
			i++;
		}
	}
	
	public void mostrarClientes() {
		for (int i =0; i<this.clienteArray.length; i++) {
			if(this.clienteArray[i] != null) {
				System.out.println(this.clienteArray[i].toString() + "\n");
			}
		}
	}
	
	public void mostrarVisitas() {
		for (int i = 0; i < this.visitArray.length; i++) {
			if(this.visitArray[i] != null) {
				System.out.println(this.visitArray[i].toString());
			}
		}
	}
}
