public class Ordenes {

    private int idOrden=999;
    private int cantProducto = 0;
    private final int maxProductos = 10;
    private Producto[] productos;
    private double totalOrden = 0;

    public Ordenes() {
        this.idOrden++;
        this.productos = new Producto[maxProductos];
    }

    
    public void agregarProducto(Producto producto) {
        productos[cantProducto] = producto;
        cantProducto++;
    
    }

    public double calcularTotal(){
        totalOrden = 0;
        for (int i = 0; i < cantProducto; i++) {
            totalOrden += productos[i].getPrecio();
        }

        return totalOrden;
    }

    public void mostrarOrden(){
        System.out.println("Orden: " + idOrden);
        
  
        for (int i = 0; i < cantProducto; i++) {
            System.out.println("ID: " + productos[i].getIdProducto() + " | Producto: " + 
            productos[i].getNombre() + " | Precio: " + productos[i].getPrecio());
            
        }
        System.out.println("Calculo Total: " + calcularTotal());
    }
}
