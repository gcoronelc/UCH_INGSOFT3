package pe.egcc.model;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.NotaDto;

public class NotaModel {

  private List<NotaDto> lista;

  public NotaModel() {
    lista = new ArrayList<>();
  }

  public void agregarItem(NotaDto dto) {
     dto.setProm(CalcularPromedio(dto));
    lista.add(dto);
  }

  public List<NotaDto> getLista() {
    return lista;
  }
  public NotaDto mayorPromedio(){
      if(lista.isEmpty()){
          return null;
      }
      NotaDto dto= lista.get(0);
      for (NotaDto dt : lista) {
          
            if(dt.getProm()> dto.getProm()){
               dto=dt;
            }
            }
      
     return dto; 
  }

 public NotaDto menorPromedio(){
      if(lista.isEmpty()){
          return null;
      }
      NotaDto dto= lista.get(0);
      for (NotaDto dt : lista) {
          
            if(dt.getProm()<dto.getProm()){
               dto=dt;
            }
            }
      
     return dto; 
  }
 
 
  public int aprobados(){
      if(lista.isEmpty()){
          return 0;
      }
      int a=0;
      for (NotaDto dt : lista) {
          
            if(dt.getProm()>=10.5 ){
              a++;
            }
            }
      
     return a; 
  }
  
   public int desaprobados(){
      if(lista.isEmpty()){
          return 0;
      }
      int a=0;
      for (NotaDto dt : lista) {
          
            if(dt.getProm()<10.5 ){
              a++;
            }
            }
      
     return a; 
  } 
/*  
 public String mayorPromedio(){
      
      NotaDto dto= lista.get(0);
      for (NotaDto dt : lista) {
          
            if(dt.getProm()> dto.getProm()){
               dto=dt;
            }
            }
      
     return dto.getAlumno(); 
  }

 public String menorPromedio(){
      
      NotaDto dto= lista.get(0);
      for (NotaDto dt : lista) {
          
            if(dt.getProm()<dto.getProm()){
               dto=dt;
            }
            }
      
     return dto.getAlumno(); 
  }
 
 
  public int aprobados(){
      
      int a=0;
      for (NotaDto dt : lista) {
          
            if(dt.getProm()>=10.5 ){
              a++;
            }
            }
      
     return a; 
  }
  
   public int desaprobados(){
      
      int a=0;
      for (NotaDto dt : lista) {
          
            if(dt.getProm()<10.5 ){
              a++;
            }
            }
      
     return a; 
  }
   
*/   
   public double CalcularPromedio(NotaDto d){
       double prom=0;
//nota menor
    if(d.getN1()<=d.getN2() && d.getN1()<=d.getN3() && d.getN1()<=d.getN4() ){
        prom = ((d.getN2()+d.getN3()+d.getN4())/3)*0.3+d.getExparcial()*0.2 + d.getExfinal()*0.2+d.getProyecto()*0.3;
    }
    if(d.getN2()<=d.getN1() && d.getN2()<=d.getN3() && d.getN2()<=d.getN4() ){
          prom = ((d.getN1()+d.getN3()+d.getN4())/3)*0.3+d.getExparcial()*0.2 + d.getExfinal()*0.2+ d.getProyecto()*0.3;
    }
    if(d.getN3()<=d.getN1() && d.getN3()<=d.getN2() && d.getN3()<=d.getN4() ){
          prom = ((d.getN2()+d.getN1()+d.getN4())/3)*0.3+d.getExparcial()*0.2 + d.getExfinal()*0.2+ d.getProyecto()*0.3;
    }
    if(d.getN4()<=d.getN1() && d.getN4()<=d.getN2() && d.getN4()<=d.getN3() ){
          prom = ((d.getN2()+d.getN3()+d.getN1())/3)*0.3+d.getExparcial()*0.2 + d.getExfinal()*0.2+ d.getProyecto()*0.3;
    }
    
    return prom;
   }
  
}
