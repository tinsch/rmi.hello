package rmi.hello;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	public Server() {
		try {
			Greeter g = new Greeter();
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello", g);
			Naming.rebind("rmi://localhost:1099/Hello", g);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new Server();
	}

}
