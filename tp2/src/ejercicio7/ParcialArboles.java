/*Escribir en una clase ParcialArboles que contenga UNA ÚNICA variable de instancia de tipo
ejercicio1.BinaryTree de valores enteros NO repetidos y el método público con la siguiente firma:
public boolean isLeftTree (int num)
El método devuelve true si el subárbol cuya raíz es “num”, tiene en su subárbol izquierdo una
cantidad mayor estricta de árboles con un único hijo que en su subárbol derecho. Y false en caso
contrario. Consideraciones:
● Si “num” no se encuentra en el árbol, devuelve false.
● Si el árbol con raíz “num” no cuenta con una de sus ramas, considere que en esa rama hay
-1 árboles con único hijo.

Por ejemplo, con un árbol como se muestra en la siguiente imagen:
Si num = 7 devuelve true ya que en su rama izquierda hay 1 árbol con un único hijo (el árbol con raíz 23) y en
la rama derecha hay 0. (1 > 0) → true

Si num = 2 devuelve false, ya que en su rama izquierda hay 1 árbol con único hijo (árbol con raíz 23) y en la
rama derecha hay 3 (árboles con raíces -5, 19 y 4). (1 >3) → false)

Si num = -5 devuelve true, ya que en su rama izquierda
hay 2 árboles con único hijo (árboles con raíces 19 y 4) y al no tener rama derecha, tiene -1 árboles con un único
hijo. (2 > -1) → true

Si num = 19 debería devolver false, ya que al no tener
rama izquierda tiene -1 árboles con un único hijo y en su rama derecha hay 1 árbol con único hijo. (-1 > 1) → false

Si num = -3 debería devolver false, ya que al no tener
rama izquierda tiene -1 árboles con un único hijo y lo mismo sucede con su rama derecha. (-1 > -1 ) → false
 */
package ejercicio7;
import ejercicio1.BinaryTree;

public class ParcialArboles {

    public BinaryTree<Integer> arbol;

    public ParcialArboles (){
    }

    public void set (BinaryTree<Integer> a){
        arbol=a;
    }


    public boolean isLeftTree (int num){        
        if (arbol.isEmpty() || arbol.isLeaf()){
            return false;
        }
        BinaryTree <Integer> ArNum = buscarArbolNum(arbol, num);
        int cantIzq=0, cantDer=0;
        System.out.println(ArNum.getData());
        if (ArNum!=null){
            if (ArNum.hasLeftChild()){
                cantIzq=contar(ArNum.getLeftChild());                
            }else cantIzq=-1;
            if(ArNum.hasRightChild()){
                cantDer=contar(ArNum.getRightChild());
            }else cantDer=-1;
            if (cantIzq> cantDer)
                return true;
        }
        return false;
    }

    private int contar (BinaryTree<Integer>ar){
        int cant=0;
        if (ar.isLeaf())
            return 0;
        else {
            if (ar.hasLeftChild() && ar.hasRightChild()){
                cant+=contar(ar.getLeftChild());
                cant+=contar(ar.getRightChild());
            }else if (ar.hasLeftChild() && !ar.hasRightChild()){
                cant++;        
                cant+=contar(ar.getLeftChild());
            } else {
                cant++;
                cant+=contar(ar.getRightChild());
            }                
        }
        return cant;
    }
        private BinaryTree<Integer> buscarArbolNum(BinaryTree<Integer> a, int num) {
            if (a == null) {
                return null; // Si el árbol está vacío o el nodo no se encuentra
            }

            if (a.getData().equals(num)) {
                return a; // Si el nodo actual tiene el valor deseado, devolverlo
            }

            BinaryTree<Integer> resultadoIzquierdo = buscarArbolNum(a.getLeftChild(), num);
            if (resultadoIzquierdo != null) {
                return resultadoIzquierdo; // Si se encuentra en el subárbol izquierdo, devolverlo
            }

            return buscarArbolNum(a.getRightChild(), num); // Buscar en el subárbol derecho
    }
}

    /* 
    private void BuscarArbolNum(BinaryTree<Integer> a,BinaryTree<Integer> ar, int num){
        if (a.getData().equals(num)){
            ar=a;
        }
        if (a.hasLeftChild()){
            BuscarArbolNum(a.getLeftChild(),ar,num);            
        }
        if (a.hasRightChild()){
            BuscarArbolNum(a.getRightChild(),ar,num);
        }
    }             no funciona, tengo duda si el parametro se pasa x valor o referencia. */




    





