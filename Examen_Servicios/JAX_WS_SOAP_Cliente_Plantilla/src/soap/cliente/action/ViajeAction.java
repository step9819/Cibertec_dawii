package soap.cliente.action;

import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import soap.cibertec.interfaces.ViajeBean;
import soap.cibertec.servicio.ViajeService;

@ParentPackage("dawi")
public class ViajeAction extends ActionSupport {

	public List<ViajeBean> listaViajes;
	public ViajeBean viaje;
	private double precioDesde;
	private double precioHasta;
	
	private ViajeService servicio;
	
	public  ViajeAction() {
		servicio=new ViajeService();
	}
	
	@Action(value="/listAllViajesxPrecio", results= {@Result(name="ok", type="json")})
	public String listAllViajeString() {
		listaViajes=servicio.listaViaje(precioDesde, precioHasta);
		return "ok";
	}
	
	@Action(value="/saveViaje", results= {@Result(name="ok", type="viaje.jsp")})
	public String saveViaje() {
		servicio.saveViaje(viaje);
		return "ok";
	}
	
	public List<ViajeBean> getListaViajes(){
		return listaViajes;
	}
	
	public void setListaViaje(List<ViajeBean> listaViajes) {
		this.listaViajes = listaViajes;
	}
	
	public ViajeBean getViaje() {
		return viaje;
	}
	
	public void setViajes(ViajeBean viaje) {
		this.viaje = viaje;
	}

	public double getPrecioDesde() {
		return precioDesde;
	}

	public void setPrecioDesde(double precioDesde) {
		this.precioDesde = precioDesde;
	}

	public double getPrecioHasta() {
		return precioHasta;
	}

	public void setPrecioHasta(double precioHasta) {
		this.precioHasta = precioHasta;
	}
	
	
}
