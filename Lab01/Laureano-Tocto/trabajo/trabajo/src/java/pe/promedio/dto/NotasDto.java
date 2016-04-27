
package pe.promedio.dto;

public class NotasDto {
    private String alumno;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double promedio;
    private double exaparcial;
    private double exafinal;
    private double proyecto;
    
    public NotasDto(){
        
    }
    
    public NotasDto(String alumno, double nota1, double nota2, double nota3, double nota4, double promedio, 
            double exaparcial, double exafinal, double proyecto){
        this.alumno=alumno;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
        this.promedio=promedio;
        this.exaparcial=exaparcial;
        this.exafinal=exafinal;
        this.proyecto=proyecto;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getExaparcial() {
        return exaparcial;
    }

    public void setExaparcial(double exaparcial) {
        this.exaparcial = exaparcial;
    }

    public double getExafinal() {
        return exafinal;
    }

    public void setExafinal(double exafinal) {
        this.exafinal = exafinal;
    }

    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }
    
    
    
}
