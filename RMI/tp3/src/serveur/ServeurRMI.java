package serveur;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
            AnnuaireService service = new AnnuaireServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("AnnuaireService", service);
            System.out.println("Serveur demarer.");
        } catch (RemoteException e) {
            System.err.println("Erreur de configuration du serveur RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
