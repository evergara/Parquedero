package co.com.ceiba.parquedero.comando.dominio.servicio;

import co.com.ceiba.parquedero.comando.dominio.mensajevalidacion.ConstanteRegistroServicio;
import co.com.ceiba.parquedero.comando.dominio.modelo.Registro;
import co.com.ceiba.parquedero.comando.dominio.puerto.PuertoRepositorioRegistro;

import java.util.Calendar;
import java.util.Date;

public class EntradaRegistroServicio {
    private PuertoRepositorioRegistro puertoRepositorioRegistro;

    public EntradaRegistroServicio(PuertoRepositorioRegistro puertoRepositorioRegistro){
        this.puertoRepositorioRegistro = puertoRepositorioRegistro;
    }

    public Registro crearRegistro(Registro registro){
        validarRegistro(registro);
        validarCantidadDeTipoVehiculo(registro.getTipoVehiculo());
        validarRestriccionPlacaPorDia(registro.getPlaca(), registro.getFechaLlegada());
        return puertoRepositorioRegistro.guardarRegistro(registro);
    }

    private void validarRestriccionPlacaPorDia(String placa, Date fechaLlegada) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaLlegada);

        if((placa.toUpperCase().startsWith(ConstanteRegistroServicio.MENSAJE_RESTRICION_DE_PLACA_INICIO_CON_LA_LETRA))
                && (calendar.get(Calendar.DAY_OF_WEEK) > Calendar.MONDAY)){
            ManejadorExcepcionesService.mensajePlacaPorDia(ConstanteRegistroServicio.MENSAJE_DIA_NO_PERMITIDO);
        }
    }

    private void validarCantidadDeTipoVehiculo(String tipoVehiculo) {
        int cantidadVehiculo = puertoRepositorioRegistro.cantidaRegistroPorTipoVehiculo(tipoVehiculo);

        if((tipoVehiculo.contentEquals(ConstanteRegistroServicio.TIPO_DE_VEHICULO_CARRO) && cantidadVehiculo == ConstanteRegistroServicio.NUMERO_MAXIMO_DE_CARRO)
                || (tipoVehiculo.contentEquals(ConstanteRegistroServicio.TIPO_DE_VEHICULO_MOTO) && (cantidadVehiculo == ConstanteRegistroServicio.NUMERO_MAXIMO_DE_MOTO))){
            ManejadorExcepcionesService.maximaCantidaVehiculo(tipoVehiculo, ConstanteRegistroServicio.MENSAJE_NO_HAY_CUPO);
        }
    }

    private void validarRegistro(Registro registro) {
        boolean existe = puertoRepositorioRegistro.previoRegistro(registro);

        if(existe){
            ManejadorExcepcionesService.VehiculoEstaRegistrado(ConstanteRegistroServicio.MENSAJE_EL_VEHICULO_YA_ESTA_REGISTRADO);
        }

    }
}
