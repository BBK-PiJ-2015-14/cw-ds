/**
 * Created by piotrek on 11/01/2016.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
    public FunctionalLinkedList() {
        super();
    }

    @Override
    public ReturnObject head() {
        if (this.size() == 0){
            return new ReturnObjectImpl(true, ErrorMessage.EMPTY_STRUCTURE, null);
        }
        else {
            //valid path, valid range
            return this.get(0);
        }
    }

    @Override
    public FunctionalList rest() {
        FunctionalList flList = new FunctionalLinkedList();
        for (int i = 1; i < this.size(); i++){
            flList.add (super.get(i).getReturnValue());
        }
        return flList;
    }
}
