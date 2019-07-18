package co.com.ceiba.parquedero.comando.aplicacion.comando.manejador;

import co.com.ceiba.parquedero.comando.aplicacion.comando.ComandoCrearRegistro;
import co.com.ceiba.parquedero.comando.aplicacion.comando.ComandoRespuestaRegistro;
import co.com.ceiba.parquedero.comando.aplicacion.fabrica.FabricaRegistro;
import co.com.ceiba.parquedero.comando.aplicacion.mapeador.MapeoComandoRegistro;
import co.com.ceiba.parquedero.comando.dominio.modelo.Registro;
import co.com.ceiba.parquedero.comando.dominio.servicio.ServicioEntradaRegistro;


import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearRegistro implements ManejadorComandoRespuesta<ComandoCrearRegistro,ComandoRespuestaRegistro<ComandoCrearRegistro>> {

    private ServicioEntradaRegistro servicioEntradaRegistro;
    private final FabricaRegistro fabricaRegistro;
    private static final MapeoComandoRegistro mapeoComandoRegistro = MapeoComandoRegistro.obtenerIntancia();

    public  ManejadorCrearRegistro(FabricaRegistro fabricaRegistro, ServicioEntradaRegistro servicioEntradaRegistro){
        this.fabricaRegistro = fabricaRegistro;
        this.servicioEntradaRegistro = servicioEntradaRegistro;
    }

    @Override
    public ComandoRespuestaRegistro<ComandoCrearRegistro> ejecutar(ComandoCrearRegistro command) {
        Registro registro = this.fabricaRegistro.crear(command);
        return new ComandoRespuestaRegistro<>(mapeoComandoRegistro.crearComandoRegistroDeModelo(this.servicioEntradaRegistro.crearRegistro(registro)));
    }
}
