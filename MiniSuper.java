import empleado.Empleado;
import producto.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import productos.Productos;
import producto.Producto;

/**
 * MiniSuper
 * 
 */
public class MiniSuper {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();


        int opcion;

        System.out.println("------ MENU DE OPCIONES ------");
        System.out.println("Ingresa la opcion con los numeros del teclado correspondiente");
        System.out.println("Opcion 1: Listar productos");
        System.out.println("Opcion 2: Listar productos de mayor a menor existencia");
        System.out.println("Opcion 3: Listar productos de menor a mayor existencia");
        System.out.println("Opcion 4: Crear un nuevo producto");
        
        // System.out.println("Ingresa la opcion que quieras");
        // opcion = entrada.nextInt();
        
        Producto chetos = new Producto("Chetto", 12.00, 15);
        Producto papas = new Producto("Papas", 19.00, 10);
        Producto pastel = new Producto("Pastel", 50.00, 4);
        Producto agua = new Producto("Agua", 11.00, 50);

        listaProductos.add(chetos);
        listaProductos.add(papas);
        listaProductos.add(pastel);
        listaProductos.add(agua);


        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println("Producto: "  + listaProductos.get(i).nombreProducto + " tiene un precio de: $" + listaProductos.get(i).precioProducto + " y tiene una existencia de: " + listaProductos.get(i).existencia);
        }

        // System.out.println("El nombre del producto es: " + chetos.nombreProducto + " tienen una existencia de: " + chetos.getExistencia() + " y tiene un costo individual de: $" + chetos.getPrecioProducto());

    }
}