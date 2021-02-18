public class Main {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.delete(30);

        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(10);
        bst.insert(25);
        bst.insert(35);

        bst.inOrder(bst.root);
        System.out.println();

        bst.delete(30);

        bst.inOrder(bst.root);

    }
}
