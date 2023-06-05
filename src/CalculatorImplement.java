import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImplement extends UnicastRemoteObject implements Calculator {
    public CalculatorImplement() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }
    public int divide(int a, int b) throws RemoteException {
        return a / b;
    }
}
