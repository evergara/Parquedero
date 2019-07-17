package co.com.ceiba.parquedero.comando.dominio.excepcion;

public class ExcepcionCilindrageRequerido extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcepcionCilindrageRequerido(String mensaje) {
        super(mensaje);
    }
}
