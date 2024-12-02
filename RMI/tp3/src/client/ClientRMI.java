package client;

import serveur.Etudiant;
import serveur.AnnuaireService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            AnnuaireService service = (AnnuaireService) registry.lookup("AnnuaireService");

            Scanner sc = new Scanner(System.in);
            boolean run = true;

            while (run) {
                System.out.println("Choisissez une opération: ");
                System.out.println("1. Nouvel étudiant");
                System.out.println("2. Rechercher etudiant");
                System.out.println("3. Quitter");
                int choix = sc.nextInt();
                sc.nextLine();  

                switch (choix) {
                    case 1:
                        System.out.println("Saisir numéro matricule: ");
                        String matricule = sc.nextLine();
                        
                        System.out.println("Saisir nom: ");
                        String nom = sc.nextLine();

                        System.out.println("Saisir prénom: ");
                        String prenom = sc.nextLine();

                        System.out.println("Saisir spécialité: ");
                        String specialite = sc.nextLine();

                        System.out.println("Saisir classe: ");
                        String classe = sc.nextLine();

                        System.out.println("Saisir numéro de téléphone: ");
                        String telephone = sc.nextLine();

                        Etudiant etudiant = new Etudiant(matricule, nom, prenom, specialite, classe, telephone);
                        service.enregistrerEtudiant(etudiant);
                        System.out.println("Étudiant enregistré: " + etudiant);
                        break;

                    case 2:
                        System.out.println("Saisir matricule: ");
                        String mat = sc.nextLine();

                        Etudiant etudiantRechercher = service.rechercherEtudiant(mat);
                        if (etudiantRechercher != null) {
                            System.out.println("Étudiant trouvé: " + etudiantRechercher);
                        } else {
                            System.out.println("Étudiant non trouvé.");
                        }
                        break;

                    case 3:
                        run = false;
                        System.out.println("Fin du programme !");
                        break;

                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de l'appel du service RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
