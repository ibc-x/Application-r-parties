//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.12.02 à 10:17:23 AM GMT 
//


package com.fst.xml.kalablo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inscription" type="{http://www.fst.com/xml/kalablo}Inscription"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inscription"
})
@XmlRootElement(name = "InscriptionResponse")
public class InscriptionResponse {

    @XmlElement(name = "Inscription", required = true)
    protected Inscription inscription;

    /**
     * Obtient la valeur de la propriété inscription.
     * 
     * @return
     *     possible object is
     *     {@link Inscription }
     *     
     */
    public Inscription getInscription() {
        return inscription;
    }

    /**
     * Définit la valeur de la propriété inscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Inscription }
     *     
     */
    public void setInscription(Inscription value) {
        this.inscription = value;
    }

}
