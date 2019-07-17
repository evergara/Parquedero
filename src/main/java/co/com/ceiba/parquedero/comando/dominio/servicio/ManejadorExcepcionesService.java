package co.com.ceiba.parquedero.comando.dominio.servicio;

import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionMaximaCantidaVehiculo;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionVehiculoEstaRegistrado;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionmensajePlacaPorDia;

public final class ManejadorExcepcionesService {
    private ManejadorExcepcionesService(){}

    public static void VehiculoEstaRegistrado(String mensaje) {
        throw new ExcepcionVehiculoEstaRegistrado(mensaje);
    }

    public static void maximaCantidaVehiculo(String tipoVehiculo, String mensaje) {
        throw  new ExcepcionMaximaCantidaVehiculo(String.format(mensaje, tipoVehiculo));
    }

    public static void mensajePlacaPorDia(String mensaje) {
        throw  new ExcepcionmensajePlacaPorDia(mensaje);
    }
}
