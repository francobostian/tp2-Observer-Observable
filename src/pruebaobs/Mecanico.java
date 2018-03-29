package pruebaobs;

import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer {

    private String nombre;

    public Mecanico(String nombre) {

	this.nombre = nombre;

    }

    // public void printThePrices() {
    //
    // System.out.println("\nAgua: " + agua + "\nPresion: " + presion +
    // "\nAceite: " + aceite + "\n");
    //
    // }

    @Override
    public void update(Observable auto, Object autoviejo) {

	Auto autoNuevo = (Auto) auto;
	Auto autoV = (Auto) autoviejo;

	if (autoNuevo.getAceite() != autoV.getAceite()) {
	    System.out.println(this.nombre + " arreglo el auto de patente " + autoNuevo.getPatente()
		    + " se le realizo un cambio de aceite. \n Tenia: " + autoV.getAceite() + " - ahora subio a: "
		    + autoNuevo.getAceite());
	    System.out.println("termina aceite\n");

	} else if (autoNuevo.getAgua() != autoV.getAgua()) {
	    System.out.println(this.nombre + " arreglo el auto de patente " + autoNuevo.getPatente()
		    + " se le realizo relleno de agua. \n Tenia: " + autoV.getAgua() + " - ahora subio a: "
		    + autoNuevo.getAgua());
	    System.out.println("termina agua \n");

	} else if (autoNuevo.getPresion() != autoV.getPresion()) {
	    System.out.println(this.nombre + " arreglo el auto de patente " + autoNuevo.getPatente()
		    + " se mejoro la presion. \n Tenia: " + autoV.getPresion() + " - ahora subio a: "
		    + autoNuevo.getPresion());
	    System.out.println("termina presion \n");
	} else {
	    System.out.println("no hay cambios");
	}
    }
}