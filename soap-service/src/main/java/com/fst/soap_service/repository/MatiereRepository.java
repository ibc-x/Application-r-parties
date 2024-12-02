package com.fst.soap_service.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.fst.xml.kalablo.Matiere;

import jakarta.annotation.PostConstruct;

@Component
public class MatiereRepository {
    private static final Map<String, Matiere> matieres = new HashMap<>();
    
  @PostConstruct
  public void initData() throws DatatypeConfigurationException {

    Matiere matiere = new Matiere();
    matiere.setCode("INF2101");
    matiere.setCoefficient(new BigDecimal(3));
    matiere.setNom("Système d'information");
    
    matieres.put("INF2101", matiere);
    
    matiere = new Matiere();
    matiere.setCode("INF2102");
    matiere.setCoefficient(new BigDecimal(2));
    matiere.setNom("POO");
    matieres.put("INF2102", matiere);

    matiere = new Matiere();
    matiere.setCode("INF2103");
    matiere.setCoefficient(new BigDecimal(3));
    matiere.setNom("Réseau informatique");
    matieres.put("INF2103", matiere);

    matiere = new Matiere();
    matiere.setCode("INF2201");
    matiere.setCoefficient(new BigDecimal(3));
    matiere.setNom("Génie logiciel");
    matieres.put("INF2201", matiere);
  }

  public Matiere findByCode(String code) {
    Assert.notNull(code, "Aucun matiere disponible");
    return matieres.get(code);
  }

  public List<Matiere> getAll() {
    return matieres.values().stream().toList();
  }
}
