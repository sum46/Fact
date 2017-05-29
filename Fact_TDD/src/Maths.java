import junit.framework.Assert;

public class Maths {
	
	
	public int getFact(int num)
	{
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		
		if(num==0)
		{
			return 1;
		}
		
		if(num==1)
		{
			return 1;
		}
		
		
		return 1;
	}

}
