package pe.gjav.notas.dto;

public class NotasDto {
    protected int orden;
    protected String alumno;
    protected String curso;
    protected Practicas practicas;
    protected double promedioPracticas;
    protected int parcial;
    protected int examenFinal;
    protected int proyecto;
    protected double notaFinal;

    public NotasDto() {
    }

    public NotasDto(int orden, String alumno, String curso, Practicas practicas, double promedioPracticas, int parcial, int examenFinal, int proyecto, double notaFinal) {
        this.orden = orden;
        this.alumno = alumno;
        this.curso = curso;
        this.practicas = practicas;
        this.promedioPracticas = promedioPracticas;
        this.parcial = parcial;
        this.examenFinal = examenFinal;
        this.proyecto = proyecto;
        this.notaFinal = notaFinal;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
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

    public Practicas getPracticas() {
        return practicas;
    }

    public void setPracticas(Practicas practicas) {
        this.practicas = practicas;
    }

    public double getPromedioPracticas() {
        return promedioPracticas;
    }

    public void setPromedioPracticas(double promedioPracticas) {
        this.promedioPracticas = promedioPracticas;
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

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
}
