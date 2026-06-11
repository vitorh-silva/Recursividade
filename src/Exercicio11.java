import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        List<List<Integer>> grafo = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            grafo.add(new ArrayList<>());
        }

        // A conectado a B e C
        grafo.get(0).add(1);
        grafo.get(0).add(2);

        // B conectado a A e D
        grafo.get(1).add(0);
        grafo.get(1).add(3);

        // C conectado a A e D
        grafo.get(2).add(0);
        grafo.get(2).add(3);

        // D conectado a B e C
        grafo.get(3).add(1);
        grafo.get(3).add(2);

        boolean[] visitados = new boolean[4];
        percorrerGrafo(grafo, 0, visitados);
    }

    public static void percorrerGrafo(List<List<Integer>> grafo, int noAtual, boolean[] visitados) {
        visitados[noAtual] = true;
        char nomeNo = (char) ('A' + noAtual);
        System.out.println("Visitando nó: " + nomeNo);

        for (int vizinho : grafo.get(noAtual)) {
            if (!visitados[vizinho]) {
                percorrerGrafo(grafo, vizinho, visitados);
            }
        }
    }
}
