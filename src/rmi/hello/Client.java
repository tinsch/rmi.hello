package rmi.hello;

import java.rmi.Naming;

public class Client {
	public static void main(String[] args) {
		try {
			HelloWorld g = (HelloWorld) Naming.lookup("rmi://localhost:1099/HelloWorld"); //Proxy-Object
			System.out.println(g.sayHello("malwine"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
