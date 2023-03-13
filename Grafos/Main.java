import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Deque<Integer> deck = new ArrayDeque<>();

        int n = inputs.nextInt();
        int q = inputs.nextInt();

        for (int i = 0; i < n; i++)
            deck.add(inputs.nextInt());

        for (int i = 0; i < q; i++){
            int aux = inputs.nextInt();
            ArrayList<Integer> deck2 = new ArrayList<>(deck);
            System.out.println(deck2.indexOf(aux) + 1);
            deck.remove(aux);
            deck.addFirst(aux);
        }
        inputs.close();
    }
}
