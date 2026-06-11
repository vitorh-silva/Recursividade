public class Exercicio2 {
    static void main(String[] args) {
        int resultado = somaRecursiva(5);
        System.out.println("Soma: " + resultado);
    }

    public static int somaRecursiva(int n){
        if (n == 0) return 0;
        return n +  somaRecursiva(n - 1);
    }
}
