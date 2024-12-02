package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IEquationRemote extends Remote{

    @SuppressWarnings("rawtypes")
    public ArrayList solution(float a, float b, float c) throws RemoteException;
}
