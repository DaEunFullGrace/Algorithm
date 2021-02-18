public class BinarySearchTree {

    public Node root;
    public int numberOfNode;

    public BinarySearchTree(){
        this.root = null;
        this.numberOfNode = 0;
    }

    public void insert(int newItem){

        Node newNode = new Node(null, newItem, null);

        if(isEmpty()){
            root = newNode;
        }else{
            insert(newItem, root);
        }

        numberOfNode++;
    }

    private void insert(int newItem, Node node){

        if(node.getItem() < newItem){

            if(node.getRight() != null){

                insert(newItem, node.getRight());

            } else {

                Node newNode = new Node(null, newItem, null);
                node.setRight(newNode);

            }

        } else if(node.getItem() > newItem) {

            if(node.getLeft() != null){

                insert(newItem, node.getLeft());

            } else {

                Node newNode = new Node(null, newItem, null);
                node.setLeft(newNode);

            }

        } else {

            System.out.println("Same Value is Already initialized!");

        }
    }

    public void delete(int target){

        //삭제할 요소 찾기 및 삭제
        if(!isEmpty())
            root = delete(root, target);
        else
            System.out.println("error in deleting : list is empty");
    }

    private Node delete(Node node, int target){

        if(target < node.getItem()) {

            node.setLeft(delete(node.getLeft(), target));

        } else if(target > node.getItem()) {

            node.setRight(delete(node.getRight(), target));

        } else {

            if((node.getLeft() == null) && (node.getRight() == null)) {

                return null;

            } else if((node.getLeft() != null) && (node.getRight() == null)) {

                Node child = node.getLeft();
                node = null;

                return child;

            } else if((node.getLeft() == null) && (node.getRight() != null)) {

                Node child = node.getRight();
                node = null;

                return child;

            } else {

                int minValue = findMin(node.getRight());

                node.setItem(minValue);
                node.setRight(delete(node.getRight(), minValue));

            }

        }

        return node;
    }

    public void inOrder(Node node){

        if(node != null){
            inOrder(node.getLeft());
            System.out.print(node.getItem() + " => ");
            inOrder(node.getRight());
        }

    }

    private boolean isEmpty(){
        return (root == null);
    }

    public int findMin(){
        return findMin(root);
    }

    private int findMin(Node node){

        if(node.getLeft() == null){
            return node.getItem();
        } else {
            return findMin(node.getLeft());
        }

    }

}
