//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.06 at 04:31:47 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infosEdition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infosEdition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lieuEdition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lieuImpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infosEdition", propOrder = {
    "editeur",
    "lieuEdition",
    "lieuImpression",
    "isbn"
})
public class InfosEdition {

    @XmlElement(required = true)
    protected String editeur;
    @XmlElement(required = true)
    protected String lieuEdition;
    @XmlElement(required = true)
    protected String lieuImpression;
    @XmlElement(name = "ISBN", required = true)
    protected String isbn;

    /**
     * Gets the value of the editeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * Sets the value of the editeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditeur(String value) {
        this.editeur = value;
    }

    /**
     * Gets the value of the lieuEdition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuEdition() {
        return lieuEdition;
    }

    /**
     * Sets the value of the lieuEdition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuEdition(String value) {
        this.lieuEdition = value;
    }

    /**
     * Gets the value of the lieuImpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuImpression() {
        return lieuImpression;
    }

    /**
     * Sets the value of the lieuImpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuImpression(String value) {
        this.lieuImpression = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

}
