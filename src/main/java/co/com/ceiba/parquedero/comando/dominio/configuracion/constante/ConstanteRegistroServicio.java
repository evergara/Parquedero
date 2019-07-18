package co.com.ceiba.parquedero.comando.dominio.configuracion.constante;

public final class ConstanteRegistroServicio {

    private ConstanteRegistroServicio(){}

    public static final String MENSAJE_RESTRICION_DE_PLACA_INICIO_CON_LA_LETRA  = "A";
    public static final String MENSAJE_DIA_NO_PERMITIDO = "El vehiculo no esta autorizado a ingresar.";
    public static final String MENSAJE_NO_HAY_CUPO = "En este momento no hay cupo para el tipo de vehiculo %S";
    public static final String MENSAJE_EL_VEHICULO_NO_TIENE_REGISTRO = "El vehiculo no se encuentra en el parqueadero";
    public static final String MENSAJE_EL_VEHICULO_YA_ESTA_REGISTRADO = "El vehiculo ya ha ingresado";

    public static final int NUMERO_MAXIMO_DE_CARRO = 20;
    public static final int NUMERO_MAXIMO_DE_MOTO = 10;

    public static final String TIPO_DE_VEHICULO_CARRO = "CAR";
    public static final String TIPO_DE_VEHICULO_MOTO = "MOTO";

}
