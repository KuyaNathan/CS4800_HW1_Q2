public class ShipListDriver {
	public static void main(String[] args){
		Ship[] shipList = new Ship[3];

		Ship voyager = new Ship("Voyager", "2020");
		shipList[0] = voyager;

		CruiseShip carnival = new CruiseShip("Carnival", "2018", 3500);
		shipList[1] = carnival;

		CargoShip bigboy = new CargoShip("Big Boy", "2016", 110000);
		shipList[2] = bigboy;

		for (int i = 0; i < shipList.length; i++){
			shipList[i].print();
		}
	}
}
