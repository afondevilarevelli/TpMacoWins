package sistemaDeVentas;
import sistemaDeVentas.Venta;

public abstract class ModoPago {
	public int recargo(Venta venta) {
		return 0;
	}
}

class PagoEfectivo extends ModoPago{}

class PagoTarjeta extends ModoPago{
	private int cantCuotas;
	private int coef;
	
	public PagoTarjeta(int unaCantidad,int unCoeficiente) {
		cantCuotas = unaCantidad;
		coef = unCoeficiente;
	}
	
	public int recargo(Venta venta) {
		return cantCuotas * coef * (int)0.01 * venta.precioPrendas();
	}
}
