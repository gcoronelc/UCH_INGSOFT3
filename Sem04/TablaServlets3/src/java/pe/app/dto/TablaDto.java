package pe.app.dto;

public class TablaDto {

  //Datos
  private int numero;

  //Calculos
  private ItemDto[] tabla;

  public TablaDto() {
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public ItemDto[] getTabla() {
    return tabla;
  }

  public void setTabla(ItemDto[] tabla) {
    this.tabla = tabla;
  }

}
