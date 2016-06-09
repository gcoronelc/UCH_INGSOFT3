package pe.egcc.demo.domain;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 */
public class Sucursal {

  private String codigo;
  private String nombre;
  private String ciudad;
  private String direccion;
  private int contCuenta;

  public Sucursal() {
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getContCuenta() {
    return contCuenta;
  }

  public void setContCuenta(int contCuenta) {
    this.contCuenta = contCuenta;
  }

  @Override
  public String toString() {
    return codigo + " | " + nombre;
  }

}
