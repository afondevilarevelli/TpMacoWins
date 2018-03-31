package sistemaDeVentas;
import sistemaDeVentas.Prenda;

public abstract class EstadoPrenda {
	public int descuento(Prenda prenda) {
		return 0;
	}
}

class Nuevo extends EstadoPrenda{}

class EnLiquidacion extends EstadoPrenda{
	public int descuento(Prenda prenda) {
		return prenda.precioPropio()/2;
	}
}

class EnPromocion extends EstadoPrenda{
	int valorFijoDesc;
	
	public EnPromocion(int valor) {
		valorFijoDesc = valor;
	}
	public int descuento(Prenda prenda) {
		return valorFijoDesc;
	}
}