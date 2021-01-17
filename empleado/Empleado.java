package empleado;

public class Empleado {
    public String nombre;
    public float ventas;

    public Empleado(String nombre){
        this.nombre = nombre;
        this.ventas = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public double getVentas(){
        return ventas;
    }

    public void setVentas(float ventas){
        this.ventas = ventas;
    }

}
