package pe.egcc.dto;

public class ItemDto {

  private String cliente;
  private double precio;
  private int cant;
  private double importe;
  private String articulo;

  public ItemDto() {
  }

    public ItemDto(String cliente, double precio, int cant, double importe, String articulo) {
        this.cliente = cliente;
        this.precio = precio;
        this.cant = cant;
        this.importe = importe;
        this.articulo = articulo;
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

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
  
}
