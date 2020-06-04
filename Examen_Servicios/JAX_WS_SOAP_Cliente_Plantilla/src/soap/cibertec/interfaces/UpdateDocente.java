
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateDocente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docente" type="{http://interfaces.cibertec.soap/}docenteBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDocente", propOrder = {
    "docente"
})
public class UpdateDocente {

    protected DocenteBean docente;

    /**
     * Obtiene el valor de la propiedad docente.
     * 
     * @return
     *     possible object is
     *     {@link DocenteBean }
     *     
     */
    public DocenteBean getDocente() {
        return docente;
    }

    /**
     * Define el valor de la propiedad docente.
     * 
     * @param value
     *     allowed object is
     *     {@link DocenteBean }
     *     
     */
    public void setDocente(DocenteBean value) {
        this.docente = value;
    }

}
