public class Producto {
    private static int CantProducto ;//cuenta los productos que se crearon
    private static int contador = 99;//sirve para generar ids automáticos
    private int idProducto;//id único de cada producto
    private String nombre;//nombre del producto
    private double precio;//precio del producto

    public Producto(String nombre, double precio) {
        this.nombre = nombre; //guarda nombre
        this.precio = precio; //guarda precio
        this.idProducto = ++contador;//genera id automático
        CantProducto++;//aumenta la cantidad total de productos
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

    //Devuelve el producto en formato texto y Sirve para imprimirlo fácilmente
    @Override
    public String toString() {
        return "Producto [CantProducto=" + CantProducto + ", idProducto=" + idProducto + ", nombre=" + nombre
                + ", precio=" + precio + "]";
    }

    


}
    

    

    

