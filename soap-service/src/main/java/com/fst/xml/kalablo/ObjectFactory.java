//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.12.01 à 07:30:46 AM GMT 
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

}
