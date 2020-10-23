import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {
    public Server() {}

    public void printMsg() {
        System.out.println("this is an exampe rmi programm!");
    }
}
