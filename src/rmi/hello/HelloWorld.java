package rmi.hello;

public interface HelloWorld extends java.rmi.Remote {
	
	String sayHello(String user) throws java.rmi.RemoteException;

}
