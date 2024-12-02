package client;


import java.rmi.Remote;
import java.rmi.RemoteException;
import serveur.Etudiant;

public interface AnnuaireService extends Remote {
    void enregistrerEtudiant(Etudiant etudiant) throws RemoteException;
    Etudiant rechercherEtudiant(String numeroMatricule) throws RemoteException;
}
