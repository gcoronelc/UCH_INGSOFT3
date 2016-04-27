package pe.egcc.model;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.ItemDto;

public class CarritoModel {

  private List<ItemDto> lista;

  public CarritoModel() {
    lista = new ArrayList<>();
    
  }

  public void agregarItem(ItemDto dto) {
    dto.setImporte(dto.getPrecio() * dto.getCant());
        getLista().add(dto);
  }

  public List<ItemDto> getLista() {
    return lista;
  }
  
  public double getTotal(){
    double total = 0.0;
    for (ItemDto dto : getLista()) {
      total += dto.getImporte();
    }
    return total;
  }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<ItemDto> lista) {
        this.lista = lista;
    }
  public double mayorPrecio(){
      double mayor=0.0;
      for(ItemDto dto: lista){
          if(dto.getPrecio()>mayor){
              mayor=dto.getPrecio();
          }
      }
  
  return mayor;
  }
  public double menorPrecio(){
      double menor=mayorPrecio();
      for(ItemDto dto: lista){
          if(dto.getPrecio()<menor){
              menor=dto.getPrecio();
          }
      }
  
  return menor;
  }
    public String masVendido(){
        int suma=0;
        if(lista.size()==0){
            return null;
        }
        ItemDto dto=lista.get(0);
            for(ItemDto obj:lista){
                if(obj.getCant()>dto.getCant() && !obj.getProducto().equals(dto.getProducto())){
                    dto=obj;
                    
                
                }else{
                    suma=obj.getCant()+dto.getCant();
                    if(suma>dto.getCant()){
                        dto=obj;
                    }
                }
                    
                }
            return dto.getProducto();
            }
        
public String menosVendido(){
       int suma=0;
        if(lista.size()==0){
            return null;
        }
        ItemDto dto=lista.get(0);
            for(ItemDto obj:lista){
                if(obj.getCant()<dto.getCant() && !obj.getProducto().equals(dto.getProducto())){
                    suma=obj.getCant()+dto.getCant();
                    
                }if(suma<dto.getCant()){
                     dto=obj;
                        
                                  
                    
                }else{
                    dto=obj;
                }
                    
                }
            return dto.getProducto();
}
}
    
    
    
    
