import java.util.ArrayList;
import java.util.Collections;

public class OrdenaNumeros
{
  public static void main(String[] args)
  {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    lista.add(5); 
    lista.add(7); 
    lista.add(3);

    Collections.sort(lista);

    for (Integer numero: lista) {
        System.out.println(numero);
    }

  }
}