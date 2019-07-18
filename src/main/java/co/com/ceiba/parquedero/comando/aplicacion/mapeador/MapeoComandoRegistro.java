package co.com.ceiba.parquedero.comando.aplicacion.mapeador;

import co.com.ceiba.parquedero.comando.aplicacion.comando.ComandoCrearRegistro;
import co.com.ceiba.parquedero.comando.dominio.modelo.Registro;

public final  class MapeoComandoRegistro {
    private static final MapeoComandoRegistro INSTANCIA = new  MapeoComandoRegistro();

    private MapeoComandoRegistro(){}

    public static MapeoComandoRegistro obtenerIntancia(){
        return INSTANCIA;
    }

    public ComandoCrearRegistro crearComandoRegistroDeModelo(Registro registro){
        return new ComandoCrearRegistro(registro.getId(),registro.getPlaca(),registro.getTipoVehiculo(),registro.getCilindraje());
    }

}
