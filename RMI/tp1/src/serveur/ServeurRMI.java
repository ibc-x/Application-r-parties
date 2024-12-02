package serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
            
            LocateRegistry.createRegistry(1099);
            EquationServiceImpl eqs = new EquationServiceImpl();
            System.out.println(eqs.toString());
            Naming.rebind("rmi://localhost:1099/EQS", eqs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
