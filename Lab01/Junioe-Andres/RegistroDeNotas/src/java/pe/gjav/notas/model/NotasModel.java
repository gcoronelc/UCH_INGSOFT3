package pe.gjav.notas.model;

import java.util.ArrayList;
import java.util.List;
import pe.gjav.notas.dto.*;

public class NotasModel {

    private final List<NotasDto> lista;

    public NotasModel() {
        lista = new ArrayList<>();
    }

    public NotasDto getNotas(int i) {
        return lista.get(i);
    }

    public NotasDto getNotas() {
        return lista.get(0);
    }

    public int getN() {
        return lista.size();
    }

    public List<NotasDto> getLista() {
        return lista;
    }

    public void agregarNota(NotasDto dto) {
        dto.setPromedioPracticas(PromedioPracticas(dto));
        dto.setNotaFinal(NotaFinal(dto));
        dto.setOrden(getN() + 1);
        lista.add(dto);
    }

    public double PromedioPracticas(NotasDto dto) {
        double p = 0;
        int a, b, c, d;
        a = dto.getPracticas().getN1();
        b = dto.getPracticas().getN2();
        c = dto.getPracticas().getN3();
        d = dto.getPracticas().getN4();
        if (a < b && a < c && a < d) {
            p = (b + c + d) / 3;
        } else if (b < a && b < c && b < d) {
            p = (a + c + d) / 3;
        } else if (c < a && c < b && c < d) {
            p = (a + b + d) / 3;
        } else if (d < a && d < b && d < c) {
            p = (a + b + c) / 3;
        }
        return Math.round(p);
    }

    public double NotaFinal(NotasDto dto) {
        double p = 0;
        p = (dto.getPromedioPracticas() * 0.3) + (dto.getParcial() * 0.2) + (dto.getExamenFinal() * 0.2) + (dto.getProyecto() * 0.3);
        return Math.round(p);
    }

    public String menorPromedio() {
        String a = lista.get(0).getAlumno();
        double m = lista.get(0).getNotaFinal();
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaFinal() < m) {
                a = getNotas(i).getAlumno();
            }
        }
        return a;
    }

    public String mayorPromedio() {
        String a = lista.get(0).getAlumno();
        double m = lista.get(0).getNotaFinal();
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaFinal() > m) {
                a = getNotas(i).getAlumno();
            }
        }
        return a;
    }

    public int Reprobados() {
        int cont = 0;
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaFinal() >= 0 && getNotas(i).getNotaFinal() <= 10) {
                cont++;
            }
        }
        return cont;
    }

    public int Aprobados() {
        int cont = 0;
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaFinal() >= 11 && getNotas(i).getNotaFinal() <= 20) {
                cont++;
            }
        }
        return cont;
    }

}
