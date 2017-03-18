package °¸Àý1;

import java.rmi.Naming;
import java.rmi.Remote;

public class RMIDemoClient {

	public static void main(String[] args)
	{
		IRMIDemo iRMIDemo=null;
		try {
			String target=null;
			if(args.length<1)
			{
				target="rmi://localhost:8000/RMIDemo";
			}
			else {
				target="rmi://"+args[0]+"localhost:8000/RMIDemo";
			}
			System.out.println("target:"+target);
			Remote objRemote=Naming.lookup(target);
			if(objRemote instanceof IRMIDemo)
				iRMIDemo=(IRMIDemo)objRemote;
			else {
				throw new Exception("Bad object returned form remote machine");
				
			}
		} catch (Exception e) {
			System.out.println("error in lookup()"+e.toString());
		}
		try {
			System.out.println("iRIDemo.count(5):"+iRMIDemo.count(5));
			
		} catch (Exception e) {
			System.out.println("Remote error"+e.toString());
		}
	}
}
