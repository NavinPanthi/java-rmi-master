import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String args[]) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        Calculator stub = new CalculatorImplement();

        Naming.rebind("rmi://localhost:8099/calculator", stub);

        System.out.println("Server Started");
    }
}
