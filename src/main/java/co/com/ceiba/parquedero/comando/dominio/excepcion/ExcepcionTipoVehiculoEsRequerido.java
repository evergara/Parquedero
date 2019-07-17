package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionTipoVehiculoEsRequerido extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcepcionTipoVehiculoEsRequerido(String mensaje) {
        super(mensaje);
    }
}
