import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculateur extends Remote{
	
	float addition(float a, float b) throws RemoteException;
    float soubstraction(float a, float b) throws RemoteException;
    float multiplication(float a, float b) throws RemoteException;
    float division(float a, float b) throws RemoteException;
    
}
