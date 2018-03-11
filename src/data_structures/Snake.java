package data_structures;

public class Snake {
	int viciousness;
	boolean venomous=false;
	Snake(int vic, boolean ven){
		viciousness = vic;
		venomous = ven;
	}
	public int getViciousness() {
		return viciousness;
	}
	public boolean isVenomous() {
		return venomous;
	}

	
}
