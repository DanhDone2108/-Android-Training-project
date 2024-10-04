import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static <T> void printLits(List<T> list  ) {
        for (T obj : list) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        System.out.println("Integer list");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("String list");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println(list2);
    }
}

