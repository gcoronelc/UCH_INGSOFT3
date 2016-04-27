/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.model;

import java.util.ArrayList;
import java.util.List;
import pe.dto.Practica;

/**
 *
 * @author user
 */
public class PracticaModel {
    private List<Practica> Listaprac;
    
    public PracticaModel(){
        
        Listaprac=new ArrayList<>();
        
    }
    
     public void agregarItem(Practica dto) {
         
         int menor=0;
        
         
         if(dto.getPrac1()<dto.getPrac2()&&dto.getPrac1()<dto.getPrac3()&&dto.getPrac1()<dto.getPrac4()){
             
             menor=dto.getPrac1();
             
          dto.setPromedio((dto.getPrac2()+dto.getPrac3()+dto.getPrac4())/3);
          
          dto.setResultado(dto.getPromedio()*0.3+dto.getParcial()*0.2+dto.getExamenFinal()*0.2+dto.getProyecto()*0.3);
             
          Listaprac.add(dto);
         }
         
         else if(dto.getPrac2()<dto.getPrac1()&&dto.getPrac2()<dto.getPrac3()&&dto.getPrac2()<dto.getPrac4()){
             
             menor=dto.getPrac2();
             
          dto.setPromedio((dto.getPrac1()+dto.getPrac3()+dto.getPrac4())/3);
                      dto.setResultado(dto.getPromedio()*0.3+dto.getParcial()*0.2+dto.getExamenFinal()*0.2+dto.getProyecto()*0.3);
 
          Listaprac.add(dto);
         }
            else if(dto.getPrac3()<dto.getPrac1()&&dto.getPrac3()<dto.getPrac2()&&dto.getPrac3()<dto.getPrac4()){
             
             menor=dto.getPrac3();
             
          dto.setPromedio((dto.getPrac2()+dto.getPrac1()+dto.getPrac4())/3);
                       dto.setResultado(dto.getPromedio()*0.3+dto.getParcial()*0.2+dto.getExamenFinal()*0.2+dto.getProyecto()*0.3);

          Listaprac.add(dto);
         }
            else{
                 menor=dto.getPrac4();
             
          dto.setPromedio((dto.getPrac2()+dto.getPrac1()+dto.getPrac3())/3);
                       dto.setResultado(dto.getPromedio()*0.3+dto.getParcial()*0.2+dto.getExamenFinal()*0.2+dto.getProyecto()*0.3);

          Listaprac.add(dto);
            }
         
  }
     
     
  public String mayorPromedio(){
      
      if(Listaprac.isEmpty()){
          return null;
      }
      
     Practica dto = Listaprac.get(0);
      for(Practica o:Listaprac){
          if(o.getResultado()>dto.getResultado()){
              dto=o;
          }
      }
      return dto.getNombre() +" "+dto.getResultado();
      
  }
     
      public String menorPromedio(){
      
      if(Listaprac.isEmpty()){
          return null;
      }
      
     Practica dto = Listaprac.get(0);
      for(Practica o:Listaprac){
          if(o.getResultado()<dto.getResultado()){
              dto=o;
          }
      }
      return dto.getNombre() + " "+dto.getResultado();
      
  }
    
      
      public int aprobados(){
          int contador=0;
          
            if(Listaprac.isEmpty()){
          return 0;
      }
      
     Practica dto = Listaprac.get(0);
      for(Practica o:Listaprac){
          if(o.getResultado()>=11){
              contador++;
          }
      }
          return contador;
          
      }
     public int desaprobados(){
          int contador=0;
          
            if(Listaprac.isEmpty()){
          return 0;
      }
      
     Practica dto = Listaprac.get(0);
      for(Practica o:Listaprac){
          if(o.getResultado()<11){
              contador++;
          }
      }
          return contador;
          
      }
    
      public List<Practica> getLista() {
    return Listaprac;
  }
    
    
}
