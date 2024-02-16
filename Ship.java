public class Ship{
	private String shipName;
	private String yearBuilt;

	public Ship(String name, String year){
		this.shipName = name;
		this.yearBuilt = year;
	}

	public String getShipName(){
		return shipName;
	}

	public void setShipName(String name){
		shipName = name;
	}

	public String getYearBuilt(){
		return yearBuilt;
	}

	public void setYearBuilt(String year){
		yearBuilt = year;
	}

	public void print(){
		System.out.println("Ship name: " + this.getShipName() + ", Year Built: " + this.getYearBuilt());
	}
}