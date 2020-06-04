package soap.cibertec.servicio;

import java.util.List;

import javax.jws.WebService;

import soap.cibertec.dao.ViajeDAOImpl;
import soap.cibertec.entidad.Viaje;
import soap.cibertec.interfaces.ViajeDAO;

@WebService(name="servicioViaje", endpointInterface="soap.cibertec.interfaces.ViajeDAO")
public class ViajeServicelmpl implements ViajeDAO{
	private ViajeDAOImpl dao=new ViajeDAOImpl();
	
	@Override
	
	public int saveViaje(Viaje bean) {
		return dao.saveViaje(bean);
	}

	@Override
	public List<Viaje> listAllViaje(double pre) {
		// TODO Auto-generated method stub
		return dao.listAllViaje (pre);
	}
	
	
}
