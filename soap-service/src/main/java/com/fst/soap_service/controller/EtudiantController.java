package com.fst.soap_service.controller;

import com.fst.soap_service.dto.EtudiantListResponse;
import com.fst.soap_service.dto.EtudiantRequest;
import com.fst.soap_service.dto.EtudiantResponse;
import com.fst.soap_service.model.Etudiant;
import com.fst.soap_service.repository.EtudiantRepository;

import java.util.Arrays;
import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EtudiantController
{
  private static final String NAMESPACE_URI = "http://www.fst.com/xml/kalablo";

  private EtudiantRepository etudiantRepository;

  public EtudiantController(EtudiantRepository etudiantRepository) {
    this.etudiantRepository = etudiantRepository;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EtudiantRequest")
  @ResponsePayload
  public EtudiantResponse getEtudiant(@RequestPayload EtudiantRequest request) {
    EtudiantResponse response = new EtudiantResponse();
    response.setEtudiant(this.etudiantRepository.findByCode(request.getCode()));
    return response;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EtudiantListRequest")
  @ResponsePayload
  public EtudiantListResponse getEtudiants() {
      EtudiantListResponse response = new EtudiantListResponse();
      response.setEtudiants(this.etudiantRepository.getAll());
      return response;
  }
}
