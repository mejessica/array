import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaCarro {

    public static void main (String[] args){
        List<String>ListaCarro = new ArrayList<String>();
        ListaCarro.add("Fox");
        ListaCarro.add("Jeep");
        ListaCarro.add("Sandero");
        ListaCarro.add("Corsa");
        ListaCarro.add("Suv");
        System.out.println(ListaCarro);
        Collections.sort(ListaCarro);
        System.out.println(ListaCarro);

    }
}
