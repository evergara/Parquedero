package co.com.ceiba.parquedero.comando.aplicacion.comando.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComandoRespuesta <C,R> {
    @Transactional
    R ejecutar(C command);
}
