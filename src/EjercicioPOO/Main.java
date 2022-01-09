package EjercicioPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse("11/02/2001");
		Date d2 = sdf.parse("12/12/2012");
		
		Salon s = new Salon(10 , 20);
		Cliente c1 = new Cliente("Javier", "ergrteh5t6yjyg", "platino");
		Cliente c2 = new Cliente("Hernesto", "er23535yg");
		Cliente c3 = new Cliente("Borja", "Percha");
		
		s.añadirClientes(c1);
		s.añadirClientes(c2);
		s.añadirClientes(c3);
		s.setMembresiaClient(c2, "oro");
		s.setMembresiaClient(c3, "premium");
		Visita v1 = new Visita(c1, d);
		Visita v2 = new Visita(c2, d);
		Visita v3 = new Visita(c3, d);
		v1.setTotalCost(200);
		v2.setTotalCost(100);
		v3.setTotalCost(50);
		s.añadirVisita(v1);
		s.añadirVisita(v2);
		s.añadirVisita(v3);
		s.mostrarVisitas();
		//s.getVisitasCliente(c3)
		
	}

}
