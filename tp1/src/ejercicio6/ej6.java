package ejercicio6;

public class ej6 {

    /*

    //Análisis de las estructuras de listas provistas por la API de Java.
    //a. ¿En qué casos ArrayList ofrece un mejor rendimiento que LinkedList?
    //b. ¿Cuándo LinkedList puede ser más eficiente que ArrayList?
    //c. ¿Qué diferencia encuentra en el uso de la memoria en ArrayList y LinkedList?
    //d. ¿En qué casos sería preferible usar un ArrayList o un LinkedList?

    a. ArrayList vs. LinkedList: Rendimiento

    ArrayList:
    Ofrece un mejor rendimiento en acceso aleatorio (consultar elementos por índice).
    Los elementos se almacenan en un array dinámico, lo que permite un acceso rápido mediante índices.
    Ideal para operaciones como get(index), set(index, value) y size().
    Desventaja: La inserción o eliminación de elementos en posiciones intermedias es costosa, ya que requiere desplazar los elementos restantes.

    LinkedList:
    Es más eficiente en inserciones y eliminaciones en posiciones intermedias.
    Cada elemento tiene una referencia al siguiente y al anterior, lo que facilita la inserción y eliminación.
    Ideal para operaciones como addFirst(value), addLast(value) y removeFirst().
    Desventaja: El acceso aleatorio es más lento, ya que se debe recorrer la lista desde el principio o el final.

    b. LinkedList vs. ArrayList: Eficiencia
    LinkedList puede ser más eficiente que ArrayList en los siguientes casos:
    Cuando necesitas realizar inserciones o eliminaciones frecuentes en posiciones intermedias de la lista.
    Cuando la lista se modifica con mayor frecuencia que las operaciones de acceso.
    Por ejemplo, en una cola o una pila, donde las inserciones y eliminaciones son comunes.

    c. Uso de Memoria:
    ArrayList:
    Requiere menos memoria en general.
    Almacena los elementos en un array contiguo.
    No necesita referencias adicionales entre elementos.
    LinkedList:
    Requiere más memoria debido a las referencias adicionales entre nodos.
    Cada nodo tiene dos referencias (siguiente y anterior).
    Idealmente, se utiliza cuando la eficiencia en el uso de memoria no es crítica.

    d. Preferencias:
    ArrayList:
    Úsalo cuando necesites acceso rápido por índice y no realices muchas inserciones/eliminaciones.
    Bueno para listas que no cambian con frecuencia.
    LinkedList:
    Úsalo cuando las operaciones de inserción/eliminación son frecuentes.
    Ideal para implementar colas, pilas o listas doblemente enlazadas.


     */


}
