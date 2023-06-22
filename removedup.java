import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class removedup {
    public static void main(String[] args) {
        String str="aeeabcddf";
        Set<Character> set = new LinkedHashSet<>();//doesnt sort
        //Set<Character> set = new HashSet<>();//to sort
       char[] s=str.toCharArray();
        for(Character i :s)
        {
            set.add(i);
        }
        for(Character i : set)
        {
            System.out.print(i);
        }
    }
}
