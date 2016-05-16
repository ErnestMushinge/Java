
//File name Bicycle.java
//Written by Ernest Mushinge
//Written on 03/16/15

package com.vehicleswesell.vehicle;
import javax.swing.*;



//this class will inherit from Vehicle class. whereas the Sailboat class requires a data file for hold the length
//of the boat, they Bicycle class does not.Other differences lie in the content of the setPrice() and toString() methods
public class Bicycle extends Vehicle {
	
	public Bicycle()
	{
		super("a person", 2);//this is a constructor from Vehicle class
		
	}
	
	//Enter the following setPrice() method that forces a Bicycle's price to be no greater than $4,000
	
	public void setPrice()
	{
		String entry;
		final int MAX = 4000;
		entry = JOptionPane.showInputDialog(null, " Enter bicycle price ");
		price = Integer.parseInt(entry);
		//if statement 
		if(price > MAX)
			price = MAX; 
	}

	
	//ToString method will display the outcome to the screen as in one window.
	public String toString()
	{
		return("The bicycle is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice());
	}
}
