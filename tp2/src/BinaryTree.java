public class BinaryTree <T> {

    private T data;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;


    public BinaryTree() {
        super();
    }

    public BinaryTree(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    /**
     * Preguntar antes de invocar si hasLeftChild()
     * @return
     */
    public BinaryTree<T> getLeftChild() {
        return leftChild;
    }
    /**
     * Preguntar antes de invocar si hasRightChild()
     * @return
     */
    public BinaryTree<T> getRightChild() {
        return this.rightChild;
    }

    public void addLeftChild(BinaryTree<T> child) {
        this.leftChild = child;
    }

    public void addRightChild(BinaryTree<T> child) {
        this.rightChild = child;
    }

    public void removeLeftChild() {
        this.leftChild = null;
    }

    public void removeRightChild() {
        this.rightChild = null;
    }

    public boolean isEmpty(){
        return (this.isLeaf() && this.getData() == null);
    }

    public boolean isLeaf() {
        return (!this.hasLeftChild() && !this.hasRightChild());

    }

    public boolean hasLeftChild() {
        return this.leftChild!=null;
    }

    public boolean hasRightChild() {
        return this.rightChild!=null;
    }
    @Override
    public String toString() {
        return this.getData().toString();
    }

    public  int contarHojas() {
        int hojas =0;
        if (this.isLeaf()){
            return 1;
        }

        if (this.hasLeftChild()){
            hojas+=this.getLeftChild().contarHojas();
        }

        if (this.hasRightChild()){
            hojas+=this.getRightChild().contarHojas();
        }
        return hojas;
    }

    public void imprimirPreorden (){
        System.out.println(this.getData());
        if (this.hasLeftChild()){
            this.getLeftChild().imprimirPreorden();
        }
        if(this.hasRightChild()){
            this.getRightChild().imprimirPreorden();
        }
    }

    public void imprimirPostorden(){
        if(this.hasLeftChild()){
            this.getLeftChild().imprimirPostorden();
        }
        if(this.hasRightChild()){
            this.getRightChild().imprimirPostorden();
        }
        System.out.println(this.getData());

    }

    public void imprimirEnorden(){
        if(this.hasLeftChild()){
            this.getLeftChild().imprimirEnorden();
        }
        System.out.println(this.getData());
        if(this.hasRightChild()){
            this.getRightChild().imprimirEnorden();
        }
    }

    public BinaryTree<T> espejo() {
        if(this.isEmpty()){
            return new BinaryTree<T>();
        }
        else{
            BinaryTree<T> arbolespejo = new BinaryTree<T>(this.getData());
            if (this.hasLeftChild())
                arbolespejo.addRightChild(this.getLeftChild().espejo());
            if (this.hasRightChild())
                arbolespejo.addLeftChild(this.getRightChild().espejo());
            return arbolespejo;
        }
    }


    // 0<=n<=m
    public void entreNiveles(int n, int m){







    }

}
