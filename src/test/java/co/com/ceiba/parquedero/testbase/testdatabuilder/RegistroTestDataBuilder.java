package co.com.ceiba.parquedero.testbase.testdatabuilder;

import co.com.ceiba.parquedero.comando.dominio.configuracion.constante.ConstanteRegistro;
import co.com.ceiba.parquedero.comando.dominio.modelo.Registro;

import java.util.Date;

public class RegistroTestDataBuilder {
    private Integer id;
    private String placa;
    private String tipoVehiculo;
    private Integer cilindraje;
    private Date fechaLlegada;
    private Date fechaSalida;
    private Long valor;
    private boolean estado;

    public RegistroTestDataBuilder(){
        this.id = 1;
        this.placa = "MAK-281";
        this.tipoVehiculo = ConstanteRegistro.TIPO_VEHICULO_CARRO;
        this.fechaLlegada = new Date();
        this.cilindraje = null;
        this.fechaSalida = null;
        this.valor = null;
        this.estado = true;
    }

    public RegistroTestDataBuilder conId(Integer id) {
        this.id = id;
        return this;
    }

    public RegistroTestDataBuilder conPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public RegistroTestDataBuilder conTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        return this;
    }

    public RegistroTestDataBuilder conCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
        return this;
    }

    public RegistroTestDataBuilder conFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
        return this;
    }

    public RegistroTestDataBuilder conFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public RegistroTestDataBuilder conValor(Long valor) {
        this.valor = valor;
        return this;
    }

    public RegistroTestDataBuilder conestado(boolean estado) {
        this.estado = estado;
        return this;
    }

    public Registro contruir(){
        Registro registro =new Registro(id, placa, tipoVehiculo, cilindraje, fechaLlegada);
        registro.setFechaLlegada(fechaLlegada);
        registro.setFechaLlegada(fechaSalida);
        registro.setValor(valor);
        registro.setEstado(estado);
        return  registro;
    }
}
