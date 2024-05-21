public class ProfundidadDeArbolBinario {

    public BinaryTree<Integer> tree;

    public void setArbol(BinaryTree<Integer> a){
        this.tree=a;
    }

    public int imprimirPorNiveles(int n) {
		BinaryTree<Integer> arbol = tree;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		cola.enqueue(tree);
		cola.enqueue(null);
        int niv =0 , tot=0;		
		while (!cola.isEmpty()) {
			arbol=cola.dequeue();
			if (arbol != null) {
                if (niv==n){
                    tot+=arbol.getData();
                }
				if (arbol.hasLeftChild());
					cola.enqueue(arbol.getLeftChild());
				if (arbol.hasLeftChild());
					cola.enqueue(arbol.getRightChild());
			} else {
                 if (!cola.isEmpty()) {
                    niv++;
				    cola.enqueue(null);
			}
            }
		}
        return tot;
	}

    
    public void entreNiveles(int n, int m){
		ArbolBinario<T> arbol=null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nivel=0;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esvacia() && nivel <=m) {
			arbol=cola.desencolar();
			if(arbol!=null) {
				if(nivel>=n && nivel <=m)
					System.out.println(arbol.getDato());
				if(arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			}
			else if (!cola.esvacia()) {
				System.out.println();
				cola.encolar(null);
				nivel++;
			}
		}		
	}


}
