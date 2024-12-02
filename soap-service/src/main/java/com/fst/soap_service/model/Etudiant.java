
package com.fst.soap_service.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Etudiant", propOrder = {
    "id",
    "code",
    "prenom",
    "nom",
    "adresse"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    protected int id;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String prenom;
    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String adresse;

    //  @XmlElement(name = "inscription", namespace = "http://www.fst.com/xml/kalablo")
    // private Inscription inscription;

    // @XmlElement(name = "matiere", namespace = "http://www.fst.com/xml/kalablo")
    // private Matiere matiere;


}
