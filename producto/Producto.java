package producto;
import java.util.Arrays;
import java.util.Date;

public class Producto {

    public String nombreProducto;
    public double precioProducto;
    public int existencia;

    public Producto(String nombreProducto, double precioProducto, int existencia) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.existencia = existencia;
    }
    
    public void setPrecioProducto(int precioProducto){
        this.precioProducto = precioProducto;
    }

    public void setExistencia(int numeroProductos) {
        this.existencia = numeroProductos;
    }

    public int getExistencia() {
        return this.existencia;
    }

    public double getPrecioProducto(){
        return this.precioProducto;
    }


    public int compareTo(Producto producto) {
        if (this.precioProducto < producto.precioProducto) {
            return -1;
        }
        if (this.precioProducto > producto.precioProducto){
            return 1;
        }

        return 0;
        
    }

}
