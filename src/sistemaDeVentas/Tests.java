package sistemaDeVentas;

import java.util.Date;

public class Tests {

	public static void main(String[] args) {
		Prenda remera = new Prenda("remera",100);
		Prenda medias = new Prenda("medias",50);
		Prenda pantalon = new Prenda("pantalon",200);
		EstadoPrenda liquidacion = new EnLiquidacion();
		EstadoPrenda promocion = new EnPromocion(10);
		ModoPago efectivo = new PagoEfectivo();
		ModoPago masterCard = new PagoTarjeta(3,2);
		Venta altaVenta = new Venta(efectivo);
		Venta bajaVenta = new Venta(masterCard);
		RegistroDeVentas altoRegistro = new RegistroDeVentas();
		
		remera.cambiarEstado(liquidacion);
		medias.cambiarEstado(promocion);
		altaVenta.agregarPrenda(remera);
		altaVenta.agregarPrenda(medias);
		altaVenta.agregarPrenda(pantalon);
		bajaVenta.agregarPrenda(remera);
		altoRegistro.registrarVenta(altaVenta);
		altoRegistro.registrarVenta(bajaVenta);
		
		System.out.println("el precio de la remera es de "+remera.precio()+" pesos.");
		System.out.println("el precio del pantalon es de "+pantalon.precio()+" pesos.");
		System.out.println("el precio de las medias es de "+medias.precio()+" pesos.");
		System.out.println("");
		System.out.println("la alta venta tiene un precio de "+altaVenta.precio()+" pesos.");
		System.out.println("la bajaVenta tiene un precio de "+bajaVenta.precio()+" pesos.");
		System.out.println("");
		System.out.println("las ganancias de hoy son de "+altoRegistro.gananciaDe(new Date())+" pesos.");
	}
}