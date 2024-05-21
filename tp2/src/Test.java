public class Test{
    public static void main (String[]args){
        RedBinariaLlena red = new RedBinariaLlena();

        ProfundidadDeArbolBinario prof = new ProfundidadDeArbolBinario();


        BinaryTree <Integer> tree1 = new BinaryTree <Integer> (1);
        BinaryTree <Integer> tree2= new BinaryTree <Integer> (2);
        BinaryTree <Integer> tree3 = new BinaryTree <Integer> (3);
        BinaryTree <Integer> tree4= new BinaryTree <Integer> (4);
        BinaryTree <Integer> tree5 = new BinaryTree<Integer> (5);
        BinaryTree <Integer> tree6 = new BinaryTree <Integer> (6);
        BinaryTree <Integer> tree7 = new BinaryTree <Integer> (7);
        tree1.addLeftChild(tree2);
        tree1.addRightChild(tree3);
        tree2.addLeftChild(tree4);
        tree2.addRightChild(tree5);
        tree3.addLeftChild(tree6);
        tree5.addLeftChild(tree7);    
        prof.setArbol(tree1);         
        tree1.imprimirPreorden();
        System.out.println("----------");
        //tree1.espejo().imprimirPreorden();

        System.out.println(prof.imprimirPorNiveles(1)); 

    }
}