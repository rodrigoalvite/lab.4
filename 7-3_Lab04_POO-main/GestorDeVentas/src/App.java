public class App {
    public static void main(String[] args) throws Exception {

        Producto producto = new Producto("Pizza: ", 23);
        //System.out.println(producto);
        var producto2 = new Producto("Pantene: ", 4);
        var producto3 = new Producto("Remera", 10);
        var producto4 = new Producto("papas", 2);
        var producto5 = new Producto("tele", 60);
        var producto6 = new Producto("celular", 50);
        var producto7 = new Producto("skins", 10);
        var producto8 = new Producto("juegos", 7);
        var producto9 = new Producto("pantalon", 10);
        var producto10 = new Producto("helado", 5);

        //System.out.println(producto2.toString());

        Ordenes ordenes = new Ordenes();
        
        ordenes.agregarProducto(producto);
        ordenes.agregarProducto(producto2);
        ordenes.agregarProducto(producto3);
        ordenes.agregarProducto(producto4);
        ordenes.agregarProducto(producto5);
        ordenes.agregarProducto(producto6);
        ordenes.agregarProducto(producto7);
        ordenes.agregarProducto(producto8);
        ordenes.agregarProducto(producto9);
        ordenes.agregarProducto(producto10); 
        ordenes.mostrarOrden();
        
    
    }
}
