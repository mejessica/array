
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class array2 {
	public static void main (String[] args) {
		List<String>ListaAluno = new ArrayList<String>();
		ListaAluno.add("a");
		ListaAluno.add("b");
		ListaAluno.add("c");
		ListaAluno.add("d");
		ListaAluno.add("e");
		System.out.println(ListaAluno);
		Collections.sort(ListaAluno);
		System.out.println(ListaAluno);
	}
}
