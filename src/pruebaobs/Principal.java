package pruebaobs;

public class Principal {

    public static void main(String[] args) {

	// Create the Subject object
	// It will handle updating all observers
	// as well as deleting and adding them

	Auto miAuto = new Auto(10, 10, 10, "QWE-231S");

	Mecanico observer1 = new Mecanico("Tecla");
	miAuto.addObserver(observer1);
	miAuto.setNivelAceite(197.00);
	miAuto.setPresionNeumaticos(677.60);
	miAuto.setNivelAgua(676.40);

	// Mecanico observer2 = new Mecanico("Nota");

	// stockGrabber.setIBMPrice(197.00);
	// stockGrabber.setAAPLPrice(677.60);
	// stockGrabber.setGOOGPrice(676.40);

	// Delete one of the observers

	// stockGrabber.unregister(observer2);

	// stockGrabber.setIBMPrice(197.00);
	// stockGrabber.setAAPLPrice(677.60);
	// stockGrabber.setGOOGPrice(888.400);

    }

}