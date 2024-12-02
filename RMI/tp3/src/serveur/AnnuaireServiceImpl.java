package serveur;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnnuaireServiceImpl extends UnicastRemoteObject implements AnnuaireService {
    private Map<String, Etudiant> etudiants;

    protected AnnuaireServiceImpl() throws RemoteException {
        super();
        etudiants = new HashMap<>();
    }

    @Override
    public synchronized void enregistrerEtudiant(Etudiant etudiant) throws RemoteException {
        if (etudiant.getmatricule() == null) {
            throw new IllegalArgumentException("Numéro matricule ne doit pas être nul.");
        }
    
        etudiants.put(etudiant.getmatricule(), etudiant);
        System.out.println("Étudiant enregistré : " + etudiant);
    }

    @Override
    public synchronized Etudiant rechercherEtudiant(String numeroMatricule) throws RemoteException {
        if (numeroMatricule == null) {
            throw new IllegalArgumentException("Le numéro matricule ne doit pas être nul.");
        }
        Etudiant etudiant = etudiants.get(numeroMatricule);
        if (etudiant == null) {
            System.out.println("Étudiant non trouvé pour le numéro matricule : " + numeroMatricule);
        }
        return etudiant;
    }

    @Override
    public ArrayList<Etudiant> listEtudiant() throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listEtudiant'");
    }
}
