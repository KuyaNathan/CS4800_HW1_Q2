public class CruiseShip extends Ship{
	private int maxPassengers;

	public CruiseShip(String name, String year, int passengers){
		super(name, year);
		this.maxPassengers = passengers;
	}

	public int getMaxPassengers(){
		return maxPassengers;
	}

	public void setMaxPassengers(int passengers){
		maxPassengers = passengers;
	}

	public void print(){
		System.out.println("Ship Name: " + this.getShipName() 
		+ ", Maximum Allowed Passengers: " + this.getMaxPassengers());
	}
}
