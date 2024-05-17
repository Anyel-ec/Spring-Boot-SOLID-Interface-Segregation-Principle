package top.anyel.solid.dispositivos.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.solid.dispositivos.implementacion.TabletSinChip;

@RestController
@RequestMapping("/isp/v1")

public class TabletSinChipControlador {

    @GetMapping("/tablet")
    public String tabletSinChip() {
        TabletSinChip tablet = new TabletSinChip();
        return  tablet.encender() + "\n" +
                tablet.apagar() + "\n" +
                tablet.mostrarInformacion();
    }
}
