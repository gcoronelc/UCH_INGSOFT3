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
    lista.add(dto);
  }

  public List<ItemDto> getLista() {
    return lista;
  }
  
  public String mayorPrecio() {
       String nombre="";
     double mayor=0.0;
     for (ItemDto dto : lista) {
        if(dto.getPrecio() > mayor){
            mayor = dto.getPrecio();
            nombre=dto.getProducto();
        }
     }
     return nombre;
  } 
  
  public String menorPrecio() {
      String nombre="";
     double menor=10000;
     for (ItemDto dto : lista) {
        if(dto.getPrecio() < menor){
            menor = dto.getPrecio();
            nombre=dto.getProducto();
        }
     }
     return nombre;
  } 
  
  public double getTotal(){
    double total = 0.0;
    for (ItemDto dto : lista) {
      total += dto.getImporte();
    }
    return total;
  }
  
   
  public String getMasVendido(){
      int cantCa=0;
      int cantPa=0;
      int cantPo=0;
      int cantCas=0;
      int masVendido=0;
      String nombre="";
      for (ItemDto dto: lista){
          if (dto.getProducto().equals("CAMISA")){
              cantCa+=dto.getCant();
          }
          if (dto.getProducto().equals("PANTALON")){
              cantPa+=dto.getCant();
          }
          if (dto.getProducto().equals("POLO")){
              cantPo+=dto.getCant();
          }
          if (dto.getProducto().equals("CASACA")){
              cantCas+=dto.getCant();
          }
      }
        if(cantCa > masVendido){
            masVendido = cantCa;
            nombre="CAMISA";
        }if(cantPa>masVendido){
            masVendido=cantPa;
            nombre="PANTALON";
        }if(cantPo>masVendido){
            masVendido=cantPo;
            nombre="POLO";
        }if(cantCas>masVendido){
            masVendido=cantCas;
            nombre="CASACA";
        }
      
        return nombre;
  }
  
  public String getMenosVendido(){
      String nombre="";
      int menosVendido=1000;
      int cantCa=0;
      int cantPa=0;
      int cantPo=0;
      int cantCas=0;
      for (ItemDto dto: lista){
          if (dto.getProducto().equals("CAMISA")){
              cantCa+=dto.getCant();
          }
          if (dto.getProducto().equals("PANTALON")){
              cantPa+=dto.getCant();
          }
          if (dto.getProducto().equals("POLO")){
              cantPo+=dto.getCant();
          }
          if (dto.getProducto().equals("CASACA")){
              cantCas+=dto.getCant();
          }
      }
        if(cantCa < menosVendido && cantCa>0){
            menosVendido = cantCa;
            nombre="CAMISA";
        }if(cantPa<menosVendido && cantPa>0){
            menosVendido=cantPa;
            nombre="PANTALON";
        }if(cantPo<menosVendido && cantPo>0){
            menosVendido=cantPo;
            nombre="POLO";
        }if(cantCas<menosVendido && cantCas>0){
            menosVendido=cantCas;
            nombre="CASACA";
        }
      
        return nombre;
  }

}
