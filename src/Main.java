import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {

            AnagramDic dic = new AnagramDic(args[1]);
//            System.out.println(dic.getDictionary());
        System.out.println("The anagrams of "+args[0]+" are :");
            System.out.println(dic.getAnagramsOf(args[0]));

    }
}
