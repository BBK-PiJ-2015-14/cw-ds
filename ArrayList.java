/**
 * Created by Peter Styk on 10/01/2016.
 * ArrayList will auto grow/shrink based on add and remove method triggers.
 * list init is maintained such as there is always one and only one slot available for new entry.
 * once slot is filled with add or shrunk with remove, array is re-initialized
 */
public class ArrayList implements List {
    private Object[] arrayList;
    private int numberOfAddedElements; //confirmed number of added elements

    public ArrayList() {
        this.numberOfAddedElements = 0;
        this.arrayList = new Object[1];
    }

    @Override
    public boolean isEmpty() {
        if (this.numberOfAddedElements > 0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public int size() {
        return this.numberOfAddedElements;
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
        //If add success, increment actual item counter.
        this.numberOfAddedElements++;
        return null;
    }

    @Override
    public ReturnObject add(Object item) {
        //Add to list
        this.arrayList[this.numberOfAddedElements] = item;

        //ReDimension


        //If add success, increment actual item counter.
        this.numberOfAddedElements++;
        return new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, null);
    }
}
