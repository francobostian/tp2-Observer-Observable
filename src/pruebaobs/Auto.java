package pruebaobs;

import java.util.Observable;

public class Auto extends Observable {

    // private List<Observer> observers;
    private double agua;
    private double presion;
    private double aceite;
    private String patente;

    // public Auto() {
    //
    //
    //
    // observers = new ArrayList<Observer>();
    // }

    public Auto(double agua, double presion, double aceite, String patente) {
	super();

	this.agua = agua;
	this.presion = presion;
	this.aceite = aceite;
	this.patente = patente;
    }

    public Auto(Auto viejo) {
	super();

	this.agua = viejo.getAgua();
	this.presion = viejo.getPresion();
	this.aceite = viejo.getAceite();
    }

    public double getAgua() {
	return agua;
    }

    public double getPresion() {
	return presion;
    }

    public double getAceite() {
	return aceite;
    }

    public void setNivelAceite(double nuevoAceite) {
	Auto Repuesto = new Auto(this);

	this.aceite = nuevoAceite;
	this.setChanged();

	this.notifyObservers(Repuesto);

    }

    public void setPresionNeumaticos(double nuevoPresion) {

	Auto Repuesto = new Auto(this);

	this.presion = nuevoPresion;
	this.setChanged();

	this.notifyObservers(Repuesto);

    }

    public void setNivelAgua(double nuevoAgua) {

	Auto Repuesto = new Auto(this);

	this.agua = nuevoAgua;
	this.setChanged();

	this.notifyObservers(Repuesto);

    }

    public String getPatente() {
	return patente;
    }

    public void setPatente(String patente) {
	this.patente = patente;
    }

}