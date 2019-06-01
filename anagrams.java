import java.util.*;

public class anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<TreeSet, ArrayList<String>> anagrams = new HashMap<TreeSet, ArrayList<String>>();

        while (true) {
            System.out.print("Insira um nome na lista (-1 para encerrar): ");
            String word = sc.nextLine();
            if (word.equals("-1"))
                break;
            TreeSet<String> key = new TreeSet<String>();

            for (char x : word.toCharArray()) {
                key.add(String.valueOf(x));
            }

            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<String>());
            }
            anagrams.get(key).add(word);
        }
        System.out.println("\n ######## RESULTADO ########");

        for (Map.Entry<TreeSet, ArrayList<String>> anagram : anagrams.entrySet()) {
            System.out.println("ANAGRAMA: " + anagram.getKey());
            for (String name : anagram.getValue()) {
                System.out.println(name);
            }
            System.out.println("===============================");
        }

    }
}