public class Producto {
    private static int CantProducto ;
    private static int contador = 99;
    private int idProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++contador;
        CantProducto++;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getIdProducto() {
        return idProducto;
    }
    @Override
    public String toString() {
        return "Producto [CantProducto=" + CantProducto + ", idProducto=" + idProducto + ", nombre=" + nombre
                + ", precio=" + precio + "]";
    }

    


}
    

    

    

