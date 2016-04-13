
package pe.uch.practica01.Dto;

public class PracticaDto {
    //Datos
    private int lectura1;
    private int lectura2;
    //calculo
    private int consumo;
    private double importe;
    
    void PracticaDto(){
    }

    public int getLectura1() {
        return lectura1;
    }

    public void setLectura1(int lectura1) {
        this.lectura1 = lectura1;
    }

    public int getLectura2() {
        return lectura2;
    }

    public void setLectura2(int lectura2) {
        this.lectura2 = lectura2;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
