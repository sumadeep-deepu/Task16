import java.util.LinkedList;;

public class SwapLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        System.out.println(linkedList);

        int index1=1;
        int index2=2;

        if(index1>=0 && index1<linkedList.size() && index2>=0 && index2<linkedList.size()){
             String element1=linkedList.get(1);
             String element2=linkedList.get(2);

              linkedList.set(1, element2);
              linkedList.set(2, element1);
              System.out.println(linkedList);
        }
        else{
            System.out.println("invalid please try again");
        }
    }
    
}
