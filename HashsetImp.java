import java.util.HashSet;
public class HashsetImp {
    public static void main(String[] args) {
        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("a");
        hashSet1.add("b");
        hashSet1.add("c");
        hashSet1.add("d");

        System.out.println(hashSet1);

        HashSet<String> hashSet2=new HashSet<>();
        hashSet2.addAll(hashSet1);
        System.out.println(hashSet2);

        for(String h :hashSet1){
            System.out.println(h);
        }

        HashSet<String> hashSet3= new HashSet<>(hashSet1);
        System.out.println(hashSet3);

    }
    
}
