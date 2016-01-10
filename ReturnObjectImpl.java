/**
 * Created by piotrek on 10/01/2016.
 */
public class ReturnObjectImpl implements ReturnObject{

    public ReturnObjectImpl() {
    }

    @Override
    public boolean hasError() {
        return false;
    }

    @Override
    public ErrorMessage getError() {
        return null;
    }

    @Override
    public Object getReturnValue() {
        return null;
    }
}
