
package ud4.carritocompra;

/**
 *
 * @author cic
 */
public class Carrito {
    private Producto[] productos;
    private int contProductos;

    public Carrito( int contProductosMax) {
        this.productos = new Producto[contProductosMax];
        this.contProductos = 0;
    }
    
    public double obtenerPrecio(){
        double total=0;
        for (int i=0; i<contProductos;i++){
            total+= productos[i].getPrecio();
        }
        return total;
    }
    
    public void insertar(Producto producto){
        if (contProductos <productos.length){
            productos[contProductos]=producto;
            contProductos++;
        }
        else System.out.println("No se pueden insertar más registros");
    }
    
    public void borrar(Producto producto){
          boolean encontrado = false;
        for (int i = 0; (i < contProductos && !encontrado); i++) {
            if (productos[i].equals(producto)) {
                for (int j = i; j < contProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                contProductos--;
                encontrado = true;
                System.out.println("Se ha eliminado el producto " + producto);
            }
        }
        if (!encontrado) {
            System.out.println("no se ha encontrado el producto a eliminar " + producto);
        }
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getContProductos() {
        return contProductos;
    }
    
    
}
