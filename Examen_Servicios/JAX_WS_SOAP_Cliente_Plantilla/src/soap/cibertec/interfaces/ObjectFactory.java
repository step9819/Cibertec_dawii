
package soap.cibertec.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.cibertec.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindDocente_QNAME = new QName("http://interfaces.cibertec.soap/", "findDocente");
    private final static QName _ListAllDocentesXSexo_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllDocentesXSexo");
    private final static QName _UpdateDocenteResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "updateDocenteResponse");
    private final static QName _SaveDocenteResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "saveDocenteResponse");
    private final static QName _ListAllDocentes_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllDocentes");
    private final static QName _DeleteDocente_QNAME = new QName("http://interfaces.cibertec.soap/", "deleteDocente");
    private final static QName _ListAllDocentesXSexoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllDocentesXSexoResponse");
    private final static QName _ListAllDistritos_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllDistritos");
    private final static QName _ListAllDocentesResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllDocentesResponse");
    private final static QName _FindDocenteResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "findDocenteResponse");
    private final static QName _UpdateDocente_QNAME = new QName("http://interfaces.cibertec.soap/", "updateDocente");
    private final static QName _ListAllDistritosResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllDistritosResponse");
    private final static QName _SaveDocente_QNAME = new QName("http://interfaces.cibertec.soap/", "saveDocente");
    private final static QName _DeleteDocenteResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "deleteDocenteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.cibertec.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteDocente }
     * 
     */
    public DeleteDocente createDeleteDocente() {
        return new DeleteDocente();
    }

    /**
     * Create an instance of {@link ListAllDocentesXSexoResponse }
     * 
     */
    public ListAllDocentesXSexoResponse createListAllDocentesXSexoResponse() {
        return new ListAllDocentesXSexoResponse();
    }

    /**
     * Create an instance of {@link ListAllDocentes }
     * 
     */
    public ListAllDocentes createListAllDocentes() {
        return new ListAllDocentes();
    }

    /**
     * Create an instance of {@link ListAllDistritos }
     * 
     */
    public ListAllDistritos createListAllDistritos() {
        return new ListAllDistritos();
    }

    /**
     * Create an instance of {@link ListAllDocentesResponse }
     * 
     */
    public ListAllDocentesResponse createListAllDocentesResponse() {
        return new ListAllDocentesResponse();
    }

    /**
     * Create an instance of {@link FindDocente }
     * 
     */
    public FindDocente createFindDocente() {
        return new FindDocente();
    }

    /**
     * Create an instance of {@link ListAllDocentesXSexo }
     * 
     */
    public ListAllDocentesXSexo createListAllDocentesXSexo() {
        return new ListAllDocentesXSexo();
    }

    /**
     * Create an instance of {@link UpdateDocenteResponse }
     * 
     */
    public UpdateDocenteResponse createUpdateDocenteResponse() {
        return new UpdateDocenteResponse();
    }

    /**
     * Create an instance of {@link SaveDocenteResponse }
     * 
     */
    public SaveDocenteResponse createSaveDocenteResponse() {
        return new SaveDocenteResponse();
    }

    /**
     * Create an instance of {@link SaveDocente }
     * 
     */
    public SaveDocente createSaveDocente() {
        return new SaveDocente();
    }

    /**
     * Create an instance of {@link DeleteDocenteResponse }
     * 
     */
    public DeleteDocenteResponse createDeleteDocenteResponse() {
        return new DeleteDocenteResponse();
    }

    /**
     * Create an instance of {@link FindDocenteResponse }
     * 
     */
    public FindDocenteResponse createFindDocenteResponse() {
        return new FindDocenteResponse();
    }

    /**
     * Create an instance of {@link UpdateDocente }
     * 
     */
    public UpdateDocente createUpdateDocente() {
        return new UpdateDocente();
    }

    /**
     * Create an instance of {@link ListAllDistritosResponse }
     * 
     */
    public ListAllDistritosResponse createListAllDistritosResponse() {
        return new ListAllDistritosResponse();
    }

    /**
     * Create an instance of {@link DocenteBean }
     * 
     */
    public DocenteBean createDocenteBean() {
        return new DocenteBean();
    }

    /**
     * Create an instance of {@link DistritoBean }
     * 
     */
    public DistritoBean createDistritoBean() {
        return new DistritoBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "findDocente")
    public JAXBElement<FindDocente> createFindDocente(FindDocente value) {
        return new JAXBElement<FindDocente>(_FindDocente_QNAME, FindDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllDocentesXSexo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllDocentesXSexo")
    public JAXBElement<ListAllDocentesXSexo> createListAllDocentesXSexo(ListAllDocentesXSexo value) {
        return new JAXBElement<ListAllDocentesXSexo>(_ListAllDocentesXSexo_QNAME, ListAllDocentesXSexo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "updateDocenteResponse")
    public JAXBElement<UpdateDocenteResponse> createUpdateDocenteResponse(UpdateDocenteResponse value) {
        return new JAXBElement<UpdateDocenteResponse>(_UpdateDocenteResponse_QNAME, UpdateDocenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDocenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "saveDocenteResponse")
    public JAXBElement<SaveDocenteResponse> createSaveDocenteResponse(SaveDocenteResponse value) {
        return new JAXBElement<SaveDocenteResponse>(_SaveDocenteResponse_QNAME, SaveDocenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllDocentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllDocentes")
    public JAXBElement<ListAllDocentes> createListAllDocentes(ListAllDocentes value) {
        return new JAXBElement<ListAllDocentes>(_ListAllDocentes_QNAME, ListAllDocentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "deleteDocente")
    public JAXBElement<DeleteDocente> createDeleteDocente(DeleteDocente value) {
        return new JAXBElement<DeleteDocente>(_DeleteDocente_QNAME, DeleteDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllDocentesXSexoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllDocentesXSexoResponse")
    public JAXBElement<ListAllDocentesXSexoResponse> createListAllDocentesXSexoResponse(ListAllDocentesXSexoResponse value) {
        return new JAXBElement<ListAllDocentesXSexoResponse>(_ListAllDocentesXSexoResponse_QNAME, ListAllDocentesXSexoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllDistritos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllDistritos")
    public JAXBElement<ListAllDistritos> createListAllDistritos(ListAllDistritos value) {
        return new JAXBElement<ListAllDistritos>(_ListAllDistritos_QNAME, ListAllDistritos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllDocentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllDocentesResponse")
    public JAXBElement<ListAllDocentesResponse> createListAllDocentesResponse(ListAllDocentesResponse value) {
        return new JAXBElement<ListAllDocentesResponse>(_ListAllDocentesResponse_QNAME, ListAllDocentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDocenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "findDocenteResponse")
    public JAXBElement<FindDocenteResponse> createFindDocenteResponse(FindDocenteResponse value) {
        return new JAXBElement<FindDocenteResponse>(_FindDocenteResponse_QNAME, FindDocenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "updateDocente")
    public JAXBElement<UpdateDocente> createUpdateDocente(UpdateDocente value) {
        return new JAXBElement<UpdateDocente>(_UpdateDocente_QNAME, UpdateDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllDistritosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllDistritosResponse")
    public JAXBElement<ListAllDistritosResponse> createListAllDistritosResponse(ListAllDistritosResponse value) {
        return new JAXBElement<ListAllDistritosResponse>(_ListAllDistritosResponse_QNAME, ListAllDistritosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "saveDocente")
    public JAXBElement<SaveDocente> createSaveDocente(SaveDocente value) {
        return new JAXBElement<SaveDocente>(_SaveDocente_QNAME, SaveDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "deleteDocenteResponse")
    public JAXBElement<DeleteDocenteResponse> createDeleteDocenteResponse(DeleteDocenteResponse value) {
        return new JAXBElement<DeleteDocenteResponse>(_DeleteDocenteResponse_QNAME, DeleteDocenteResponse.class, null, value);
    }

}
