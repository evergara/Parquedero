package co.com.ceiba.parquedero.comando.dominio.modelo;

import co.com.ceiba.parquedero.comando.dominio.configuracion.constante.ConstanteRegistro;

import java.util.Date;

public class Registro {

    private Integer id;
    private String placa;
    private String tipoVehiculo;
    private Integer cilindraje;
    private Date fechaLlegada;
    private Date fechaSalida;
    private Long valor;
    private boolean estado;

    public Registro(Integer id, String placa, String tipoVehiculo, Integer cilindraje, Date fechaLlegada) {
        ValidarArgumento.validarPlaca(placa, ConstanteRegistro.MENSAJE_PLACA_REQUERIDA);
        ValidarArgumento.validarTipoVehiculoEsRequerido(tipoVehiculo, ConstanteRegistro.MESNSAJE_TIPO_VEHICULO_ES_REQUERIDO);

        if(!tipoVehiculo.contentEquals(ConstanteRegistro.TIPO_VEHICULO_MOTO) && !tipoVehiculo.contentEquals(ConstanteRegistro.TIPO_VEHICULO_CARRO)){
          ValidarArgumento.DatosNoCorrectoParaTipoVehiculo(ConstanteRegistro.MENSAJE_TIPO_DE_VEHICULO_NO_TIENE_DATOS_CORRECTO);
        }

        if (tipoVehiculo.contentEquals(ConstanteRegistro.TIPO_VEHICULO_MOTO)) {
            ValidarArgumento.ValidarCilindrageRequerido(cilindraje, ConstanteRegistro.MENSAJE_CILINDRAJE_ES_REQUERIDO);
        }
        this.id = id;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.cilindraje = cilindraje;
        this.fechaLlegada = fechaLlegada;
        this.estado = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
