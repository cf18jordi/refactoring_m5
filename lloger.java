package refactoring;

import java.util.Vector;

public class Lloguer {
	private String data;
    private int dies;
    private Vector<Vehicle> vehicles;

    public Lloguer(String data, int dies) {
        this.data = data;
        this.dies = dies;
        this.vehicles = new Vector<Vehicle>();
    }
	public String getData()     { return data;     }
    public String getDies()     { return dies;     }

    public void setData(String data) { this.data = data; }
    public void setDies(int dies) { this.dies = dies; }
	
	public Vehicle getVehicle() { return vehicle; }
    
	public double quantitat() {
    	double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.GENERAL:
                quantitat += 4;
                if (this.getDies() > 2) {
                    quantitat += (this.getDies() - 2) * 2.5;
                }
            case Vehicle.BASIC:
                quantitat += 3;
                if (this.getDies() > 3) {
                    quantitat += (this.getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * 6;
                break;
        }
		return quantitat;
    }	
	public int bonificacions() {
		int bonificacions = 0;
	    bonificacions++;
    	if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
	            this.getDies()>1 ) {
	        bonificacions++;
	    }
    	return bonificacions;
}
