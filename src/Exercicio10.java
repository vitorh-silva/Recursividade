public class Exercicio10 {
    public static boolean isPalindromo(String palavra) {
        if (palavra.length() <= 1) {
            return true;
        }

        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(palavra.length() - 1);

        if (primeiraLetra != ultimaLetra) {
            return false;
        }

        String miolo = palavra.substring(1, palavra.length() - 1);

        return isPalindromo(miolo);
    }

    static void main(String[] args) {
        String palavra1 = "radar";
        String palavra2 = "java";
        System.out.println(isPalindromo(palavra1));
        System.out.println(isPalindromo(palavra2));
    }
}
