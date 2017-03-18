package 案例1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRMIDemo extends Remote {
	public int count(int i) throws RemoteException;//声明接口的方法

}
