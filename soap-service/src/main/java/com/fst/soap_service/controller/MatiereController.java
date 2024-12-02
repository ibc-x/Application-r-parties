package com.fst.soap_service.controller;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fst.soap_service.repository.MatiereRepository;
import com.fst.xml.kalablo.MatiereListResponse;
import com.fst.xml.kalablo.MatiereRequest;
// import com.fst.xml.kalablo.MatiereListResponse;
// import com.fst.xml.kalablo.MatiereRequest;
// import com.fst.xml.kalablo.MatiereResponse;
import com.fst.xml.kalablo.MatiereResponse;

@Endpoint
public class MatiereController {
    private static final String NAMESPACE_URI = "http://www.fst.com/xml/kalablo";

    private MatiereRepository MatiereRepository;
  
    public MatiereController(MatiereRepository MatiereRepository) {
      this.MatiereRepository = MatiereRepository;
    }
  
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MatiereRequest")
    @ResponsePayload
    public MatiereResponse getMatiere(@RequestPayload MatiereRequest request) {
      MatiereResponse response = new MatiereResponse();
      response.setMatiere(this.MatiereRepository.findByCode(request.getCode()));
      return response;
    }
  
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MatiereListRequest")
    @ResponsePayload
    public MatiereListResponse getMatieres() {
        MatiereListResponse response = new MatiereListResponse();
        response.getMatieres().addAll(this.MatiereRepository.getAll());
        return response;
    }
}
