import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Preamble{

    public static void main(String[] args){
        String[] words = {"Aaaa", "Aa","Aaaabbba","Aaa","AaaCCdda","ggggg","ddghdfsa","Aaaa","A"};

        Arrays.sort(words, (String s1, String s2) -> s1.length() - s2.length());
        System.out.println("Sorted by lenght in Ascending..: ");
        try{
        System.out.println(Arrays.asList(words));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We only have 9 words in array");
        }
    }

    /*public List<String> sortStringList(List<String> alist, Comparator comparator){
        String temp = null;
        for(int i = 0; i < alist.size()-1; i++){
            if (alist[i].length() > alist[i+1].length()){

               

            }
        }
        return alist;
    }
*/

    


}