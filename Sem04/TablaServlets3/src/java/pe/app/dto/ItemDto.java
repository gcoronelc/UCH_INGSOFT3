package pe.app.dto;

public class ItemDto {

  private int num1;
  private String operador;
  private int num2;
  private int resultado;

  public ItemDto() {
  }

  public ItemDto(int num1, String operador, int num2, int resultado) {
    this.num1 = num1;
    this.operador = operador;
    this.num2 = num2;
    this.resultado = resultado;
  }

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public String getOperador() {
    return operador;
  }

  public void setOperador(String operador) {
    this.operador = operador;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getResultado() {
    return resultado;
  }

  public void setResultado(int resultado) {
    this.resultado = resultado;
  }

}
