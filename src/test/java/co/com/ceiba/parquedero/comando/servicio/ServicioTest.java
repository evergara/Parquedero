package co.com.ceiba.parquedero.comando.servicio;

import co.com.ceiba.parquedero.comando.dominio.puerto.PuertoRepositorioRegistro;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ServicioTest {

    private PuertoRepositorioRegistro puertoRepositorioRegistro;

    @Before
    public void preparar(){
        this.puertoRepositorioRegistro = mock(PuertoRepositorioRegistro.class);
    }

    @Test
    public void registrarCarroTest(){

    }
}
