/**
 * Created by piotrek on 10/01/2016.
 */
public class MainTest01 {

    public static void main(String[] args){
        ReturnObject r = null;


        ArrayList arList = new ArrayList();

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









        LinkedList lList = new LinkedList();

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Add '0'");
        r = lList.add(new String("0"));
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Add '1'");
        r = lList.add("1");
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Iterate:");
        for (int i = 0; i <= lList.size()-1; i++){
            System.out.println("LinkedList >> List Elements >> " + lList.get(i).getReturnValue());
        }

        System.out.println("\nLinkedList >> Add '55' at 1");
        r = lList.add(1,"55");
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Add '66' at 1");
        r = lList.add(1,"66");
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Iterate:");
        for (int i = 0; i <= lList.size()-1; i++){
            System.out.println("LinkedList >> List Elements >> " + lList.get(i).getReturnValue());
        }

        System.out.println("\nLinkedList >> Remove at index '2'");
        r = lList.remove(2);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Iterate:");
        for (int i = 0; i <= lList.size()-1; i++){
            System.out.println("LinkedList >> List Elements >> " + lList.get(i).getReturnValue());
        }

        System.out.println("\nLinkedList >> Get at index '0'");
        r = lList.get(0);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Add '1'");
        r = lList.add("1");
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Add '2'");
        r = lList.add("2");
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Remove at index '1'");
        r = lList.remove(1);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Remove at index '1'");
        r = lList.remove(1);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Remove at index '0'");
        r = lList.remove(0);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Remove at index '0'");
        r = lList.remove(0);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> IsEmpty >> " + lList.isEmpty());
        System.out.println("LinkedList >> Size    >> " + lList.size());

        System.out.println("\nLinkedList >> Iterate:");
        for (int i = 0; i <= lList.size()-1; i++){
            System.out.println("LinkedList >> List Elements >> " + lList.get(i).getReturnValue());
        }

        System.out.println("\nLinkedList >> Get at index '1'");
        r = lList.get(1);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Get at index '-1'");
        r = lList.get(-1);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Get at index '2'");
        r = lList.get(2);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Get at index '0'");
        r = lList.get(0);
        System.out.println("LinkedList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("LinkedList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("LinkedList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());




        FunctionalArrayList faList = new FunctionalArrayList();

        System.out.println("\nFunctionalArrayList >> Adding string '000' to list");
        r = faList.add ("000");
        System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        //System.out.println("\nFunctionalArrayList >> Adding string '111' to list");
        //r = faList.add ("111");
        //System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        //System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        //System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        //System.out.println("\nFunctionalArrayList >> Adding string '222' to list");
        //r = faList.add ("222");
        //System.out.println("ArrayList >> Inspect Return Object >> HasError()     >> " + r.hasError());
        //System.out.println("ArrayList >> Inspect Return Object >> ErrorMessage() >> " + r.getError());
        //System.out.println("ArrayList >> Inspect Return Object >> Object()       >> " + r.getReturnValue());

        System.out.println("\nLinkedList >> Iterate:");
        for (int i = 0; i <= faList.size()-1; i++){
            System.out.println("LinkedList >> List Elements >> " + faList.get(i).getReturnValue());
        }





        System.out.println("\nFunctionalArrayList >> FunctionalList()");
        FunctionalList fl = faList.rest();

        System.out.println("\nFunctionalArrayList >> Iterate:");
        for (int i = 0; i <= fl.size()-1; i++){
            System.out.println("FunctionalArrayList >> List Elements >> " + fl.get(i).getReturnValue());
        }


    }
}
