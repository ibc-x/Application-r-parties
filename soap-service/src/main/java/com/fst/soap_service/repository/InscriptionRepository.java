package com.fst.soap_service.repository;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.fst.xml.kalablo.Inscription;

import jakarta.annotation.PostConstruct;

@Component
public class InscriptionRepository {
    private static final Map<Integer, Inscription> inscriptions = new HashMap<>();
    
  @PostConstruct
  public void initData() throws DatatypeConfigurationException {

    Inscription inscription = new Inscription();
    inscription.setId(1);
    inscription.setIdEtudiant(1);
    inscription.setDateInscription(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2023, 11, 2, 10, 30, 45)));
    inscription.setNiveau("Master");
    inscription.setStatus("Regulier");
    inscription.setAnnee(2023);
    inscriptions.put(1, inscription);
    
    inscription = new Inscription();
    inscription.setId(2);
    inscription.setIdEtudiant(2);
    inscription.setDateInscription(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2023, 12, 2, 10, 30, 45)));
    inscription.setNiveau("Master");
    inscription.setStatus("Boursier");
    inscription.setAnnee(2023);
    inscriptions.put(2, inscription);

    inscription = new Inscription();
    inscription.setId(3);
    inscription.setIdEtudiant(3);
    inscription.setDateInscription(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2023, 11, 2, 10, 2, 45)));
    inscription.setNiveau("Master");
    inscription.setStatus("Boursier");
    inscription.setAnnee(2023);
    inscriptions.put(3, inscription);

    inscription = new Inscription();
    inscription.setId(4);
    inscription.setIdEtudiant(4);
    inscription.setDateInscription(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2023, 11, 2, 10, 30, 45)));
    inscription.setNiveau("Master");
    inscription.setStatus("Boursier");
    inscription.setAnnee(2023);
    inscriptions.put(2, inscription);
  }

  public Inscription findById(Integer id) {
    Assert.notNull(id, "Aucun inscription disponible");
    return inscriptions.get(id);
  }

  public List<Inscription> getAll() {
    return inscriptions.values().stream().toList();
  }
  public List<Inscription> getAllByEtudiant(Integer idEtudiant) {
    return inscriptions.values().stream().filter((inscription) -> inscription.getIdEtudiant() == idEtudiant).toList();
  }
}
