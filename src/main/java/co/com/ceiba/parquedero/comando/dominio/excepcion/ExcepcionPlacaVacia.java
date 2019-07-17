package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionPlacaVacia extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExcepcionPlacaVacia(String message) {
        super(message);
    }
}
