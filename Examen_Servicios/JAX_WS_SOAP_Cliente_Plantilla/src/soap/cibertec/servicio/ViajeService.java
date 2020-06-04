package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.interfaces.ViajeBean;

public class ViajeService {
	
	private  ViajeServiceImplService ws=null;
	
	public List<ViajeBean> listaViaje(double precioDesde, double precioHasta){
		List<ViajeBean> lista=null;
		try {
			ws=new ViajeServiceImplService();
			Sericio soap=ws.getServicioViajePort();
			lista=soap.listAllViajesXprecio(precioDesde, precioHasta);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public int saveViaje(ViajeBean bean) {
		int salida= -1;
		try {
			ws=new ViajeServiceImplService();
			Sericio soap=ws.getServicioViajePort();
			salida=soap.saveViaje(bean);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}
}
