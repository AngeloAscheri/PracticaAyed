package ejercicio7;

import ejercicio3.Estudiante;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestArrayList {

    static ArrayList<Estudiante> listaEstudaintes = new ArrayList<Estudiante>();

    public static void inicializar(){
        Estudiante est1 = new Estudiante();
        est1.setNombre("nicolas");
        est1.setApellido("Guitierrez");
        est1.setEmail("nicolas@gmail.com");
        est1.setComision(22);
        est1.setDireccion("2 44");

        Estudiante est2 = new Estudiante();
        est2.setNombre("Lucas");
        est2.setApellido("Lopez");
        est2.setEmail("luca@gmail.com");
        est2.setComision(13);
        est2.setDireccion("3 54");

        Estudiante est3 = new Estudiante();
        est3.setNombre("Lucia");
        est3.setApellido("gonzales");
        est3.setEmail("lucia@gmail.com");
        est3.setComision(18);
        est3.setDireccion("9 34");

        listaEstudaintes.add(est1);
        listaEstudaintes.add(est2);
        listaEstudaintes.add(est3);
    }

    public static void incisoD() {

        ArrayList<Estudiante> listaCopia = (ArrayList<Estudiante>) listaEstudaintes.clone();

        System.out.println("Lista original:");
        for (Estudiante e : listaEstudaintes) {
            System.out.println(e.getNombre());
        }

        System.out.println("Lista copiada:");
        for (Estudiante e : listaCopia) {
            System.out.println(e.getNombre());
        }

        System.out.println("Modifico el nombre de Lucia por Ludmila en la lista original y vuelvo a listar");

        for (Estudiante e : listaEstudaintes) {
            if (e.getNombre() == "Lucia") {
                e.setNombre("Ludmila");
                break;
            }
        }

        System.out.println("Lista original:");
        for (Estudiante e : listaEstudaintes) {
            System.out.println(e.getNombre());
        }

        System.out.println("Lista copiada:");
        for (Estudiante e : listaCopia) {
            System.out.println(e.getNombre());
        }
    }

    public Estudiante incisoE(Estudiante e){

        if (!listaEstudaintes.contains(e));
        listaEstudaintes.add(e);

        return e;
    };

    //f)
    public boolean esCapicua(ArrayList<Integer> lista){

        ArrayList<Integer> listaInvertida = lista;
        Collections.reverse(listaInvertida);
        return lista.equals(listaInvertida);
    }


    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        /*
        System.out.println("Contenido de la lista:");

        for (Integer numero : lista) {
            System.out.println(numero);
        }*/

        //b)
        // El LinkedList es más eficiente en inserciones y eliminaciones en posiciones intermedias.
        // El LinkedList requiere mas memoria
        // El LinkedList se utiliza cuando se utilizaran getters o setters con mas frecuencia

        //c)
        // con un for convencional: for (int i = 0; i < ; i++)

        inicializar();
        incisoD();// El dato cambiado en la lista original tambien se cambio en la clonada.

        //el inciso E se realiza en el metodo incisoD(); ya que pedia crear la lista


        }


}
