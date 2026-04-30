public class Ordenes {

    private int idOrden=999;
    private int cantProducto = 0;
    private final int maxProductos = 10;
    private Producto[] productos;
    private double totalOrden = 0;

    //Crea el array para guardar productos. maximo 10
    public Ordenes() {
        this.idOrden++;
        this.productos = new Producto[maxProductos];
    }

    //No controla si se supera el máximo de productos, podría dar error
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

    //muestra el numero de orden
    public void mostrarOrden(){
        System.out.println("Orden: " + idOrden);
        

        //recorre todo y te muestra el id nombre y precio
        for (int i = 0; i < cantProducto; i++) {
            System.out.println("ID: " + productos[i].getIdProducto() + " | Producto: " + 
            productos[i].getNombre() + " | Precio: " + productos[i].getPrecio());
            
        }
        //Llama al método anterior y muestra el total
        System.out.println("Calculo Total: " + calcularTotal());
    }
}
