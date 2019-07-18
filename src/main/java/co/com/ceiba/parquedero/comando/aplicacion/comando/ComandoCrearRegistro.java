package co.com.ceiba.parquedero.comando.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCrearRegistro implements Serializable {
    private static final long serialVersionUID = 42L;

    private Integer id;
    private String placa;
    private String tipoVehiculo;
    private Integer cilindraje;
}
