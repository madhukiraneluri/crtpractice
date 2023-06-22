import java.util.Arrays;

class anagram
{
    static boolean isAnagram(String a,String b)
    {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
        return false;
        char ac[]=a.toCharArray();
        char bc[]=b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        int i=0;
        while(i<a.length())
        {
            if(ac[i]!=bc[i])
            return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        String a="madhu";
        String b="mad";
        System.out.println(isAnagram(a,b));
    }
}