package co.com.ceiba.parquedero.testbase.testdatabuilder;

import co.com.ceiba.parquedero.comando.aplicacion.comando.ComandoCrearRegistro;
import co.com.ceiba.parquedero.comando.dominio.configuracion.constante.ConstanteRegistro;

public class RegistroComandoTestBuilder {

    private Integer id;
    private String placa;
    private String tipoVehiculo;
    private Integer cilindraje;

    public RegistroComandoTestBuilder(){
        this.id = 1;
        this.placa = "MAK-282";
        this.tipoVehiculo = ConstanteRegistro.TIPO_VEHICULO_CARRO;
        this.cilindraje = null;
    }

    public RegistroComandoTestBuilder conId(Integer id) {
        this.id = id;
        return this;
    }

    public RegistroComandoTestBuilder conPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public RegistroComandoTestBuilder conTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        return this;
    }

    public RegistroComandoTestBuilder conCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
        return this;
    }

    public ComandoCrearRegistro contruir() {
        return new ComandoCrearRegistro(id, placa, tipoVehiculo, cilindraje);
    }
}
