/**
 * Created by piotrek on 10/01/2016.
 */
public class MainTest01 {
    public static void main(String[] args){
        ArrayList arList = new ArrayList();
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Adding string '1' to list");
        ReturnObject returnObject = arList.add ("1");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + returnObject.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + returnObject.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + returnObject.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

    }
}
