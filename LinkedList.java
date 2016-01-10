/**
 * Created by Peter Styk on 10/01/2016.
 * LinkedList List implementation with First and no Last
 * First Node is a placeholder and never holds a value.
 */
public class LinkedList implements List {
    private Node first;
    private int addedElementsCount;

    public LinkedList() {
        this.first = new Node(null);
        this.addedElementsCount = 0;
    }

    @Override
    public ReturnObject add(Object item) {
        if (item == null) {
            //invalid path
            return new ReturnObjectImpl(true, ErrorMessage.INVALID_ARGUMENT, null);
        }
        else {
            Node node = this.first;
            while(node.getNextNode() != null) {
                node = node.getNextNode();
            }
            node.setNextNode(new Node (item));
            this.addedElementsCount++;
            return new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, null);
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.addedElementsCount > 0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public int size() {
        return this.addedElementsCount;
    }

    @Override
    public ReturnObject get(int index) {
        return null;
    }

    @Override
    public ReturnObject remove(int index) {
        return null;
    }

    @Override
    public ReturnObject add(int index, Object item) {
        return null;
    }





    private class Node {
        private Node nextNode;
        private Object o;

        //constructors
        public Node(Object o) {
            nextNode = null; //end of the link
            this.o = o;
        }

        public Node(Object o, Node nextNode) {
            this.nextNode = nextNode; //we have link to follow
            this.o = o;
        }

        //node iterators
        public Node getNextNode() {
            return this.nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        //node value property get/set pairs
        public Object getObject() {
            return this.o;
        }

        public void setObject(Object o) {
            this.o = o;
        }
    }
}