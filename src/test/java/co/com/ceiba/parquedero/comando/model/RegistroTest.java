package co.com.ceiba.parquedero.comando.model;

import co.com.ceiba.parquedero.comando.dominio.configuracion.constante.ConstanteRegistro;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionCilindrageRequerido;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionDatosNoCorrectoParaTipoVehiculo;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionPlacaVacia;
import co.com.ceiba.parquedero.comando.dominio.excepcion.ExcepcionTipoVehiculoEsRequerido;
import co.com.ceiba.parquedero.testbase.TestBase;
import co.com.ceiba.parquedero.testbase.testdatabuilder.RegistroTestDataBuilder;
import org.junit.Test;

public class RegistroTest {

    @Test
    public void validarPlacaRequerida(){
        //Arrange
        RegistroTestDataBuilder registroTestDataBuilder  = new RegistroTestDataBuilder();

        //Act
        registroTestDataBuilder.conPlaca(null);

        //Assert
        TestBase.assertThrows(()->registroTestDataBuilder.contruir(), ExcepcionPlacaVacia.class, ConstanteRegistro.MENSAJE_PLACA_REQUERIDA);
    }

    @Test
    public void validarTipoVehiculoRequerido(){
        //Arrange
        RegistroTestDataBuilder registroTestDataBuilder  = new RegistroTestDataBuilder();

        //Act
        registroTestDataBuilder.conTipoVehiculo(null);

        //Assert
        TestBase.assertThrows(()->registroTestDataBuilder.contruir(), ExcepcionTipoVehiculoEsRequerido.class, ConstanteRegistro.MESNSAJE_TIPO_VEHICULO_ES_REQUERIDO);

    }

    @Test
    public void validarTipoVehiculoConDatosInoorrectos(){
        //Arrange
        RegistroTestDataBuilder registroTestDataBuilder  = new RegistroTestDataBuilder();

        //Act
        registroTestDataBuilder.conTipoVehiculo("ERROR");

        //Assert
        TestBase.assertThrows(()->registroTestDataBuilder.contruir(), ExcepcionDatosNoCorrectoParaTipoVehiculo.class, ConstanteRegistro.MENSAJE_TIPO_DE_VEHICULO_NO_TIENE_DATOS_CORRECTO);

    }

    @Test
    public void validarTipoCilindrajeRequeridoSiEsMoto(){
        //Arrange
        RegistroTestDataBuilder registroTestDataBuilder  = new RegistroTestDataBuilder();

        //Act
        registroTestDataBuilder.conTipoVehiculo(ConstanteRegistro.TIPO_VEHICULO_MOTO);
        registroTestDataBuilder.conCilindraje(null);

        //Assert
        TestBase.assertThrows(()->registroTestDataBuilder.contruir(), ExcepcionCilindrageRequerido.class, ConstanteRegistro.MENSAJE_CILINDRAJE_ES_REQUERIDO);

    }

}
