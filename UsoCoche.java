package poo;

import javax.swing.*;

public class UsoCoche {

	public static void main(String[] args) {
		
		Camioneta miCamioneta = new Camioneta();
		
		miCamioneta.estableceColor(JOptionPane.showInputDialog("Introduce color:"));
		miCamioneta.ConfiguraAsiento(JOptionPane.showInputDialog("Tiene asiento de cuero?"));
		miCamioneta.ConfiguraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		miCamioneta.ConfiguraTraccion(JOptionPane.showInputDialog("Introduce tipo de traccion:"));
		
		System.out.println(miCamioneta.DimeCaracteristicasGenerales());
		System.out.println(miCamioneta.DimeColor());
		System.out.println(miCamioneta.DimeAsiento());
		System.out.println(miCamioneta.DimeClimatizador());
		System.out.println(miCamioneta.DimeTraccion());
		System.out.println("El precio de la camioneta es: " +miCamioneta.precioCamioneta() +"$");
	}

}