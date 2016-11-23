package rmi.hello;

import java.rmi.RemoteException;

public class Greeter extends java.rmi.server.UnicastRemoteObject implements HelloWorld {

	protected Greeter() throws java.rmi.RemoteException {
		super();
	}

	@Override
	public String sayHello(String user) throws java.rmi.RemoteException {
		return "hello" + user;
	}

}
