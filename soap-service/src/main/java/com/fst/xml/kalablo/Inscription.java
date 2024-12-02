//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.12.01 à 09:55:51 PM GMT 
//


package com.fst.xml.kalablo;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Inscription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Inscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idEtudiant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateInscription" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="niveau" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inscription", propOrder = {
    "id",
    "idEtudiant",
    "dateInscription",
    "niveau",
    "status"
})
public class Inscription {

    protected int id;
    protected int idEtudiant;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateInscription;
    @XmlElement(required = true)
    protected String niveau;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété idEtudiant.
     * 
     */
    public int getIdEtudiant() {
        return idEtudiant;
    }

    /**
     * Définit la valeur de la propriété idEtudiant.
     * 
     */
    public void setIdEtudiant(int value) {
        this.idEtudiant = value;
    }

    /**
     * Obtient la valeur de la propriété dateInscription.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInscription() {
        return dateInscription;
    }

    /**
     * Définit la valeur de la propriété dateInscription.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInscription(XMLGregorianCalendar value) {
        this.dateInscription = value;
    }

    /**
     * Obtient la valeur de la propriété niveau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Définit la valeur de la propriété niveau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiveau(String value) {
        this.niveau = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
