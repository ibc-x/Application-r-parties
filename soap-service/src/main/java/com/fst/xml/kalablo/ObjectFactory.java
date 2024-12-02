//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.12.02 à 10:17:23 AM GMT 
//


package com.fst.xml.kalablo;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fst.xml.kalablo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EtudiantListRequest_QNAME = new QName("http://www.fst.com/xml/kalablo", "EtudiantListRequest");
    private final static QName _InscriptionListRequest_QNAME = new QName("http://www.fst.com/xml/kalablo", "InscriptionListRequest");
    private final static QName _MatiereListRequest_QNAME = new QName("http://www.fst.com/xml/kalablo", "MatiereListRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fst.xml.kalablo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EtudiantRequest }
     * 
     */
    public EtudiantRequest createEtudiantRequest() {
        return new EtudiantRequest();
    }

    /**
     * Create an instance of {@link EtudiantResponse }
     * 
     */
    public EtudiantResponse createEtudiantResponse() {
        return new EtudiantResponse();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link EtudiantListResponse }
     * 
     */
    public EtudiantListResponse createEtudiantListResponse() {
        return new EtudiantListResponse();
    }

    /**
     * Create an instance of {@link InscriptionRequest }
     * 
     */
    public InscriptionRequest createInscriptionRequest() {
        return new InscriptionRequest();
    }

    /**
     * Create an instance of {@link InscriptionEtudiantRequest }
     * 
     */
    public InscriptionEtudiantRequest createInscriptionEtudiantRequest() {
        return new InscriptionEtudiantRequest();
    }

    /**
     * Create an instance of {@link InscriptionResponse }
     * 
     */
    public InscriptionResponse createInscriptionResponse() {
        return new InscriptionResponse();
    }

    /**
     * Create an instance of {@link Inscription }
     * 
     */
    public Inscription createInscription() {
        return new Inscription();
    }

    /**
     * Create an instance of {@link InscriptionListResponse }
     * 
     */
    public InscriptionListResponse createInscriptionListResponse() {
        return new InscriptionListResponse();
    }

    /**
     * Create an instance of {@link InscriptionEtudiantListResponse }
     * 
     */
    public InscriptionEtudiantListResponse createInscriptionEtudiantListResponse() {
        return new InscriptionEtudiantListResponse();
    }

    /**
     * Create an instance of {@link MatiereRequest }
     * 
     */
    public MatiereRequest createMatiereRequest() {
        return new MatiereRequest();
    }

    /**
     * Create an instance of {@link MatiereResponse }
     * 
     */
    public MatiereResponse createMatiereResponse() {
        return new MatiereResponse();
    }

    /**
     * Create an instance of {@link Matiere }
     * 
     */
    public Matiere createMatiere() {
        return new Matiere();
    }

    /**
     * Create an instance of {@link MatiereListResponse }
     * 
     */
    public MatiereListResponse createMatiereListResponse() {
        return new MatiereListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fst.com/xml/kalablo", name = "EtudiantListRequest")
    public JAXBElement<Object> createEtudiantListRequest(Object value) {
        return new JAXBElement<Object>(_EtudiantListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fst.com/xml/kalablo", name = "InscriptionListRequest")
    public JAXBElement<Object> createInscriptionListRequest(Object value) {
        return new JAXBElement<Object>(_InscriptionListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fst.com/xml/kalablo", name = "MatiereListRequest")
    public JAXBElement<Object> createMatiereListRequest(Object value) {
        return new JAXBElement<Object>(_MatiereListRequest_QNAME, Object.class, null, value);
    }

}
