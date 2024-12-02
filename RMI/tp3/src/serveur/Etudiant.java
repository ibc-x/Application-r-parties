package serveur;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String matricule;
    private String nom;
    private String prenom;
    private String specialite;
    private String classe;
    private String telephone;

    public Etudiant(String matricule, String nom, String prenom, String specialite, String classe, String telephone) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.classe = classe;
        this.telephone = telephone;
    }

    public String getmatricule() {
        return matricule;
    }

    public void setmatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String gettelephone() {
        return telephone;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", specialite='" + specialite + '\'' +
                ", classe='" + classe + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
