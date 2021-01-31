import empleado.Empleado;
import generador.generador;
import producto.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import producto.Producto;

/**
 * MiniSuper
 * 
 */
public class MiniSuper {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreEmpleado;
        String nombreProducto;
        Double precioProducto;
        int existenciaProducto;
        int opcion;
        generador generador = new generador();

        System.out.println("Ingresa el nombre del empleado: ");
        nombreEmpleado = entrada.next();

        Empleado Empleado = new Empleado(nombreEmpleado);

        generador.addProducto("Cheto", 12.00, 15); // Datos de prueba
        generador.addProducto("Papas", 17.00, 124); 
        generador.addProducto("Agua", 11.00, 543);
        generador.addProducto("Viagra", 16.00, 56);
        generador.addProducto("Bolsa", 20.00, 58);
        generador.addProducto("Maleta", 26.00, 456);
        generador.addProducto("Peleta", 67.00, 678); // Datos prueba

        do {
            System.out.println("------ MENU DE OPCIONES ------");
            System.out.println("Bienvenido: " + Empleado.nombre);
            System.out.println("Ingresa la opcion con los numeros del teclado correspondiente");
            System.out.println("Opcion 1: Listar productos");
            System.out.println("Opcion 2: Crear un nuevo producto");
            System.out.println("Opcion 3: Eliminar un producto");
            System.out.println("Opcion 4: Listar productos de MENOR a MAYOR precio");
            System.out.println("Opcion 5: Listar productos de MAYOR a MENOR precio");
            System.out.println("Opcion 6: Modificar precio de un producto");
            System.out.println("Opcion 7: Listar productos de MENOR a MAYOR existencia");
            System.out.println("Opcion 8: Listar productos de MAYOR a MENOR existencia");
            System.out.println("Opcion 9: Finalizar programa");

            System.out.println("Ingresa la opcion que quieras");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    if (generador.getProductos().size() <= 0) {
                        System.out.println("No tienes ningun articulo aún");
                    } else {
                        for (int i = 0; i < generador.getProductos().size(); i++) {
                            System.out.println("El nombre del producto es: "
                                    + generador.getProductos().get(i).nombreProducto + " tienen una existencia de: "
                                    + generador.getProductos().get(i).getExistencia()
                                    + " y tiene un costo individual de: $"
                                    + generador.getProductos().get(i).getPrecioProducto());

                        }
                    }

                    break;
                case 2:
                    System.out.println("Ingresa el nombre del producto");
                    nombreProducto = entrada.next();

                    System.out.println("Ingresa el precio del producto");
                    precioProducto = entrada.nextDouble();

                    System.out.println("Ingresa la existencia del producto");
                    existenciaProducto = entrada.nextInt();
                    generador.addProducto(nombreProducto, precioProducto, existenciaProducto);

                    break;

                case 3:
                    if (generador.getProductos().size() <= 0) {
                        System.out.println("No tienes ningun articulo aún");
                    } else {
                        int indice;
                        for (int i = 0; i < generador.getProductos().size(); i++) {
                            System.out.println("Nombre del producto: " + generador.getProductos().get(i).nombreProducto
                                    + " indice: " + i);
                        }

                        System.out.println("Ingresa el indice que deseas eliminar");
                        indice = entrada.nextInt();

                        generador.getProductos().remove(indice);
                    }
                    break;
                case 4:
                    ArrayList<Double> precios = generador.getPrecios();
                    Collections.sort(precios);
                    if (precios.size() <= 0) {
                        System.out.println("No hay productos que listar");
                    } else {
                        System.out.println("MENOR A MAYOR");
                        for (int i = 0; i < precios.size(); i++) {
                            System.out.println("Nombre del producto " + generador.getProductos().get(i).nombreProducto
                                    + " - Precio del producto: $" + precios.get(i));
                        }
                        precios.clear();
                    }

                    break;
                case 5:
                    ArrayList<Double> preciosMenor = generador.getPrecios();
                    Collections.sort(preciosMenor);
                    Collections.reverse(preciosMenor);
                    if (preciosMenor.size() <= 0) {
                        System.out.println("No hay productos que listar");
                    } else {
                        System.out.println("MAYOR A MENOR");
                        for (int i = 0; i < preciosMenor.size(); i++) {
                            System.out.println("Nombre del producto " + generador.getProductos().get(i).nombreProducto
                                    + " - Precio del producto: $" + preciosMenor.get(i));
                        }
                        preciosMenor.clear();
                    }
                    break;

                case 6:
                    if (generador.getProductos().size() <= 0) {
                        System.out.println("No tienes ningun articulo aún");
                    } else {
                        int indice;
                        double nuevoPrecio;
                        for (int i = 0; i < generador.getProductos().size(); i++) {
                            System.out.println("Nombre del producto: " + generador.getProductos().get(i).nombreProducto
                                    + " indice: " + i);
                        }
                        System.out.println("Ingresa el indice que deseas modificar el precio");
                        indice = entrada.nextInt();
                        System.out.println("Ingresa el nuevo precio del producto");
                        nuevoPrecio = entrada.nextDouble();
                        generador.getProductos().get(indice).setPrecioProducto(nuevoPrecio);
                    }

                    break;

                case 7:

                    ArrayList<Integer> existencias = generador.getExistencias();
                    Collections.sort(existencias);
                    if (existencias.size() <= 0) {
                        System.out.println("No hay productos que listar");
                    } else {
                        System.out.println("MENOR A MAYOR");
                        for (int i = 0; i < existencias.size(); i++) {
                            System.out.println("Nombre del producto " + generador.getProductos().get(i).nombreProducto
                                    + " - Existencia del producto: " + existencias.get(i));
                        }

                        existencias.clear();

                    }
                    break;

                case 8:
                    ArrayList<Integer> exitenciasMenor = generador.getExistencias();
                    Collections.sort(exitenciasMenor);
                    Collections.reverse(exitenciasMenor);
                    if (exitenciasMenor.size() <= 0) {
                        System.out.println("No hay productos que listar");
                    } else {
                        System.out.println("MAYOR A MENOR");
                        for (int i = 0; i < exitenciasMenor.size(); i++) {
                            System.out.println("Nombre del producto " + generador.getProductos().get(i).nombreProducto
                                    + " - Existencia del producto: " + exitenciasMenor.get(i));
                        }

                        exitenciasMenor.clear();

                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;

            }

        } while (opcion != 9);

        entrada.close();

    }
}