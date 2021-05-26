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
}
