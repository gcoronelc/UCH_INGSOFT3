package pe.uch.Model;

import java.util.ArrayList;
import java.util.List;
import pe.uch.Dto.NotaDto;

public class NotaModel {

  private List<NotaDto> lista;
  private List<NotaDto> listaAprobados;
  private List<NotaDto> listaDesaprobados;

  public NotaModel() {
    lista = new ArrayList<>();
    listaAprobados = new ArrayList<>();
    listaDesaprobados = new ArrayList<>();
  }

  public void agregarNotas(NotaDto dto) {
      int proprac = 0;
      proprac = (dto.getPrac01() + dto.getPrac02() + dto.getPrac03() + dto.getPrac04())/4;
    dto.setPromedio((proprac + dto.getExafin() + dto.getExapar() + dto.getProyecto())/4);
    lista.add(dto);
  }

  public List<NotaDto> getListaNotas() {
    return lista;
  }
   public NotaDto getMayorPromedio(){
       if(lista.isEmpty()){
           return null;                  
       }
       NotaDto dto = lista.get(0);
       for(NotaDto obj : lista){
           if(obj.getPromedio()> dto.getPromedio()){
               dto = obj;
           }
       }
       return dto;
   }
      public NotaDto getMenorPromedio(){
        if(lista.isEmpty()){
           return null;                  
       }
       NotaDto dto = lista.get(0);
       for(NotaDto obj : lista){
           if(obj.getPromedio()< dto.getPromedio()){
               dto = obj;
           }
       }
       return dto;
   }
      
   public List<NotaDto> getEstudianteAprobado(){
       if(lista.isEmpty()){
           return null;                  
       }
       for(int i=0; i<lista.size();i++){
           NotaDto dto = lista.get(i);
           if(dto.getPromedio() >= 11){
               listaAprobados.add(dto);
           }           
       }   
       return listaAprobados;
   }
   public List<NotaDto> getEstudianteDesaprobados(){
       if(lista.isEmpty()){
           return null;                  
       }       
       for(int i=0; i<lista.size();i++){
           NotaDto dto = lista.get(i);
           if(dto.getPromedio() < 11){
               listaDesaprobados.add(dto);
           }           
       }       
       return listaDesaprobados;
   }
          
                   /* public NotaDto getMayorVenta(){
       if(lista.isEmpty()){
           return null;                  
       }
       NotaDto dto = lista.get(0);
       for(NotaDto obj : lista){
           if(obj.getCant()> dto.getCant()){
               dto = obj;
           }
       }
       return dto;
   }*/
      

//  public void mayorprecio(NotaDto dto){
//      
//      
////  }
//  public double getMayorPrecio(){
//      int contMp=0;
//      for(NotaDto dto : lista){
//          if("platano".equals(dto.getProducto())){
//              conMp += 
//          }
//      return contMp;        
//      }
//  }

}
