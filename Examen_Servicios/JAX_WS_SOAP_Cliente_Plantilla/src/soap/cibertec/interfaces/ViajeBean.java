package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viajeBean", propOrder = {
    "id",
    "conductor",
    "placa",
    "cantidad",
    "precio"  
})

public class ViajeBean {
	    protected int id;
	    protected String conductor;
	    protected String placa;
	    protected int cantidad;
	    protected double precio;
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getConductor() {
			return conductor;
		}
		public void setConductor(String conductor) {
			this.conductor = conductor;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
	    
	    
	    
}
