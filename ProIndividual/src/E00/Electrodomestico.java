package E00;

public abstract class Electrodomestico implements Listas {
	
	protected int preciobase=100000;
	private String color="Blanco";
	private char consumo=70;
	private int peso=5;
	
	public Electrodomestico(int preciobase, String color, char consumo, int peso){
		this.preciobase=preciobase;
		this.color=color;
		this.consumo=consumo;
		this.peso=peso;
	}

	public int getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(int preciobase) {
		this.preciobase = preciobase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	
	
	public void getComprobarColor(String color) {
		if (color=="blanco") {
			System.out.println("Color de Electrodoméstico: blanco");
			if (color=="negro") {
				System.out.println("Color de Electrodoméstico: negro");
				if (color=="rojo") {
					System.out.println("Color de Electrodoméstico: rojo");
					if (color=="azul") {
						System.out.println("Color de Electrodoméstico: azul");
						if (color=="gris") {
							System.out.println("Color de Electrodoméstico: gris");
						}else {
							System.out.println("Color por Defecto: blanco");
						}
					}
				}
			}
		}
	}
	
	
	public void setComprobarConsumoEnergetico(char consumo) {
		if (consumo=='A') {
			System.out.println("Consumo Energético: A");
			if (consumo=='B') {
				System.out.println("Consumo Energético: B");
				if (consumo=='C') {
					System.out.println("Consumo Energético: C");
					if (consumo=='D') {
						System.out.println("Consumo Energético: D");
						if (consumo=='E') {
							System.out.println("Consumo Energético: E");
							if (consumo=='F') {
								System.out.println("Consumo Energético: F");
							}else {
								System.out.println("Consumo Energético por Defecto: F");
							}
						}
					}
				}
			}
		}
			
		
			
	}
		
			
		
	
	
	public void setPrecioFinal(int preciobase) {
		if (consumo=='A') {
			this.preciobase += 100;
			if (consumo=='B') {
				this.preciobase += 80;
				if (consumo=='C') {
					this.preciobase +=60;
					if(consumo=='D') {
						this.preciobase +=50;
						if(consumo=='E') {
							this.preciobase +=30;
							if(consumo=='f') {
								this.preciobase +=10;
								if ((peso>=0) && (peso<=19)) {
									this.preciobase +=10;
									if ((peso>=20) && (peso<=49)) {
										this.preciobase +=50;
										if ((peso>=50) && (peso<=79)) {
											this.preciobase +=80;
											if (peso>=80) {
												this.preciobase +=100;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		
	}
	
	
	
	@Override
	public abstract void mostrarDatos();
	
	@Override
	public void mostrarDescripcion() {
		System.out.println("Precio: " + preciobase + ", Color: " + color + ", Consumo: "+ consumo +", Peso: "+ peso);
	}
	

}
