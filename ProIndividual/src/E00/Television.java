package E00;

public class Television extends Electrodomestico{
	
	private int resolucion=20;
	private boolean sintonizador=false;
	
	Television(int preciobase, String color, char consumo, int peso, int resolucion, boolean sintonizador){
		super(preciobase,color,consumo,peso);
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
		
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	public void setPrecioFinal(int preciobase) {
		super.setPrecioFinal(preciobase);
		if (resolucion>=40) {
			this.preciobase *=0.30;
			if (sintonizador==true) {
				this.preciobase +=50;
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}
	
	@Override
	public void mostrarDatos(){
		System.out.println("jdss");
	}
	

}
