package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionmensajePlacaPorDia extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcepcionmensajePlacaPorDia(String mensaje) {
        super(mensaje);
    }
}
