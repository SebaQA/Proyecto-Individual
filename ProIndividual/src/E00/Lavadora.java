package E00;

public class Lavadora extends Electrodomestico{
	
	
	private int carga=5;
	
	Lavadora(int preciobase, String color, char consumo, int peso, int carga){
		super(preciobase,color,consumo,peso);
		this.carga=carga;
		
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void setPrecioFinal(int preciobase) {
		super.setPrecioFinal(preciobase);
		if (carga>=30) {
			this.preciobase +=50;
			
		}
	}
	
	

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	
	@Override
	public void mostrarDatos(){
		System.out.println("jdss");
	}
	
}
