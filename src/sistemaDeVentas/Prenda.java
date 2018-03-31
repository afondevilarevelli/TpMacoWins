package sistemaDeVentas;
import sistemaDeVentas.EstadoPrenda;

public class Prenda {

	private String tipo;
	private EstadoPrenda estado;
	private int precioPropio;

	public Prenda(String unTipo,int unPrecio) {
		tipo = unTipo;
		precioPropio = unPrecio;
		estado = new Nuevo();
	}
	public String tipo() {
		return tipo;
	}
	public int precioPropio() {
		return precioPropio;
	}
	public int precio() {
		return precioPropio - estado.descuento(this);
	}
	public void cambiarEstado(EstadoPrenda unEstado) {
		this.estado = unEstado;
	}
	
}
