package soap.cibertec.servicio;

import javax.xml.ws.Endpoint;


public class WsRegistroWebService {

	public static void main(String[] args) {
		//1 Se instancia el web service
		ViajeServicelmpl WS=new ViajeServicelmpl();
		//2 Ruta del ws
		String URL="http://localhost:8071/servicioViaje?wsdl";
		//3 Se registra
		Endpoint ept=Endpoint.publish(URL, WS);
		//4 Se verifica la publicación
		System.out.println(ept.isPublished());

	}

}

