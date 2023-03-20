import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Diego");
        aluno.put("Idade", "34");
        aluno.put("Media", "9.5");
        aluno.put("Turma", "3A");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Bia");
        aluno2.put("Idade", "23");
        aluno2.put("Media", "10");
        aluno2.put("Turma", "1A");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Idade"));

    }
}
