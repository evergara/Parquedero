package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionVehiculoEstaRegistrado extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcepcionVehiculoEstaRegistrado(String mensaje) {
        super(mensaje);
    }
}
