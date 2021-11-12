package cl.awakelab.negociom5.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venta {

	@Id
	private int id;
	private String fecha;
	private String vendedor;
	private int monto;
	
	public Venta() {
		super();
	}

	public Venta(int id, String fecha, String vendedor, int monto) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.vendedor = vendedor;
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", fecha=" + fecha + ", vendedor=" + vendedor + ", monto=" + monto + "]";
	}
	
}
