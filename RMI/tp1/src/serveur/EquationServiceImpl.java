package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class EquationServiceImpl extends UnicastRemoteObject implements IEquationRemote{

    protected EquationServiceImpl() throws RemoteException {
        super();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public ArrayList solution(float a, float b, float c) throws RemoteException {
        ArrayList<Float> resulat = new ArrayList<>();
      
        float discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            float solution1 = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
            float solution2 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
            resulat.add(solution1);
            resulat.add(solution2);
        } else if (discriminant == 0) {
            float solution = -b / (2 * a);
            resulat.add(solution);
        }else{
            ArrayList<String> au = new ArrayList<>();
            au.add("Pas de solution");
            return au;
        }
       return resulat;
    }

  

}
