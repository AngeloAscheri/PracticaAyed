import javax.naming.BinaryRefAddr;
import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {

    BinaryTree<Integer> arbolBinario;

    public List<Integer> numeroParesInorden(){
            List<Integer> lista = new ArrayList<Integer>();
            listarParesInorden(lista, arbolBinario);

    return lista;
    }

    public List<Integer> numeroParesPostorden() {
        List<Integer> lista = new ArrayList<Integer>();
        listarParesPostorden(lista, arbolBinario);
        return lista;
    }


    private void listarParesInorden(List <Integer> l, BinaryTree<Integer> a){

        if (a.hasLeftChild()){
            listarParesInorden(l, a.getLeftChild());
        }
        if (!a.isEmpty() && a.getData()%2 ==0){
            l.add(a.getData());
        }
        if (a.hasRightChild()){
            listarParesInorden(l,a.getRightChild());
        }

    }

    private void listarParesPostorden(List<Integer> l, BinaryTree<Integer> a){
        if (a.hasLeftChild()){
            listarParesPostorden(l, a.getLeftChild());
        }
        if (a.hasRightChild()){
            listarParesPostorden(l,a.getRightChild());
        }
        if (!a.isEmpty() && a.getData()%2 ==0) {
            l.add(a.getData());
        }
    }










}
