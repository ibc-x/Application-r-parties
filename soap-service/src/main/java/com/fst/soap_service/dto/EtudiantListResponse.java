package com.fst.soap_service.dto;

import java.util.List;

import com.fst.soap_service.model.Etudiant;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "etudiants"
})
@XmlRootElement(name = "EtudiantListResponse")
public class EtudiantListResponse {

    @XmlElement(name = "Etudiants", required = true)
    protected List<Etudiant> etudiants;

}