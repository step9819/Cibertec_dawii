package soap.cibertec.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import soap.cibertec.entidad.Viaje;

@WebService(name="servicio")
public interface ViajeDAO {
	@WebMethod
	public int saveViaje(@WebParam(name="viaje") Viaje bean);
	@WebMethod
	public List<Viaje> listAllViaje(@WebParam (name="precio") double pre);
}
