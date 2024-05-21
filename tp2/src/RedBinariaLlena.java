public class RedBinariaLlena {

    public BinaryTree<Integer> arbolBinario;

    public void setArbol(BinaryTree<Integer> a){
        this.arbolBinario=a;
    }


    private int retardoReenvio2(BinaryTree<Integer> arbol) {
		int retardoIzquierda = 0; int retardoDerecha = 0;
		if (arbol.isLeaf()) 
			return arbol.getData();
		else {
			if (arbol.hasLeftChild()) {
				retardoIzquierda += retardoReenvio(arbol.getLeftChild());
			}
			if (arbol.hasRightChild()) {
				retardoDerecha += retardoReenvio(arbol.getRightChild());
			}
		}
		return Math.max(retardoIzquierda, retardoDerecha) + arbol.getData();
	}


    public Integer retardoReenvio(BinaryTree<Integer> arbol){

        Integer total=0;
        int izquierda=0; 
        int derecha=0;

        total=retardoReenvio2(arbol);
        
        return total;
    }


}
