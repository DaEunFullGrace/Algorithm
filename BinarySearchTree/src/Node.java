public class Node {

    private int item;	//현재 노드의 필드
    private Node leftLink;	//현재 왼쪽 자식
    private Node rightLink;	//현재 오른쪽 자식

    //필드와 자식을 매개변수로 받아 생성자를 통해 설정함
    public Node(Node leftLink, int item, Node rightLink){
        this.item = item;
        this.leftLink = leftLink;
        this.rightLink = rightLink;
    }

    public Node(){
        this.leftLink = null;
        this.rightLink = null;
        this.item = 0;
    }

    //노드의 필드를 받는 함수
    public int getItem(){
        return this.item;
    }

    //왼쪽 자식을 받아오는 함수
    public Node getLeft(){
        return this.leftLink;
    }

    //오른쪽 자식을 받아오는 함수
    public Node getRight(){
        return this.rightLink;
    }

    //노드의 필드를 설정하는 함수
    public void setItem(int item){
        this.item = item;
    }

    //왼쪽 자식을 설정하는 함수
    public void setLeft(Node leftLink){
        this.leftLink = leftLink;
    }

    //오른쪽 자식을 설정하는 함수
    public void setRight(Node rightLink){
        this.rightLink = rightLink;
    }
}
