/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.jads.uch.dto;

/**
 *
 * @author Familia Diaz
 */
public class notasDto {
    
    protected int cant;
    protected String alumno,curso;
    protected notasinv notas;
    protected double promedio,parcial,examenF,proyecto,notaF;
   
    public notasDto(){

}

    public notasDto(int cant, String alumno, String curso, notasinv notas, double promedio, double parcial, double examenF, double proyecto, double notaF) {
        this.cant = cant;
        this.alumno = alumno;
        this.curso = curso;
        this.notas = notas;
        this.promedio = promedio;
        this.parcial = parcial;
        this.examenF = examenF;
        this.proyecto = proyecto;
        this.notaF = notaF;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
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

    public notasinv getNotas() {
        return notas;
    }

    public void setNotas(notasinv notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public double getExamenF() {
        return examenF;
    }

    public void setExamenF(double examenF) {
        this.examenF = examenF;
    }

    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }

    public double getNotaF() {
        return notaF;
    }

    public void setNotaF(double notaF) {
        this.notaF = notaF;
    }

    
    
    
}
