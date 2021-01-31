package generador;
import java.util.ArrayList;
import producto.Producto;

public class generador {
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    ArrayList<Double> precioProductos = new ArrayList<Double>();
    ArrayList<Integer> existenciaProductos = new ArrayList<Integer>();
    public void addProducto(String nombreProducto, Double precioProducto, int existenciaProducto) {
        Producto nuevoProducto = new Producto(nombreProducto, precioProducto, existenciaProducto);
        listaProductos.add(nuevoProducto);
    }

    public ArrayList<Producto> getProductos() {
        return listaProductos;
    }

    public ArrayList<Double> getPrecios(){
        for (int i = 0; i < listaProductos.size(); i++) {
            precioProductos.add(listaProductos.get(i).precioProducto);
        }
        return precioProductos;
    }

    public ArrayList<Integer> getExistencias(){
        for (int i = 0; i < listaProductos.size(); i++) {
            existenciaProductos.add(listaProductos.get(i).existencia);
        }
        return existenciaProductos;
    }
    
}
