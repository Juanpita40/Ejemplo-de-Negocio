package cl.awakelab.negociom5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.negociom5.modelo.Venta;
import cl.awakelab.negociom5.servicio.VentaServicio;

@Controller
public class VentaControlador {

	@Autowired
	VentaServicio vs;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String verventas(Model model) {
		List<Venta> listaventas = vs.obtenerVentas();
		model.addAttribute("lventas", listaventas);
		return "listadoventas";
	}
	
	@RequestMapping(value="/crear", method=RequestMethod.GET)
	public String crearventa(Model model) {
		return "crearventa";
	}

	@RequestMapping(value="/procesarcrear", method=RequestMethod.POST)
	public String procesarcrearventa(Model model, 
			@RequestParam ("txtidventa") int idventa,
			@RequestParam ("txtfecha") String fecha,
			@RequestParam ("txtvendedor") String vendedor,
			@RequestParam ("txtmonto") int monto) {
		Venta vt = new Venta(idventa, fecha, vendedor, monto);
		vs.crearVenta(vt);
		return "rescrearventa";
	}

	@RequestMapping(value="/eliminarventa/{id}", method=RequestMethod.GET)
	public String elimventa(Model model, @PathVariable ("id") int id) {
		Venta vt = vs.obtenerVentaPorId(id);
		vs.eliminarVenta(vt);
		return "reseliminarventa";
	}

	@RequestMapping(value="/editarventa/{id}", method=RequestMethod.GET)
	public String editventa(Model model, @PathVariable ("id") int id) {
		Venta vt = vs.obtenerVentaPorId(id);
		model.addAttribute("myvnt", vt);
		return "editarventa";
	}

	@RequestMapping(value="/procesareditar", method=RequestMethod.POST)
	public String procesareditarventa(Model model, 
			@RequestParam ("txtidventa") int idventa,
			@RequestParam ("txtfecha") String fecha,
			@RequestParam ("txtvendedor") String vendedor,
			@RequestParam ("txtmonto") int monto) {
		Venta vt = new Venta(idventa, fecha, vendedor, monto);
		vs.editarVenta(vt);
		return "reseditarventa";
	}

}
