package pe.egcc.dto;

public class ItemDto {

  private String producto;
  private String cliente;
  private double precio;
  private int cant;
  private double importe;
  
    public ItemDto(String producto, String cliente, double precio, int cant, double importe ) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.cant = cant;
        this.importe = importe;
        
        
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
  
  