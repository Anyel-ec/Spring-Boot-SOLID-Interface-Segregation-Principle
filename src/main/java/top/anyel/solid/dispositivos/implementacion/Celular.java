package top.anyel.solid.dispositivos.implementacion;

import top.anyel.solid.dispositivos.interfaces.DispositivoConLlamadas;
import top.anyel.solid.dispositivos.interfaces.DispositivoElectronicoBasico;


// USE CORRECT IMPLEMENTATION
public class Celular implements DispositivoElectronicoBasico,
        DispositivoConLlamadas {
    @Override
    public String encender() {
        return "Teléfono inteligente encendido";
    }

    @Override
    public String apagar() {
        return "Teléfono inteligente apagado";
    }

    @Override
    public String hacerLlamada(String numero) {
        return "Llamando al número: " + numero;
    }

    @Override
    public String recibirLlamada(String numero) {
        return "Recibiendo llamada del número: " + numero;
    }

    @Override
    public String mostrarInformacion() {
        return "Mostrando información";
    }
}