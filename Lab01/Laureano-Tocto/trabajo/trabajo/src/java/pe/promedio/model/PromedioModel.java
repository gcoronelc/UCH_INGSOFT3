
package pe.promedio.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pe.promedio.dto.NotasDto;

public class PromedioModel {
      private List<NotasDto> lista;

  public PromedioModel() {
    lista = new ArrayList<>();
  }

  public void agregarNota(NotasDto dto) {
    double[] a = new double[]{dto.getNota1(), dto.getNota2(), dto.getNota3(), dto.getNota4()};
    Arrays.sort(a);
    double max1 = a[a.length - 1];
    double max2 = a[a.length - 2];
    double max3 = a[a.length - 3];
    double prom1 = ((max1+max2+max3)/3)*0.3;
    double prom2 =  dto.getExaparcial()*0.2;
    double prom3 =  dto.getExafinal()*0.2;
    double prom4 = dto.getProyecto()*0.3;
    dto.setPromedio(prom1+prom2+prom3+prom4);
    
    lista.add(dto);
  }

  public List<NotasDto> getLista() {
    return lista;
  }
  
  
   public NotasDto getMayorPromedio(){
       if(lista.isEmpty()){
       return null;
        }
       NotasDto dto= lista.get(0);
       for(NotasDto obj:lista){
           if(obj.getPromedio()>dto.getPromedio()){
               dto=obj;
           }
       }
       return dto;
   }
   
   
   
      public NotasDto getMenorPromedio(){
       if(lista.isEmpty()){
       return null;
   }
       NotasDto dto= lista.get(0);
       for(NotasDto obj:lista){
           if(obj.getPromedio()<dto.getPromedio()){
               dto=obj;
           }
       }
       return dto;
   }
      
      
   
   public int getAprobado(){
       if(lista.isEmpty()){
       return 0;
   }
       int cant = 0;
       for(NotasDto obj:lista){
           if(obj.getPromedio()>10){
               cant++;
           }
       }
       return cant;
   }
      
 public int getDesaprobado(){
       if(lista.isEmpty()){
       return 0;
        }
      int cant = 0;
       for(NotasDto obj:lista){
           if(obj.getPromedio()<=10){
               cant++;
           }
       }
       return cant;
   }
}
