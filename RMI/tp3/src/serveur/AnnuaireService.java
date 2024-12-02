package serveur;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface AnnuaireService extends Remote {
    void enregistrerEtudiant(Etudiant etudiant) throws RemoteException;
    Etudiant rechercherEtudiant(String numeroMatricule) throws RemoteException;
    ArrayList<Etudiant> listEtudiant() throws RemoteException;
}
