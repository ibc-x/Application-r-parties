package com.fst.soap_service.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.fst.soap_service.model.Etudiant;

@Component
public class EtudiantRepository {
  private static final Map<String, Etudiant> etudiants = new HashMap<>();

  @PostConstruct
  public void initData() {

    Etudiant etudiant = new Etudiant();
    etudiant.setCode("M10231");
    etudiant.setPrenom("Issa");
    etudiant.setNom("Coulibaly");
    etudiant.setId(1);
    etudiant.setAdresse("Bamako");
    etudiants.put(etudiant.getCode(), etudiant);

    etudiant = new Etudiant();
    etudiant.setCode("M10232");
    etudiant.setPrenom("Mariam");
    etudiant.setNom("Asco");
    etudiant.setId(2);
    etudiant.setAdresse("Sebenicoro");
    etudiants.put(etudiant.getCode(), etudiant);

    etudiant = new Etudiant();
    etudiant.setCode("M10233");
    etudiant.setPrenom("Oumar");
    etudiant.setNom("Mariko");
    etudiant.setId(3);
    etudiant.setAdresse("Djelibougou");
    etudiants.put(etudiant.getCode(), etudiant);

    etudiant = new Etudiant();
    etudiant.setCode("M10234");
    etudiant.setPrenom("Seydou");
    etudiant.setNom("Che");
    etudiant.setId(4);
    etudiant.setAdresse("Niamakoro");
    etudiants.put(etudiant.getCode(), etudiant);
  }

  public Etudiant findByCode(String code) {
    Assert.notNull(code, "Aucun etudiant disponible");
    return etudiants.get(code);
  }

  public List<Etudiant> getAll() {
    return etudiants.values().stream().toList();
  }
}
