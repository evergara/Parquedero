package co.com.ceiba.parquedero.comando.dominio.modelo;

import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionCilindrageRequerido;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionDatosNoCorrectoParaTipoVehiculo;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionPlacaVacia;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionTipoVehiculoEsRequerido;

public final class ValidarArgumento {
    private ValidarArgumento(){}

    public static void validarPlaca(String placa, String mensaje) {
        if(placa  == null){
            throw new ExcepcionPlacaVacia(mensaje);
        }
    }

    public static void validarTipoVehiculoEsRequerido(String tipoVehiculo, String mensaje) {
        if(tipoVehiculo == null){
            throw new ExcepcionTipoVehiculoEsRequerido(mensaje);
        }
    }

    public static void DatosNoCorrectoParaTipoVehiculo(String mensaje) {
        throw new ExcepcionDatosNoCorrectoParaTipoVehiculo(mensaje);
    }

    public static void ValidarCilindrageRequerido(Integer cilindraje, String mensaje) {
        if(cilindraje == null){
            throw new ExcepcionCilindrageRequerido(mensaje);
        }
    }
}
