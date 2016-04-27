package pe.uch.Dto;

public class NotaDto {
    
  private String nombre;
    private String app;
    private int prac01;
    private int prac02;
    private int prac03;
    private int prac04;
    private int exapar;
    private int exafin;
    private int proyecto;
    private double promedio;

    public NotaDto() {
    }

    public NotaDto(String nombre, String app, int prac01, int prac02, int prac03
            , int prac04, int exapar, int exafin, int proyecto, double promedio) {
        this.nombre = nombre;
        this.app = app;
        this.prac01 = prac01;
        this.prac02 = prac02;
        this.prac03 = prac03;
        this.prac04 = prac04;
        this.exapar = exapar;
        this.exafin = exafin;
        this.proyecto = proyecto;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public int getPrac01() {
        return prac01;
    }

    public void setPrac01(int prac01) {
        this.prac01 = prac01;
    }

    public int getPrac02() {
        return prac02;
    }

    public void setPrac02(int prac02) {
        this.prac02 = prac02;
    }

    public int getPrac03() {
        return prac03;
    }

    public void setPrac03(int prac03) {
        this.prac03 = prac03;
    }

    public int getPrac04() {
        return prac04;
    }

    public void setPrac04(int prac04) {
        this.prac04 = prac04;
    }

    public int getExapar() {
        return exapar;
    }

    public void setExapar(int exapar) {
        this.exapar = exapar;
    }

    public int getExafin() {
        return exafin;
    }

    public void setExafin(int exafin) {
        this.exafin = exafin;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
  
  
  
}
