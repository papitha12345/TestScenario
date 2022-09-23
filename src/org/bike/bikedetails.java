package org.bike;

public class bikedetails implements ktmdetails{
	private void bikedetails()
	{
		System.out.println("eter the ktm details");
	}
public static void main(String[] args)
{
	bikedetails a=new bikedetails();
	a.bikedetails();
	a.bikespeed();
	a.bikecost();
	a.bikecost();
	}

public void bikespeed()
{
	System.out.println("bike speed is 112");
}

@Override
public void bikecost()
{
	System.out.println("bike cost is 2,00,000");
}

}
