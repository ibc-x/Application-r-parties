## 

# Endpoint

    {{ baseURL }}/kalablo/etudiant-wsdl.wsdl

En utilisant avec la méthode GET, vous verez la schema XML

# Lister les etudiants methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://www.fst.com/xml/kalablo">
        <soapenv:Header/>
        <soapenv:Body>
        <sch:EtudiantListRequest/>
        </soapenv:Body>
    </soapenv:Envelope>

# Etudiant par code, exemple de code : M10233, methode [POST]
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://www.fst.com/xml/kalablo">
        <soapenv:Header/>
        <soapenv:Body>
        <sch:EtudiantRequest>
            <sch:code>M10233</sch:code>
        </sch:EtudiantRequest>
        </soapenv:Body>
    </soapenv:Envelope>


