package top.anyel.solid.dispositivos.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.solid.dispositivos.implementacion.Tablet;

@RestController
@RequestMapping("/isp/v1")
public class TabletController {

    @GetMapping("/tablet/sin-chip")
    public String tabletSinChip() {
        Tablet tablet = new Tablet();
        return tablet.encender() + "\n " +
                tablet.apagar() + "\n " +
                tablet.mostrarInformacion() + " \n " +
                tablet.hacerLlamada("123456789") + "\n " + // This method is not implemented in Tablet class
                tablet.recibirLlamada("123456789"); // This method is not implemented in Tablet class
    }

}
