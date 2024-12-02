import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculateurServeurRMI {
	public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CalculateurImpl calculateur = new CalculateurImpl();
            Naming.rebind("CalculateurService", calculateur); 
            System.out.println("Le serveur calculateur est prêt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
