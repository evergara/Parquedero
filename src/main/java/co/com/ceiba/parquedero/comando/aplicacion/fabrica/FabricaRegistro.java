package co.com.ceiba.parquedero.comando.aplicacion.fabrica;

import co.com.ceiba.parquedero.comando.aplicacion.comando.ComandoCrearRegistro;
import co.com.ceiba.parquedero.comando.dominio.modelo.Registro;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FabricaRegistro {
    public Registro crear(ComandoCrearRegistro comandoRegistro){
        return new Registro(comandoRegistro.getId(), comandoRegistro.getPlaca(), comandoRegistro.getTipoVehiculo()
                ,comandoRegistro.getCilindraje(), new Date());
    }
}
