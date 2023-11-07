import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListImp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        LinkedList<String> linkedList=new LinkedList<>();

        while (true) {
            System.out.println("enter the string or (exit to stop) ");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("quit")){
                break;
            }
            linkedList.add(input);
        }
        sc.close();

        System.out.println(linkedList);

        linkedList.clear();
       
        System.out.println("After Clearing : "+ linkedList);

    }
}