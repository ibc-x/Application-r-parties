import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculateurImpl extends UnicastRemoteObject implements ICalculateur {
	public CalculateurImpl() throws RemoteException {
        super();
    }

	@Override
	public float addition(float a, float b) throws RemoteException {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public float soubstraction(float a, float b) throws RemoteException {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public float multiplication(float a, float b) throws RemoteException {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public float division(float a, float b) throws RemoteException {
		// TODO Auto-generated method stub
		 if (b == 0) {
	            throw new RemoteException("Division by zero");
	        }
	        return a / b;
	}

    
}

	


