package com.fst.soap_service.controller;

import com.fst.soap_service.repository.InscriptionRepository;
import com.fst.xml.kalablo.InscriptionEtudiantRequest;
import com.fst.xml.kalablo.InscriptionListResponse;
import com.fst.xml.kalablo.InscriptionRequest;
import com.fst.xml.kalablo.InscriptionResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InscriptionController {
    private static final String NAMESPACE_URI = "http://www.fst.com/xml/kalablo";

    private InscriptionRepository inscriptionRepository;
  
    public InscriptionController(InscriptionRepository inscriptionRepository) {
      this.inscriptionRepository = inscriptionRepository;
    }
  
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InscriptionRequest")
    @ResponsePayload
    public InscriptionResponse getInscription(@RequestPayload InscriptionRequest request) {
      InscriptionResponse response = new InscriptionResponse();
      response.setInscription(this.inscriptionRepository.findById(request.getId()));
      return response;
    }
  
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InscriptionListRequest")
    @ResponsePayload
    public InscriptionListResponse getInscriptions() {
        InscriptionListResponse response = new InscriptionListResponse();
        response.getInscription().addAll(this.inscriptionRepository.getAll());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InscriptionEtudiantRequest")
    @ResponsePayload
    public InscriptionListResponse getInscriptions(@RequestPayload InscriptionEtudiantRequest request) {
        InscriptionListResponse response = new InscriptionListResponse();
        response.getInscription().addAll(this.inscriptionRepository.getAllByEtudiant(request.getIdEtudiant()));
        return response;
    }
}
