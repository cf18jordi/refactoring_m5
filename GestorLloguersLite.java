public static void main {

	Client clientNou = new Client("48224725G", "Jordi", 655444333, Client.NOU);
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
	
	Vehicle vehicle1 = new Vehicle("Leon", "Seat", Vehicle.BASIC);
	Date date = dateFormat.parse("2/8/2013");
	Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

	Vehicle vehicle2 = new Vehicle("Picasso", "Citroen", Vehicle.GENERAL);
	Date date = dateFormat.parse("24/2/2015");
	Lloguer lloguerStandard = new Lloguer(date, 5, vehicleGeneral);

	
	Vehicle vehicle3 = new Vehicle("Arteon", "Wolksvaggen", Vehicle.LUXE);
	Date date = dateFormat.parse("5/7/2013");
	Lloguer lloguerGran = new Lloguer(date, 4, vehicleLuxe);


}

