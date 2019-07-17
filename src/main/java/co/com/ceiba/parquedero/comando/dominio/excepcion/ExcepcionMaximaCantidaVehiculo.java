package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionMaximaCantidaVehiculo extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExcepcionMaximaCantidaVehiculo(String mensaje) {
        super(mensaje);
    }
}
