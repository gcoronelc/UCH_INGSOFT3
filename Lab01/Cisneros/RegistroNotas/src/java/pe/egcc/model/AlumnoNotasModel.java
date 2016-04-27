
package pe.egcc.model;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.AlumnoNotasDto;

public class AlumnoNotasModel {
     private List<AlumnoNotasDto> lista;

    public AlumnoNotasModel() {
         lista = new ArrayList<>();
    }


  public void agregarNota(AlumnoNotasDto dto) {  
      promediofinal(dto);
      lista.add(dto);    
  }

  public List<AlumnoNotasDto> getLista() {
      
    return lista;
  }

  public int promediopracticas(AlumnoNotasDto dto){
      int prom=0;
      if(dto.getP1()<=dto.getP2() && dto.getP1()<=dto.getP3() && dto.getP1()<=dto.getP4()){
          prom=(dto.getP2()+dto.getP3()+dto.getP4())/3;
      }else if(dto.getP2()<=dto.getP1() && dto.getP2()<=dto.getP3() && dto.getP2()<=dto.getP4()){
          prom=(dto.getP1()+dto.getP3()+dto.getP4())/3;
      }else if(dto.getP3()<=dto.getP1() && dto.getP3()<=dto.getP2() && dto.getP3()<=dto.getP4()){
          prom=(dto.getP1()+dto.getP2()+dto.getP4());
      }else{
          prom=(dto.getP1()+dto.getP2()+dto.getP3());
      }
      
      return prom;
  }
  
  public void promediofinal(AlumnoNotasDto dto){
      double prom=0;
      prom= promediopracticas(dto)*0.3+dto.getExparcial()*0.2+dto.getExfinal()*0.2+dto.getProyecto()*0.3;
      
      dto.setPromedio(prom);
  }
  
  public AlumnoNotasDto mayorpromedio(){
       if(lista.isEmpty()){
          return null;
      }
     AlumnoNotasDto mayor=lista.get(0);
     for (AlumnoNotasDto dto : lista) {
     if(mayor.getPromedio()<=dto.getPromedio()){
         mayor=dto;
     }
    }
      return mayor;
  }
  
    public AlumnoNotasDto menorpromedio(){
       if(lista.isEmpty()){
          return null;
      }
     AlumnoNotasDto menor=lista.get(0);
     for (AlumnoNotasDto dto : lista) {
     if(menor.getPromedio()>=dto.getPromedio()){
         menor=dto;
     }
    }
      return menor;
  }
    
    public int cantaprobados(){
       if(lista.isEmpty()){
          return 0;
      }
       int cant=0;
     for (AlumnoNotasDto dto : lista) {
     if(dto.getPromedio()>=11){
         cant=cant+1;
     }
    }
      return cant;
  }
    public int cantdesaprobados(){
       if(lista.isEmpty()){
          return 0;
      }
       int cant=0;
     for (AlumnoNotasDto dto : lista) {
     if(dto.getPromedio()<11){
         cant=cant+1;
     }
    }
      return cant;
  }
}
