package cl.awakelab.negociom5.modelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepositorio extends CrudRepository<Venta, Integer> {
	
	public List<Venta> findAllByOrderById();
	
}
