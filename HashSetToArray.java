
import java.util.*;
public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");

        String[] array=new String[hs.size()];
        hs.toArray(array);
        
        System.out.println(array);

        System.out.println(Arrays.toString(array));
        
    }
    
}
