package pe.egcc.dto;

public class ItemDto {

    private String nombre;
    private float p1;
    private float p2;
    private float p3;
    private float p4;
    private float ep;
    private float ef;
    private float proy;
    private float promedio;
    private boolean aprobado;

    public ItemDto() {
    }

    public ItemDto(String nombre, float p1, float p2, float p3, float p4, float ep, float ef,float proy, float promedio, boolean aprobado) {
        this.nombre = nombre;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.ep = ep;
        this.ef = ef;
        this.proy = proy;
        this.promedio = promedio;
        this.aprobado = aprobado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP3() {
        return p3;
    }

    public void setP3(float p3) {
        this.p3 = p3;
    }

    public float getP4() {
        return p4;
    }

    public void setP4(float p4) {
        this.p4 = p4;
    }

    public float getEp() {
        return ep;
    }

    public void setEp(float ep) {
        this.ep = ep;
    }

    public float getEf() {
        return ef;
    }

    public void setEf(float ef) {
        this.ef = ef;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    
    public float getProy() {
        return proy;
    }

    public void setProy(float proy) {
        this.proy = proy;
    }

  

}
