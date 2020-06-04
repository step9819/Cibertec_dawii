/*package soap.cibertec.servicio;
import java.util.List;
import soap.cibertec.interfaces.DistritoBean;
import soap.cibertec.interfaces.DocenteBean;
public class DocenteService {
	WsImplementadoService ws=null;
	
	public List<DistritoBean> listaDistritos(){
		List<DistritoBean> lista=null;
		try {
			ws=new WsImplementadoService();
			Sericio soap=ws.getServicioDocentePort();
			lista=soap.listAllDistritos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	public List<DocenteBean> listaDocentes(){
		List<DocenteBean> lista=null;
		try {
			ws=new WsImplementadoService();
			Sericio soap=ws.getServicioDocentePort();
			lista=soap.listAllDocentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	public int saveDocente(DocenteBean bean){
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Sericio soap=ws.getServicioDocentePort();
			estado=soap.saveDocente(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}
	public int updateDocente(DocenteBean bean){
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Sericio soap=ws.getServicioDocentePort();
			estado=soap.updateDocente(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}
	public int deleteDocente(int codigo){
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Sericio soap=ws.getServicioDocentePort();
			estado=soap.deleteDocente(codigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}
	public DocenteBean findDocente(int codigo){
		DocenteBean bean=null;
		try {
			ws=new WsImplementadoService();
			Sericio soap=ws.getServicioDocentePort();
			bean=soap.findDocente(codigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	

}*/






