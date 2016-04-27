
package pe.omv.dto;

public class AlumnoDto {

  private String nombre;
  private String curso;
  private double practica1;
  private double practica2;
  private double practica3;
  private double practica4;
  private double exparcial;
  private double exfinal;
  private double proyecto;
  private double propracticas;
  private double prottotal;

public AlumnoDto(String nombre, String curso, double practica1, double practica2, double practica3, double practica4, double exparcial, double exfinal, double proyecto,double propracticas,double prottotal ) {
        this.nombre = nombre;
        this.curso = curso;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.practica4 = practica4;
        this.exparcial = exparcial;
        this.exfinal = exfinal;
        this.proyecto = proyecto;
        this.propracticas=propracticas;
        this.prottotal=prottotal;
    }

    public double getPropracticas() {
        return propracticas;
    }

    public void setPropracticas(double propracticas) {
        this.propracticas = propracticas;
    }

    public double getProttotal() {
        return prottotal;
    }

    public void setProttotal(double prottotal) {
        this.prottotal = prottotal;
    }

    public AlumnoDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPractica1() {
        return practica1;
    }

    public void setPractica1(double practica1) {
        this.practica1 = practica1;
    }

    public double getPractica2() {
        return practica2;
    }

    public void setPractica2(double practica2) {
        this.practica2 = practica2;
    }

    public double getPractica3() {
        return practica3;
    }

    public void setPractica3(double practica3) {
        this.practica3 = practica3;
    }

    public double getPractica4() {
        return practica4;
    }

    public void setPractica4(double practica4) {
        this.practica4 = practica4;
    }

    public double getExparcial() {
        return exparcial;
    }

    public void setExparcial(double exparcial) {
        this.exparcial = exparcial;
    }

    public double getExfinal() {
        return exfinal;
    }

    public void setExfinal(double exfinal) {
        this.exfinal = exfinal;
    }

    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }
  
  
  
}
