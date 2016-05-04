/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.jads.uch.model;

import java.util.ArrayList;
import java.util.List;
import pe.jads.uch.dto.*;

/**
 *
 * @author Familia Diaz
 */
public class notasModel {
    
    
    private List<notasDto> lista;
    
    
    public notasModel() {
        lista = new ArrayList<>();
    }

    public notasDto getNotas(int i) {
        return lista.get(i);
    }

    public notasDto getNotas() {
        return lista.get(0);
    }

    public int getN() {
        return lista.size();
    }
     public List<notasDto> getLista() {
        return lista;
    }

    public void agregarNota(notasDto dto) {
        dto.setPromedio(PromedioP(dto));
        dto.setNotaF(NotaF(dto));
        dto.setCant(getN()+1);
        lista.add(dto);
    }
    
    
    /*Codigo:https://www.youtube.com/watch?v=GBTWvrLJKj0*/
    
    public double PromedioP(notasDto dto) {
        double pro = 0;
        double n1, n2, n3, n4;
        n1 = dto.getNotas().getN1();
        n2 = dto.getNotas().getN2();
        n3 = dto.getNotas().getN3();
        n4 = dto.getNotas().getN4();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            pro = (n2 + n3 + n4) / 3;
        } else if (n2 < n1 && n2 < n3 && n2 < n4) {
            pro = (n1 + n3 + n4) / 3;
        } else if (n3 < n1 && n3 < n2 && n3 < n4) {
            pro = (n1 + n2 + n4) / 3;
        } else if (n4 < n1 && n4 < n2 && n4 < n3) {
            pro = (n1 + n2 + n3) / 3;
        }
        return Math.round(pro);
    }

    public double NotaF(notasDto dto) {
        double p = 0;
        p = ( (dto.getPromedio()) * 0.3) + (dto.getParcial() * 0.2) + (dto.getExamenF()* 0.2) + (dto.getProyecto() * 0.3);
        return Math.round(p);
    }

    public String menorPromedio() {
        String a = lista.get(0).getAlumno();
        double m = lista.get(0).getNotaF();
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaF() < m) {
                a = getNotas(i).getAlumno();
            }
        }
        return a;
    }

    public String mayorPromedio() {
        String a = lista.get(0).getAlumno();
        double m = lista.get(0).getNotaF();
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaF() > m) {
                a = getNotas(i).getAlumno();
            }
        }
        return a;
    }

    public int Reprobados() {
        int cont = 0;
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaF() >= 0 && getNotas(i).getNotaF() <= 10) {
                cont++;
            }
        }
        return cont;
    }

    public int Aprobados() {
        int cont = 0;
        for (int i = 0; i < getN(); i++) {
            if (getNotas(i).getNotaF() >= 11 && getNotas(i).getNotaF() <= 20) {
                cont++;
            }
        }
        return cont;
    }
}
