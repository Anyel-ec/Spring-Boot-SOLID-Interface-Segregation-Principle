package top.anyel.solid.dispositivos.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.solid.dispositivos.implementacion.Celular;

@RestController
@RequestMapping("/isp/v1")
public class CelularControlador {

    @GetMapping("/celular")
    public String celular() {
        Celular celular = new Celular();
        return  celular.encender() + "\n " +
                celular.apagar() + "\n " +
                celular.mostrarInformacion() + "\n" +
                celular.hacerLlamada("123456789") + "\n" +
                celular.recibirLlamada("123456789");
    }
}
