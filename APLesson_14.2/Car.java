import java.util.Arrays;
import java.util.ArrayList;
public abstract class Car implements Location
{
	private	double[] location;

	
	public Car()
	{
	
		location = new double[2];
	
	}
	
	public abstract void move(double one, double two);
	
	public abstract double[] getLoc();
	
	public int getID()
	{
		return (int)(Math.random()*1000000);
	}

}