package pe.egcc.dto;

public class NotaDto {

  private String alumno,curso;
  private double n1,n2,n3,n4,exparcial, exfinal,proyecto;
  private double prom;

    public NotaDto(String alumno, String curso, double n1, double n2, double n3, double n4, double exparcial, double exfinal, double proyecto, double prom) {
        this.alumno = alumno;
        this.curso = curso;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.exparcial = exparcial;
        this.exfinal = exfinal;
        this.proyecto = proyecto;
        this.prom = prom;
    }

    public NotaDto() {
    }
    
    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
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

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }


    
  
  
}
