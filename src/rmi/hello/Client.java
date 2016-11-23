package rmi.hello;

import java.rmi.Naming;

public class Client {
	public static void main(String[] args) {
		try {
			Greeter g = (Greeter) Naming.lookup("rmi://localhost:1099/HelloWorld");
			System.out.println(g.sayHello("malwine"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
