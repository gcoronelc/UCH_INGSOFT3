
package pe.omv.model;

import java.util.ArrayList;
import java.util.List;
import pe.omv.dto.AlumnoDto;

public class AlumnoModel {
 private List<AlumnoDto> lista;

public AlumnoModel(){
    lista=new ArrayList<>();
}
public int getN(){
        return lista.size();
}

public List<AlumnoDto> getLista() {
        return lista;
    }

public AlumnoDto getAlumnoDto(int i){
        return lista.get(i);
 }

public void setLista(List<AlumnoDto> lista) {
        this.lista = lista;
}


public void promedioPracticasMax(AlumnoDto dto){
    double promedio;
     double redondeado;
    double menor;
    menor=dto.getPractica1();
    if(menor>dto.getPractica2()){
        menor=dto.getPractica2();
    }
    if(menor>dto.getPractica3()){
        menor=dto.getPractica3();
    }
    if(menor>dto.getPractica4()){
        menor=dto.getPractica4();
    }
   promedio=(dto.getPractica1()+dto.getPractica2()+dto.getPractica3()+dto.getPractica4()-menor)/3;
   redondeado=Math.rint(promedio);
   dto.setPropracticas(redondeado); 
  
    
}

public void promedioTotal(AlumnoDto d){
     double prom;
     double redondeado;
     double promFinal;
    double menor;
    menor=d.getPractica1();
    if(menor>d.getPractica2()){
        menor=d.getPractica2();
    }
    if(menor>d.getPractica3()){
        menor=d.getPractica3();
    }
    if(menor>d.getPractica4()){
        menor=d.getPractica4();
    }
   prom=(d.getPractica1()+d.getPractica2()+d.getPractica3()+d.getPractica4()-menor)/3;
   promFinal=(d.getExparcial()*0.2)+(d.getExfinal()*0.2)+(d.getProyecto()*0.3)+ (prom*0.3);
   redondeado=Math.rint(promFinal);
   d.setProttotal(redondeado);
   lista.add(d);
}

 public String PromedioMayor(){
        
        double m=lista.get(0).getProttotal();
        String nombre=lista.get(0).getNombre();
        for (int i = 0; i < getN(); i++) {
            if(getAlumnoDto(i).getProttotal()>m){
                m=getAlumnoDto(i).getProttotal();
                nombre=getAlumnoDto(i).getNombre();
            }
        }
        return m+" "+nombre;
  }
 
 
 public String PromedioMenor(){
       
        double m=lista.get(0).getProttotal();
        String nombre=lista.get(0).getNombre();
        for (int i = 0; i < getN(); i++) {
            if(getAlumnoDto(i).getProttotal()<m){
                m=getAlumnoDto(i).getProttotal();
                nombre=getAlumnoDto(i).getNombre();
            }
        }
        return m+" "+nombre;
    }
 
 public int Aprobados() {
        int cont = 0;
        for (int i = 0; i < getN(); i++) {
            if (getAlumnoDto(i).getProttotal()>= 11 && getAlumnoDto(i).getProttotal()<= 20) {
                cont++;
            }
        }
        return cont;
    }
 
 
  public int Desaprobados() {
        int cont = 0;
        for (int i = 0; i < getN(); i++) {
            if (getAlumnoDto(i).getProttotal()>=0 && getAlumnoDto(i).getProttotal()<=10) {
                cont++;
            }
        }
        return cont;
    }







    


 
}
