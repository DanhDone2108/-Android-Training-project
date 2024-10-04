import java.util.ArrayList;
public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.remove("Banana");
        System.out.println("List Array");
        for (String lists : list) {
            System.out.println(lists);
        }
    }
}
