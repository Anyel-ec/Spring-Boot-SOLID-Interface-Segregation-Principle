package top.anyel.solid.dispositivos.implementacion;

import top.anyel.solid.dispositivos.interfaces.DispositivoElectronicoBasico;


// USE CORRECT IMPLEMENTATION
public class TabletSinChip implements DispositivoElectronicoBasico{
    @Override
    public String encender() {
        return "Tablet encendida";
    }

    @Override
    public String apagar() {
        return "Tablet apagada";
    }

    @Override
    public String mostrarInformacion() {
       return "Mostrando informacion";
    }
}