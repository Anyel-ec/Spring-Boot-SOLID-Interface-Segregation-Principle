package top.anyel.solid.dispositivos.interfaces;

// THIS INTERFACE IS GENERIC, AND NOT ALL METHODS ARE IMPLEMENTED IN TABLET
public interface Dispositivo {

    String hacerLlamada(String numero);
    String recibirLlamada(String numero);
    String encender();
    String apagar();
    String mostrarInformacion();

    // TODO: THE RECOMMENDED SOLUTION IS TO CREATE A TWO NEW INTERFACES

}