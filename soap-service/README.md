## 

# Endpoint

    {{ baseURL }}/kalablo/etudiant-wsdl.wsdl

En utilisant avec la méthode GET, vous verez la schema XML,

# Lister les etudiants methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
        <soapenv:Header/>
        <soapenv:Body>
        <ilsii:EtudiantListRequest/>
        </soapenv:Body>
    </soapenv:Envelope>

# Etudiant par code, exemple de code : M10233, methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
        <soapenv:Header/>
        <soapenv:Body>
        <ilsii:EtudiantRequest>
            <ilsii:code>M10233</ilsii:code>
        </ilsii:EtudiantRequest>
        </soapenv:Body>
    </soapenv:Envelope>

# Inscription list par id, exemple de id : 1, methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
    <soapenv:Header/>
    <soapenv:Body>
    <ilsii:InscriptionRequest>
        <ilsii:id>1</ilsii:id>
    </ilsii:InscriptionRequest>
    </soapenv:Body>
</soapenv:Envelope>

# Inscription par id, exemple de id : 1, methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
    <soapenv:Header/>
    <soapenv:Body>
    <ilsii:InscriptionRequest>
        <ilsii:id>1</ilsii:id>
    </ilsii:InscriptionRequest>
    </soapenv:Body>
</soapenv:Envelope>

# Inscription list par idEtudiant, exemple de idEtudiant : 1, methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
        <soapenv:Header/>
        <soapenv:Body>
        <ilsii:InscriptionEtudiantRequest>
            <ilsii:idEtudiant>1</ilsii:idEtudiant>
        </ilsii:InscriptionEtudiantRequest>
        </soapenv:Body>
    </soapenv:Envelope>

# Inscription list exemple : methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
        <soapenv:Header/>
        <soapenv:Body>
        <ilsii:InscriptionListRequest/>
        </soapenv:Body>
    </soapenv:Envelope>

# Liste des matieres : methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ilsii="http://www.fst.com/xml/kalablo">
    <soapenv:Header/>
    <soapenv:Body>
    <ilsii:MatiereListRequest/>
    </soapenv:Body>
</soapenv:Envelope>




