package co.com.ceiba.parquedero.comando.aplicacion.comando;

public class ComandoRespuestaRegistro <T> {
    private T objeto;

    public ComandoRespuestaRegistro(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto(){
        return objeto;
    }
}
