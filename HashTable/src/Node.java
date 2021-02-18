public class Node<E1,E2> {

    private E1 key;
    private E2 content;

    public Node(E1 key, E2 content) {
        this.key = key;
        this.content = content;
    }

    public E1 getKey() {
        return key;
    }

    public void setKey(E1 key) {
        this.key = key;
    }

    public E2 getContent() {
        return content;
    }

    public void setContent(E2 content) {
        this.content = content;
    }
}
