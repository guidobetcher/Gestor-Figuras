public class Circulo extends Fig {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}
}