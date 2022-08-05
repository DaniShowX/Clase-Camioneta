package poo;

public class Camioneta {
	
	private int rueda;
	
	private int ancho;
	
	private int largo;
	
	private int motor;
	
	private  int peso;
	
	private int capacidadDeCarga;
	
	private String traccion;
	
	private String color;
	
	private boolean AsientoCuero, climatizador;
	
	public Camioneta(){
		
		rueda=4;
		largo=5000;
		ancho=2000;
		motor=270;
		peso=2105;
		capacidadDeCarga=885;
	}
	
	public String DimeCaracteristicasGenerales(){
		return "La plataforma del vehiculo tiene " +rueda +" ruedas" +"\n" +
	"Mide " +largo/1000 +" metros y de ancho " +ancho/1000 +" metros" +"\n" +
		"El motor tiene "+motor +"CV \nEL peso es de " +peso +"kg, y tiene una capacidad de carga de "+capacidadDeCarga +"kg";
	}
	
	public void estableceColor(String colorCamioneta){
		color = colorCamioneta;
	}
	public String DimeColor() {
		return "El color de la Camioneta es " +color;
	}
	
	public void ConfiguraAsiento(String AsientoCuero) {
		if(AsientoCuero.equalsIgnoreCase("si")) {
			this.AsientoCuero=true;
		}else {
			this.AsientoCuero=false;
		}
	}
	public String DimeAsiento() {
		if(AsientoCuero==true) {
			return "El vehiculo tiene asientos de cuero";
		}else {
			return "El vehiculo tiene asientos de serie";
		}
	}
	
	public void ConfiguraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	public String DimeClimatizador() {
		if(climatizador==true) {
			return "El vehiculo tiene climatizador";
		}else {
			return "El vehiculo lleva aire acondicionado";
		}
	}

	public void ConfiguraTraccion(String TipoTraccion) {
		traccion=TipoTraccion;
	}
	public String DimeTraccion() {
		return "La Traccion del vehiculo es " +traccion;
	}
	
	public int precioCamioneta() {
		int precioFinal=38105;
		
		if(AsientoCuero) {
			precioFinal+=2000;
		}
		if(climatizador) {
			precioFinal+=1500;
		}
		return precioFinal;
	
	}
	
} 
