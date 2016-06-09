package pe.egcc.domain;

public class BeanRpta {

  private int code; // 1 o -1
  private String texto; // Texto a mostrar

  public BeanRpta() {
  }

  public BeanRpta(int code, String texto) {
    this.code = code;
    this.texto = texto;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

}
