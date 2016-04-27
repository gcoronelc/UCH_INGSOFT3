/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.dto;

/**
 *
 * @author user
 */
public class Practica {
    private String nombre;
    private int prac1;
    private int prac2;
    private int prac3;
    private int prac4;
    private int parcial;
    private int examenFinal;
    private int proyecto;
    private double promedio;
    private double resultado;   
    public void Practica(){
        
    }

    public Practica(String nombre, int prac1, int prac2, int prac3, int prac4, int parcial, int examenFinal, int proyecto, double promedio, double resultado) {
        this.nombre = nombre;
        this.prac1 = prac1;
        this.prac2 = prac2;
        this.prac3 = prac3;
        this.prac4 = prac4;
        this.parcial = parcial;
        this.examenFinal = examenFinal;
        this.proyecto = proyecto;
        this.promedio = promedio;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrac1() {
        return prac1;
    }

    public void setPrac1(int prac1) {
        this.prac1 = prac1;
    }

    public int getPrac2() {
        return prac2;
    }

    public void setPrac2(int prac2) {
        this.prac2 = prac2;
    }

    public int getPrac3() {
        return prac3;
    }

    public void setPrac3(int prac3) {
        this.prac3 = prac3;
    }

    public int getPrac4() {
        return prac4;
    }

    public void setPrac4(int prac4) {
        this.prac4 = prac4;
    }

    public int getParcial() {
        return parcial;
    }

    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    public int getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(int examenFinal) {
        this.examenFinal = examenFinal;
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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
    
    
}
