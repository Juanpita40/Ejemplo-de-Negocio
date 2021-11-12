package cl.awakelab.negociom5.servicio;

import java.util.List;

import cl.awakelab.negociom5.modelo.Venta;

public interface VentaServicio {

	public List<Venta> obtenerVentas();
	public boolean crearVenta(Venta vt);
	public boolean editarVenta(Venta vt);	
	public boolean eliminarVenta(Venta vt);
	public Venta obtenerVentaPorId(int id);
	
}
