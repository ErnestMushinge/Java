
package  com.vehicleswesell.vehicle;
import javax.swing.*;

public class Sailboat extends Vehicle {

	public int length;
	
	
	
	//The Sailboat constructor calls its parent's constructor and send two arguments to provide
	//values for powerSource and wheels values.It also calls a set length method that prompts the user for and sets the length.
	
	//[NB] I just noticed that a subclass has to have a constructor if it extends a parent class with a constructor
	
	public Sailboat()
	{
		//super means you are calling the main constructor from the inherited class
		super("Wind",0);
		setLength();
	}
	
	//Enter the following setLengh() and getLengh() methods, which respectively ask for and return the sailboat's length
	
	public void setLength()
	{
		String entry;
		entry = JOptionPane.showInputDialog(null, " Enter sailboat length in feet ");
		length = Integer.parseInt(entry);
		
	}
	
	//getLength method
	
	public int getLength()
	{
		return length;
	}
	
	//The concrete Sailboat class must contain a setPrice() method because the method is abstract in the parent class.
	//Assume that a Sailboat has a maximum price of $100,000. This method will prompt the user for the price and force it to
	//the maximum value if the entered value is too high.
	
	public void setPrice()
	{
		String entry;
		final int MAX = 100000;
		entry = JOptionPane.showInputDialog(null, " Enter sailboat price ");
		price = Integer.parseInt(entry);
		//if statement 
		if(price > MAX)
			price = MAX;
			
	}
	
	//Going back to chapter 7 when we used toString() method that converts any objects to string
	//Now we can override that method for this class by writing our own version. 
	
	public String toString()
	{
		return(" The " + getLength() + " foot sailboat is powered by " + getPowerSource() + "; it has " + 
	 getWheels() +  " wheel and costs $" + getPrice());
	}
	
}
