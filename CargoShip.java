public class CargoShip extends Ship{
	private int tonnageCapacity;

	public CargoShip(String name, String year, int tonnage){
		super(name, year);
		this.tonnageCapacity = tonnage;
	}

	public int getTonnage(){
		return tonnageCapacity;
	}

	public void setTonnage(int tonnage){
		tonnageCapacity = tonnage;
	}

	public void print(){
		System.out.println("Ship Name: " + this.getShipName() 
		+ ", Cargo Capacity: " + this.getTonnage() + " tons");
	}
}
