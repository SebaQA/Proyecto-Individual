package E00;
import java.util.ArrayList;


public class Tester {

	private static ArrayList<Lavadora>lavad=new ArrayList<Lavadora>();
	private static ArrayList<Television>Tele=new ArrayList<Television>();
	
	public static void addLavado(Lavadora lavadd) {
		lavad.add(lavadd);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Lavadora lav1= new Lavadora(130000, "negro", 'A', 25, 30);
		addLavadora(lav1);
		

	}

}
