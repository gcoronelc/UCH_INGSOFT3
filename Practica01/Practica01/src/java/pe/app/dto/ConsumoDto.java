package pe.app.dto;

public class ConsumoDto {

  //Datos
  private int lectura1;
  private int lectura2;
  private int consumo;
  private double importe;
  //Calculos
  
  public ConsumoDto() {
  }

    /**
     * @return the lectura1
     */
    public int getLectura1() {
        return lectura1;
    }

    /**
     * @param lectura1 the lectura1 to set
     */
    public void setLectura1(int lectura1) {
        this.lectura1 = lectura1;
    }

    /**
     * @return the lectura2
     */
    public int getLectura2() {
        return lectura2;
    }

    /**
     * @param lectura2 the lectura2 to set
     */
    public void setLectura2(int lectura2) {
        this.lectura2 = lectura2;
    }

    /**
     * @return the consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }


}
