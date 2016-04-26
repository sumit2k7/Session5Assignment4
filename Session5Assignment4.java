
public class Session5Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		
		System.out.println("Interest Rate Of SBI :-> "+s.getRateofInterest());
		System.out.println("Interest Rate Of ICICI:-> "+i.getRateofInterest());
		System.out.println("Interest Rate Of AXIS :-> "+a.getRateofInterest());
		
	}
}

class SBI
{
	int getRateofInterest()
	{
		return 8;
	}
}

class ICICI
{
	int getRateofInterest()
	{
		return 7;
	}
}

class AXIS
{
	int getRateofInterest()
	{
		return 9;
	}
}
