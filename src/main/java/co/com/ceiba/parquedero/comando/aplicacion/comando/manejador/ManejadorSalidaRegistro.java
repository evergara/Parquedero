package co.com.ceiba.parquedero.comando.aplicacion.comando.manejador;

import co.com.ceiba.parquedero.comando.dominio.servicio.ServicioSalidaRegistro;

public class ManejadorSalidaRegistro {

    private ServicioSalidaRegistro salidaRegistroSercicio;

    public ManejadorSalidaRegistro(ServicioSalidaRegistro salidaRegistroSercicio){
        this.salidaRegistroSercicio = salidaRegistroSercicio;
    }

    public  void salir(String placa){
      this.salidaRegistroSercicio.salidaRegistro(placa);
    }
}