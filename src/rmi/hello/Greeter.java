package rmi.hello;

import java.rmi.RemoteException;

public class Greeter implements HelloWorld {

	@Override
	public String sayHello(String user) throws RemoteException {
		return "hello" + user;
	}

}
