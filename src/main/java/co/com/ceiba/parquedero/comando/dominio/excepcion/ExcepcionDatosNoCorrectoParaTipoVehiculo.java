package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionDatosNoCorrectoParaTipoVehiculo extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExcepcionDatosNoCorrectoParaTipoVehiculo(String mensaje) {
        super(mensaje);
    }
}
