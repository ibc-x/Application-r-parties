package com.fst.soap_service.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inscription", propOrder = {
    "idEtudiant",
    "dateInscription",
    "niveau",
    "status"
})
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {
    protected Integer id;
    @XmlElement(required = true)
    protected int idEtudiant;
    @XmlElement(required = true)
    protected String dateInscription;
    @XmlElement(required = true)
    protected String niveau;
    @XmlElement(required = true)
    protected String status;
}
