package sistemaDeVentas;

import java.util.Date;
import java.util.LinkedList;

import sistemaDeVentas.ModoPago;
import sistemaDeVentas.Prenda;

public class Venta {
	private LinkedList<Prenda> prendas;
	private ModoPago modoPago;
	private Date fecha;
	
	public Venta(ModoPago unModoPago) {
		modoPago = unModoPago;
		fecha = new Date();
		prendas = new LinkedList<>();
	}
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
	}
	public boolean esDe(Date unaFecha) {
		return fecha.equals(unaFecha);
	}
	public int precioPrendas() {
		int suma=0;
		for(Prenda p:prendas) {
			suma = suma + p.precio();
		}
		return suma;
	}
	public int precio() {
		return this.precioPrendas() + modoPago.recargo(this);
	}
		
}
