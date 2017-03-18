package °¸Àý1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemo extends UnicastRemoteObject implements IRMIDemo {

	public RMIDemo(Registry reg) throws Exception,RemoteException{
		super();
		reg.bind("RMIDemo",this);
	}
	@Override
	public int count(int i) throws RemoteException {
		
		return i-1;
	}
	public static void main(String[] args)
	{
		Registry reg=null;
		try {
			reg=LocateRegistry.createRegistry(1000);
			RMIDemo e=new RMIDemo(reg);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
