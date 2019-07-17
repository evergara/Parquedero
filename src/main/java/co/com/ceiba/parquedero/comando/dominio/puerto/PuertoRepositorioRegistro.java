package co.com.ceiba.parquedero.comando.dominio.puerto;

import co.com.ceiba.parquedero.comando.dominio.modelo.Registro;

import java.util.List;

public interface PuertoRepositorioRegistro {
  Registro guardarRegistro(Registro registro);

  Registro buscarRegistrPorPlaca(String placa);

  List<Registro> listarRegistro();

  int cantidaRegistroPorTipoVehiculo(String tipoVehiculo);

  boolean previoRegistro(Registro registro);
}
