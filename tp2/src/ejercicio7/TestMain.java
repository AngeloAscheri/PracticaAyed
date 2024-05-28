package ejercicio7;

import ejercicio1.BinaryTree;

public class TestMain {


    public static void main (String[]args){

        BinaryTree <Integer> tree2 = new BinaryTree <Integer> (2);
        BinaryTree <Integer> tree7= new BinaryTree <Integer> (7);
        BinaryTree <Integer> tree5 = new BinaryTree <Integer> (5);
        BinaryTree <Integer> tree23= new BinaryTree <Integer> (23);
        BinaryTree <Integer> tree6 = new BinaryTree<Integer> (6);
        BinaryTree <Integer> tree19 = new BinaryTree <Integer> (19);
        BinaryTree <Integer> tree3= new BinaryTree <Integer> (3);
        BinaryTree <Integer> tree55 = new BinaryTree <Integer> (55);
        BinaryTree <Integer> tree11= new BinaryTree <Integer> (11);
        BinaryTree <Integer> tree4 = new BinaryTree<Integer> (4);
        BinaryTree <Integer> tree18 = new BinaryTree<Integer> (18);

        tree6.addLeftChild(tree55);
        tree6.addRightChild(tree11);
        tree23.addLeftChild(tree3);
        tree7.addLeftChild(tree23);        
        tree7.addRightChild(tree6);        
        tree4.addLeftChild(tree18);
        tree19.addRightChild(tree4);
        tree5.addLeftChild(tree19);        
        tree2.addLeftChild(tree7);
        tree2.addRightChild(tree5);


        ParcialArboles parcial = new ParcialArboles();

        parcial.set(tree2);

        System.out.println(parcial.isLeftTree(3));


    }
}
