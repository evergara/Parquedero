package co.com.ceiba.parquedero.comando.aplicacion.comando.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComando <C> {
    @Transactional
    void ejecutar(C command);
}
