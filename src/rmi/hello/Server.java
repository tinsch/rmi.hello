package rmi.hello;

import java.rmi.Naming;

public class Server {
	
	public Server() {
		try {
			Greeter g = new Greeter();
			Naming.rebind("rmi://localhost:1099/HelloWorld", g);
		} catch (Exception e) {
			System.out.println("Toot!");
		}
	}

	public static void main(String[] args) {
		new Server();
	}

}
