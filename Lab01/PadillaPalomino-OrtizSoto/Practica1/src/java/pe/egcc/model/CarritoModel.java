package pe.egcc.model;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.ItemDto;

public class CarritoModel {

  private List<ItemDto> lista;
  private List<ItemDto> listaMayor;
  private List<ItemDto> listaMenor;

  public CarritoModel() {
    lista = new ArrayList<>();
    listaMayor = new ArrayList<>();
    listaMenor = new ArrayList<>();
  }
  
  
  
  public void agregarItem(ItemDto dto) {
    
    float vector[] = {dto.getP1(),dto.getP2(),dto.getP3(),dto.getP4()};
    float menor=vector[0]; //menor
    float promedioPracticas;
    float promedioFinal;
    
    for(int i=1; i<vector.length; i++){
        if (vector[i]<=menor){
            menor = vector[i];
        }
    }
    
    promedioPracticas = (dto.getP1()+dto.getP2()+dto.getP3()+dto.getP4()-menor)/3;
    
    promedioFinal = (promedioPracticas*30/100) + (dto.getEp()*20/100) + (dto.getEf()*20/100) + (dto.getProy()*30/100) ;
    
    
    
    dto.setPromedio(promedioFinal);
    
    if(promedioFinal>=10.5)
    {
        dto.setAprobado(true);
    }else
    {
        dto.setAprobado(false);
    }
    
    lista.add(dto);
    agregarMayor();
    agregarMenor();
  }
  
  public List<ItemDto> getLista() {
    return lista;
  }
  
  public List<ItemDto> getListaMayor() {
    return listaMayor;
  }
  
  public List<ItemDto> getListaMenor() {
    return listaMenor;
  }
  
  public double getTotal(){
    return 0;
  }
  
  public void agregarMayor()
  {
      listaMayor.clear();
      ItemDto mayor = lista.get(0);
      
      for(ItemDto dto:lista)
      {
          if(mayor.getPromedio() <= dto.getPromedio())
          {
              mayor = dto;
          }
      }
      
      listaMayor.add(mayor);
  }
  
  public void agregarMenor()
  {
      listaMenor.clear();
      ItemDto menor = lista.get(0);
      
      for(ItemDto dto:lista)
      {
          if(menor.getPromedio() >= dto.getPromedio())
          {
              menor = dto;
          }
      }
      
      listaMenor.add(menor);
  }
  
  public int getCantidadAprobados()
  {
      int n = 0;
      for(ItemDto dto:lista)
      {
          if(dto.isAprobado())
          {
              n++;
          }
      }
      return n;
  }
  
  public int getCantidadDesaprobados()
  {
      int n = 0;
      for(ItemDto dto:lista)
      {
          if(!dto.isAprobado())
          {
              n++;
          }
      }
      return n;
  }
  
}
