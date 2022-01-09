package EjercicioPOO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visita {
	private Cliente nCliente;

	private Date nDate;

	private double totalcost;
	
	//Constructor
	public Visita(Cliente nCliente, Date nDate) {
		this.nCliente = nCliente;
		this.nDate = nDate;
		this.totalcost=0;
	}
	
	public Date getDate() {
		return this.nDate;
	}
	public Cliente getvisitCliente() {
		return this.nCliente;	
	}
	public void setCliente(Cliente nClient) {
		this.nCliente = nClient;
	}
	public void setTotalCost(double precio) {
		this.totalcost = this.nCliente.getDescuento(precio);
	}
	//metodos
	public String toString () {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(this.nCliente.toString());
		return "Date: " + sdf.format(this.nDate) + "\n Total cost: " + this.totalcost + "\n";
	}
	
	
}
