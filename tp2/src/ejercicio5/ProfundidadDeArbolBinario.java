import Pila.Queue;

public class ProfundidadDeArbolBinario {

    public BinaryTree<Integer> tree;

    public void setArbol(BinaryTree<Integer> a){
        this.tree=a;
    }

    public void imprimirPorNiveles() {
		BinaryTree<Integer> arbol = this.tree;
		BinaryTree<Integer> marcaNivel = new BinaryTree<Integer>(-1);
		Queue <BinaryTree<Integer>> cola = new Queue <BinaryTree<Integer>>();
		cola.enqueue(tree);
		cola.enqueue(marcaNivel);
		while (!cola.isEmpty()) {
			arbol=cola.dequeue();
			if (arbol.getData()!=-1) {
                	System.out.println(arbol.getData());
				if (arbol.hasLeftChild()){
					cola.enqueue(arbol.getLeftChild());}
				if (arbol.hasRightChild()){
					cola.enqueue(arbol.getRightChild());}
			} else {
                if (!cola.isEmpty()){  
				    cola.enqueue(marcaNivel);}
            }
		}
	}

     
    public int entreNiveles(int n, int m){
		BinaryTree<Integer> arbol = tree;
		BinaryTree<Integer> marcaNivel = new BinaryTree<Integer>(-1);
		Queue <BinaryTree<Integer>> cola = new Queue <BinaryTree<Integer>>();
		cola.enqueue(tree);
		cola.enqueue(marcaNivel);
		int niv =0 , tot=0;		
		while (!cola.isEmpty()) {
			arbol=cola.dequeue();
			if (arbol.getData() != -1) {
                if (niv>=n && niv < m){
                    tot+=arbol.getData();
                }
				if (arbol.hasLeftChild())
					cola.enqueue(arbol.getLeftChild());
				if (arbol.hasRightChild())
					cola.enqueue(arbol.getRightChild());
			} else {				
                    niv++;
                if (!cola.isEmpty()) { 
				    cola.enqueue(marcaNivel);
				}
            }
		}	
		return tot;	
	} 


}
