package com.learning.designpatterns;

abstract class Travel{
	public boolean wantFood;
	public boolean confirmTravel;
	
	public abstract void chooseSrc();
	public abstract void chooseDest();
	public abstract void chooseSeat();
	public abstract void makePayment();
	public abstract void makeFood();
	public final void makeTravel(boolean confirmTravel) {
		chooseSrc();
		chooseDest();
		chooseSeat();
		makePayment();
		if(wantFood) {
			makeFood();
		}
			
	}
}

class Bus extends Travel{

	@Override
	public void chooseSrc() {
		// TODO Auto-generated method stub
		System.out.println("Bus Source chosen");
		
	}

	@Override
	public void chooseDest() {
		// TODO Auto-generated method stub
		System.out.println("Bus Destination chosen");
		
	}

	@Override
	public void chooseSeat() {
		// TODO Auto-generated method stub
		System.out.println("Bus Seat chosen");
		
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Bus make payment");
		
	}

	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println("Bus food ordered");
		
	}
	
}

class Train extends Travel{

	@Override
	public void chooseSrc() {
		// TODO Auto-generated method stub
		System.out.println("Train Source chosen");
		
	}

	@Override
	public void chooseDest() {
		// TODO Auto-generated method stub
		System.out.println("Train Destination chosen");
		
	}

	@Override
	public void chooseSeat() {
		// TODO Auto-generated method stub
		System.out.println("Train Seat chosen");
		
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Train make payment");
		
	}

	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println("Train food ordered");
		
	}
	
}



public class TravelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Travel bus = new Bus();
		Travel train = new Train();
		bus.makeTravel(true);
		train.makeTravel(true);
		

	}

}
