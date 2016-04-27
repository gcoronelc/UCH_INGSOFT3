package pe.egcc.dto;

public class ItemDto {

    private String cliente;
    private String articulo;
    private double precio;
    private int cant;
    private double importe;

    public ItemDto(String cliente, String articulo, double precio, int cant, double importe) {
        this.cliente = cliente;
        this.articulo = articulo;
        this.precio = precio;
        this.cant = cant;
        this.importe = importe;
    }

      
   
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
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
