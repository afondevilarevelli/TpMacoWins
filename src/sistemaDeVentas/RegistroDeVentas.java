package sistemaDeVentas;

import java.util.Date;
import java.util.LinkedList;
import sistemaDeVentas.Venta;

public class RegistroDeVentas {
	private LinkedList<Venta> ventas;
	
	public RegistroDeVentas() {
		ventas = new LinkedList<>();
	}
	public void registrarVenta(Venta venta) {
		ventas.add(venta);
	}
	public int gananciaDe(Date unaFecha) {
		int suma = 0;
		for(Venta v:this.ventasDe(unaFecha)) {
			suma = suma + v.precio();
		}
		return suma;
	}
	public LinkedList<Venta> ventasDe(Date unaFecha) {
		LinkedList<Venta> lista = new LinkedList<>();
		for(Venta v:ventas) {
			if(v.esDe(unaFecha)) { lista.add(v); }
		}		
		return lista;
	}
}
