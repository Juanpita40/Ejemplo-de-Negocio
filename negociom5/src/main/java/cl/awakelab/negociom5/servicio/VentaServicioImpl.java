package cl.awakelab.negociom5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.negociom5.modelo.Venta;
import cl.awakelab.negociom5.modelo.VentaRepositorio;

@Service
public class VentaServicioImpl implements VentaServicio {

	@Autowired
	VentaRepositorio vr;
	
	@Override
	public List<Venta> obtenerVentas() {
		return (List<Venta>) vr.findAllByOrderById();
	}

	@Override
	public boolean crearVenta(Venta vt) {
		vr.save(vt);
		return true;
	}

	@Override
	public boolean editarVenta(Venta vt) {
		vr.save(vt);
		return true;
	}

	@Override
	public boolean eliminarVenta(Venta vt) {
		vr.delete(vt);
		return true;
	}

	@Override
	public Venta obtenerVentaPorId(int id) {
		return vr.findOne(id);
	}
	
}
