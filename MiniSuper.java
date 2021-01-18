import empleado.Empleado;
import generador.generador;
import producto.Producto;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String nombreEmpleado;
        String nombreProducto;
        Double precioProducto;
        int existenciaProducto;
        int opcion;
        generador generador = new generador();

        System.out.println("Ingresa el nombre del empleado: ");
        nombreEmpleado = entrada.next();

        Empleado Empleado = new Empleado(nombreEmpleado);

        do {
            System.out.println("------ MENU DE OPCIONES ------");

            System.out.println("Ingresa la opcion con los numeros del teclado correspondiente");
            System.out.println("Opcion 1: Listar productos");
            System.out.println("Opcion 2: Crear un nuevo producto");
            System.out.println("Opcion 3: Eliminar un producto");
            System.out.println("Opcion 4: Listar productos de mayor a menor precio");
            System.out.println("Opcion 5: Listar productos de menor a mayor precio");
            System.out.println("Opcion 6: Finalizar programa");

            System.out.println("Ingresa la opcion que quieras");
            opcion = entrada.nextInt();

            // generador.addProducto("Cheto", 12.00, 15);
            // generador.addProducto("Papas", 17.00, 18);
            // generador.addProducto("Agua", 11.00, 19);
            // generador.addProducto("Viagra", 16.00, 19);
            // generador.addProducto("Bolsa", 20.00, 19);
            // generador.addProducto("Maleta", 26.00, 19);
            // generador.addProducto("Peleta", 67.00, 19);

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
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;

            }

        } while (opcion != 6);

        // for (int i = 0; i < generador.getProductos().size(); i++) {
        // System.out.println("Nombre del producto: " +
        // generador.getProductos().get(i).nombreProducto);
        // System.out.println("Precio del producto: " +
        // generador.getProductos().get(i).precioProducto);
        // System.out.println("Existencia del producto: " +
        // generador.getProductos().get(i).existencia);
        // }

        // ArrayList<Double> precios = generador.getPrecios();

        // Collections.sort(precios);
        // for (int i = 0; i < precios.size(); i++) {
        // System.out.println("Precio del producto: $" + precios.get(i));
        // }

        // Producto chetos = new Producto("Chetto", 12.00, 15);
        // Producto papas = new Producto("Papas", 19.00, 10);
        // Producto pastel = new Producto("Pastel", 50.00, 4);
        // Producto agua = new Producto("Agua", 11.00, 50);

        // listaProductos.add(chetos);
        // listaProductos.add(papas);
        // listaProductos.add(pastel);
        // listaProductos.add(agua);

        // for (int i = 0; i < listaProductos.size(); i++) {
        // System.out.println("Producto: " + listaProductos.get(i).nombreProducto + "
        // tiene un precio de: $" + listaProductos.get(i).precioProducto + " y tiene una
        // existencia de: " + listaProductos.get(i).existencia);
        // }

        // System.out.println("El nombre del producto es: " + chetos.nombreProducto + "
        // tienen una existencia de: " + chetos.getExistencia() + " y tiene un costo
        // individual de: $" + chetos.getPrecioProducto());

    }
}