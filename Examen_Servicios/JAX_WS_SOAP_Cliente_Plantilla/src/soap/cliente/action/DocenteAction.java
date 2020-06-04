/*package soap.cliente.action;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import soap.cibertec.interfaces.DistritoBean;
import soap.cibertec.interfaces.DocenteBean;
import soap.cibertec.servicio.DocenteService;
@ParentPackage("dawi")
public class DocenteAction extends ActionSupport{
	private List<DistritoBean> listaDistritos;
	private List<DocenteBean> listaDocentes;
	private DocenteService servicio;
	private String JSONDocente;
	private int codigoDocente;
	private int dataMensaje;
	private DocenteBean docente;
	
	public DocenteAction(){
		servicio=new DocenteService();
	}
	
	@Action(value="/listAllDistritos",results= {@Result(name="ok",type="json")})	
	public String listAllDistritos() {
		listaDistritos=servicio.listaDistritos();
		return "ok";
	}
	@Action(value="/listAllDocentes",results= {@Result(name="ok",type="json")})	
	public String listAllDocentes() {
		listaDocentes=servicio.listaDocentes();
		return "ok";
	}
	@Action(value="/saveDocente",results= {@Result(name="ok",type="json")})	
	public String saveDocente() {
		Gson gson=new Gson();
		DocenteBean bean= (DocenteBean)gson.fromJson(JSONDocente, DocenteBean.class);
		//
		if(bean.getCodigo()==0) {
			int estado=servicio.saveDocente(bean);
			if(estado!=-1)
				dataMensaje=1;
			else
				dataMensaje=-1;
		}
		else {
			int estado=servicio.updateDocente(bean);
			if(estado!=-1)
				dataMensaje=1;
			else
				dataMensaje=-1;
		}
		return "ok";
	}
	@Action(value="/deleteDocente",results= {@Result(name="ok",type="json")})	
	public String deleteDocente() {
		int estado=servicio.deleteDocente(codigoDocente);
		if(estado!=-1)
			dataMensaje=1;
		else
			dataMensaje=-1;
		return "ok";
	}
	@Action(value="/findDocente",results= {@Result(name="ok",type="json")})	
	public String findDocente() {
		docente=servicio.findDocente(codigoDocente);
		return "ok";
	}
	
	public List<DistritoBean> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<DistritoBean> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}

	public List<DocenteBean> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<DocenteBean> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

	public String getJSONDocente() {
		return JSONDocente;
	}

	public void setJSONDocente(String jSONDocente) {
		JSONDocente = jSONDocente;
	}

	public int getCodigoDocente() {
		return codigoDocente;
	}

	public void setCodigoDocente(int codigoDocente) {
		this.codigoDocente = codigoDocente;
	}

	public int getDataMensaje() {
		return dataMensaje;
	}

	public void setDataMensaje(int dataMensaje) {
		this.dataMensaje = dataMensaje;
	}

	public DocenteBean getDocente() {
		return docente;
	}

	public void setDocente(DocenteBean docente) {
		this.docente = docente;
	}
	
	
	
}*/






