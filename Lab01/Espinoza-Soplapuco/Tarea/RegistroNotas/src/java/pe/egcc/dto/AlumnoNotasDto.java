/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.dto;

public class AlumnoNotasDto {
    private String nombre;
    private String curso;
    private int p1;
    private int p2;
    private int p3;
    private int p4;
    private int exparcial;
    private int exfinal;
    private int proyecto;
    private double promedio;

    public AlumnoNotasDto(String nombre, String curso, int p1, int p2, int p3, int p4, int exparcial, int exfinal, int proyecto, double promedio) {
        this.nombre = nombre;
        this.curso = curso;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.exparcial = exparcial;
        this.exfinal = exfinal;
        this.proyecto = proyecto;
        this.promedio = promedio;
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

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public int getExparcial() {
        return exparcial;
    }

    public void setExparcial(int exparcial) {
        this.exparcial = exparcial;
    }

    public int getExfinal() {
        return exfinal;
    }

    public void setExfinal(int exfinal) {
        this.exfinal = exfinal;
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
