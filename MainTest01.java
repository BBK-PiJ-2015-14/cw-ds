/**
 * Created by piotrek on 10/01/2016.
 */
public class MainTest01 {

    public static void main(String[] args){
        ArrayList arList = new ArrayList();
        ReturnObject r = null;

        System.out.println("\nArrayList >> Adding string '7' to list at Index '0'");
        r = arList.add (0,"7");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Adding string '1' to list");
        r = arList.add ("1");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Adding string 'null' to list");
        r = arList.add (null);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Adding string '2' to list");
        r = arList.add ("2");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Adding string '3' to list");
        r = arList.add ("3");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Get Invalid Index '-1'");
        r = arList.get (-1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nArrayList >> Get Invalid Index '3'"); //should fail, there is only 0,1,2 in existence
        r = arList.get (3);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nArrayList >> Get Last Index '2'"); //should be ok, and have value of 3
        r = arList.get (2);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nArrayList >> Get First Index '0'"); //should be ok, and have value of 1
        r = arList.get (0);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nArrayList >> Adding string '4' to list at Index '2'");
        r = arList.add (2,"4");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Adding string '5' to list at Index '0'");
        r = arList.add (0,"5");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Adding string '6' to list");
        r = arList.add ("6");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }


        System.out.println("\nArrayList >> Remove at 1");
        r = arList.remove (1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 1");
        r = arList.remove (1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 1");
        r = arList.remove (1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 1");
        r = arList.remove (1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 1");
        r = arList.remove (1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 1");
        r = arList.remove (1);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 0");
        r = arList.remove (0);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }

        System.out.println("\nArrayList >> Remove at 0");
        r = arList.remove (0);
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());
        System.out.println("ArrayList >> IsEmpty >> " + arList.isEmpty());
        System.out.println("ArrayList >> Size    >> " + arList.size());

        System.out.println("\nArrayList >> Iterate:");
        for (int i = 0; i <= arList.size()-1; i++){
            System.out.println("ArrayList >> List Elements >> " + arList.get(i).getReturnValue());
        }



    }
}
