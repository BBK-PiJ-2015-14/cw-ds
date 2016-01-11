/**
 * Created by piotrek on 11/01/2016.
 */
public class SampleableListImpl extends ArrayList implements SampleableList {
    public SampleableListImpl() {
        super();
    }

    @Override
    public SampleableList sample() {
        SampleableListImpl sli = new SampleableListImpl();
        int i = 0;
        while (i < this.size()){
            sli.add(this.get(i).getReturnValue());
            i = i + 2;
        }
        return sli;
    }
}
