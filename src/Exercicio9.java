public class Exercicio9 {
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        }
        return 1 + contarDigitos(numero / 10);
    }

    static void main(String[] args) {
        int numero = 54321;
        System.out.println(contarDigitos(numero));
    }
}
