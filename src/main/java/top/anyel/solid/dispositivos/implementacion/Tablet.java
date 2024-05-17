package top.anyel.solid.dispositivos.implementacion;

import top.anyel.solid.dispositivos.interfaces.Dispositivo;
// TODO: ERROR, THIS CLASS NOT IMPLEMENTS ALL METHODS FROM INTERFACE DISPOSITIVO
// USE INCORRECT INTERFACE
public class Tablet implements Dispositivo {

    // USE INCORRECT
    @Override
    public String hacerLlamada(String numero) {
        return null; // This method is not implemented
    }

    // USE INCORRECT
    @Override
    public String recibirLlamada(String numero) {
        return null; // This method is not implemented
    }

    @Override
    public String encender() {
        return "encendido";
    }

    @Override
    public String apagar() {
        return  "apagado";
    }

    @Override
    public String mostrarInformacion() {
        return "Mostrando informacion";
    }
}
